package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import GUI.GraphData;
import models.Statement;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.BoolExpr;
import models.expressions.Bracket;
import models.expressions.Division;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.ListExpr;
import models.expressions.LogicalOperator;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.ReactionExpr;
import models.expressions.RelationalOperator;
import models.expressions.Scope;
import models.expressions.SsaAlg;
import models.expressions.Subtraction;
import models.expressions.Variable;
import models.expressions.WhileStatement;
import GillespieSSA.*;
import SymbolTable.Identifier;
import SymbolTable.SymbolTableController;

public class ExpressionProcessor {
	private List<Statement> _list;
	private List<String> _evaluations = new ArrayList<>();
	private List<GraphData> _graphs = new ArrayList<GraphData>();
	private SymbolTableController symbolTable = SymbolTableController.GetInstance();
	
	public ExpressionProcessor(List<Statement> list, List<String> evaluations, List<GraphData> graphs) {
		_list = list;
		_evaluations = evaluations;
		_graphs = graphs;
	}
	
	public ExpressionProcessor(List<Statement> list) {
		_list = list;
	}
	
	public List<String> ProcessStatements() {
		symbolTable.OpenScope();
		
		for (Statement e : _list) {
			if (e instanceof VariableDeclaration) {
				VariableDeclaration decl = new VariableDeclaration((VariableDeclaration) e);
				
				if(decl.type.equals("bool")) {
					// Evaluate predicates in bool declarations
					boolean boolValue = EvaluatePredicate(decl.value);
					decl.value = new BoolExpr(String.valueOf(boolValue));
					
				} else if(!(decl.value instanceof Number)) {
					String stringValue = String.valueOf(EvaluateExpression(decl.value));
					decl.value = new Number(stringValue);
				}	
				
				symbolTable.EnterSymbol(new Identifier(decl.id, decl)); 
			}
			else if (e instanceof ListDeclaration) {
				ListDeclaration listDecl = (ListDeclaration) e;
				symbolTable.EnterSymbol(new Identifier(listDecl.id, listDecl)); 
			} 
			else if (e instanceof SsaAlg) {
				SsaAlg ssa = (SsaAlg) e;	
				int repeats = 1;
				
				if (ssa.repeats != null) {
					repeats = (int) EvaluateExpression(ssa.repeats);
				}
				
				MeanGraph meanGraph = new MeanGraph();
				
				while (repeats > 0) {				
					List<StateSet> ssaResults = getSsaResults(ssa);
					meanGraph.createMeanList(ssaResults);		
					repeats--;
				}
				
				UpdateGraphs(meanGraph.gd);
			}
			else if (e instanceof IfStatement) {
				IfStatement ifStmt = (IfStatement) e;
				
				if (EvaluatePredicate(ifStmt.getPredicate())) {
					ProcessScope((Scope) ifStmt.getThenScope());
				} else  {
					ProcessScope((Scope) ifStmt.getElseScope());
				}
			}
			else if (e instanceof WhileStatement) {
				WhileStatement whileStmt = (WhileStatement) e;
			
				while(EvaluatePredicate(whileStmt.getPredicate())) {
					ProcessScope(whileStmt.getScope());	
				}
			}
			else {
				String input = e.toString();
				double result = EvaluateExpression(e);
				_evaluations.add(input + " = " + result);
			}
		}
		symbolTable.CloseScope();
		return _evaluations;
	}
	
	// Adds new graphs and updates duplicates
	private void UpdateGraphs(List<GraphData> graphs) {
		HashMap<String, Integer> names = new HashMap<String, Integer>();
		
		for (int i = 0; i < _graphs.size(); i++) {
			names.put(_graphs.get(i).Name, i);
		}
		for (GraphData gd : graphs) {
			if (names.containsKey(gd.Name)) {
				_graphs.set(names.get(gd.Name), gd);
			} else {
				_graphs.add(gd);
			}
		}
	}

	public List<GraphData> fetchGraphData() {
		return _graphs;
	}
			
	private void ProcessScope(Scope scope) {
		if(scope != null) {
			ExpressionProcessor ep = new ExpressionProcessor(scope.stmts, _evaluations, _graphs);
			ep.ProcessStatements();
		}
	}
	
	private double EvaluateExpression(Statement e) {
		if (e instanceof Number) {
			Number num = (Number) e;
			return Double.parseDouble(num.num);
		} 
		else if (e instanceof Variable) {
			Variable var = (Variable) e;
			Expression declExpr = symbolTable.RetrieveSymbol(var.ID).GetExpression();
			
			if (declExpr instanceof VariableDeclaration) {
				VariableDeclaration varDecl = (VariableDeclaration) declExpr;
				
				switch (varDecl.type) {
					case "bool":
						return EvaluatePredicate(varDecl.value) ? 1 : 0;
					default:
						return EvaluateExpression(varDecl.value);
				}
			} else {
				return 0;
			}
		}
		else if (e instanceof Bracket) {
			return EvaluateExpression(((Bracket) e).expr);
		}
		else if (e instanceof Addition) {
			Addition add = (Addition) e;
			double left = EvaluateExpression(add.left);
			double right = EvaluateExpression(add.right);
			return left + right;
		}
		else if (e instanceof Multiplication) {
			Multiplication add = (Multiplication) e;
			double left = EvaluateExpression(add.left);
			double right = EvaluateExpression(add.right);
			return left * right;
		}
		else if (e instanceof Division) {
			Division add = (Division) e;
			double left = EvaluateExpression(add.left);
			double right = EvaluateExpression(add.right);
			return left / right;
		}
		else if (e instanceof Subtraction) {
			Subtraction add = (Subtraction) e;
			double left = EvaluateExpression(add.left);
			double right = EvaluateExpression(add.right);
			return left - right;
		}
		
		return 0;
	}
	
	private boolean EvaluatePredicate(Expression p) {
		if (p instanceof Bracket) {
			return EvaluatePredicate(((Bracket) p).expr);
		}
		else if (p instanceof Variable) {
			Variable boolID = (Variable) p;	
			Expression declExpr = symbolTable.RetrieveSymbol(boolID.ID).GetExpression();
			
			if (declExpr instanceof VariableDeclaration) {
				VariableDeclaration varDecl = (VariableDeclaration) declExpr;
				
				switch (varDecl.type) {
					case "bool":
						return EvaluatePredicate(varDecl.value);
				}
			}
		}
		else if (p instanceof LogicalOperator) {
			LogicalOperator log = (LogicalOperator) p;
			boolean left = EvaluatePredicate(log.left);
			boolean right = EvaluatePredicate(log.right);
			
			switch(log.operator) {
				case "||" : 
					return left || right;
				case "&&" : 
					return left && right;
			}
		}
		else if (p instanceof RelationalOperator) {
			RelationalOperator rel = (RelationalOperator) p;
			double left = EvaluateExpression(rel.left);
			double right = EvaluateExpression(rel.right);
			
			switch(rel.operator) {
				case "<" : 
					return left < right;
				case "<=" : 
					return left <= right;
				case ">" : 
					return left > right;
				case ">=" : 
					return left >= right;
				case "==" : 
					return left == right;
				case "!=" : 
					return left != right;
			}
		}
		else if (p == null) { // Uninitialized check
			return false;
		}
		else if (p.toString().equals("true")) {
			return true;
		}
		else if (p.toString().equals("false")) {
			return false;
		}
		else if (p.toString().equals("random")) {
		    return new Random().nextBoolean();
		}
		
		return false;
	}

	private List<StateSet> getSsaResults(SsaAlg alg) {
		ListDeclaration solutionList = (ListDeclaration) symbolTable.RetrieveSymbol(alg.solution).GetExpression();
		Map<String, Double> solution = new HashMap<String,Double>();
		
		for (Expression l : solutionList.list) {
			VariableDeclaration num = (VariableDeclaration) l;
			Double value = EvaluateExpression(num.value);
			solution.put(num.id, value);
		}
		
		ListDeclaration reactionList = (ListDeclaration) symbolTable.RetrieveSymbol(alg.reacList).GetExpression();
		List<Reaction> reactions = new ArrayList<Reaction>();
		
		for (Expression r : reactionList.list) {
			ReactionExpr reacExpr = (ReactionExpr) r;
			
			ListExpr left = (ListExpr) reacExpr.left;
			List<ReactionPair> prey = new ArrayList<ReactionPair>();
			for (Expression p : left.list) {
				prey.add((ReactionPair) p);
			}
			
			ListExpr right = (ListExpr) reacExpr.right;
			List<ReactionPair> predator = new ArrayList<ReactionPair>();
			for (Expression p : right.list) {
				predator.add((ReactionPair) p);
			}
			
			Reaction reac = new Reaction(prey, predator, EvaluateExpression(reacExpr.constant));
			reactions.add(reac);
		}	
		
		Simulator s = new Simulator((int) EvaluateExpression(alg.loops), new StateSet(solution), reactions);
		return s.Simulate();
	}
}
