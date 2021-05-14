package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import GUI.GraphData;
import models.Statement;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.Bracket;
import models.expressions.Division;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.ListExpr;
import models.expressions.LogicalOperator;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.Print;
import models.expressions.ReactionExpr;
import models.expressions.RelationalOperator;
import models.expressions.Scope;
import models.expressions.SsaAlg;
import models.expressions.Subtraction;
import models.expressions.Variable;
import models.expressions.WhileStatement;
import GillespieSSA.*;

/*visitor pattern is a better choice to evaluate our data*/
public class ExpressionProcessor {
	private List<Statement> _list;
	private Map<String, Expression> _values;
	private List<String> _evaluations = new ArrayList<>();
  private List<List<GraphData>> graphs;
	
	public Map<String, Expression> getValues() {
		return _values;
	}
	
	public ExpressionProcessor(List<Statement> list, Map<String, Expression> values, List<String> evaluations) {
		_list = list;
		_values = values;
		_evaluations = evaluations;
	}
	
	public ExpressionProcessor(List<Statement> list) {
		_list = list;
		_values = new HashMap();
		_evaluations = new ArrayList<>();
	}
	
	public List<String> ProcessStatements() {
		
		for (Statement e : _list) {
			if (e instanceof VariableDeclaration) {
				VariableDeclaration decl = new VariableDeclaration((VariableDeclaration) e);
				
				if(!(decl.value instanceof Number)) {
					String stringValue = String.valueOf(EvaluateExpression(decl.value));
					decl.value = new Number(stringValue);
				}	
				
				_values.put(decl.id, decl);
			}
			else if (e instanceof ListDeclaration) {
				ListDeclaration listDecl = (ListDeclaration) e;
				_values.put(listDecl.id, listDecl);
			} 
			else if (e instanceof SsaAlg) {
				SsaAlg ssa = (SsaAlg) e;
				getSsaResults(ssa);
			}
			else if(e instanceof Print) {
				Print print = (Print) e;
				if(print.printExpression instanceof SsaAlg) {
					List<SSAResult> ssaResults = getSsaResults((SsaAlg) print.printExpression);
					graphs = new ArrayList<List<GraphData>>();
					int i = 0; 
					for(SSAResult result : ssaResults) {
						i++;
						graphs.add(generateSSAGraphs(result, i));
					}
					
					for(List<GraphData> iteration : graphs){
						for(GraphData graph : iteration) {
							evaluations.add(graph.toString());
						}
					}
					
					reactionSet.add(new stoichoReaction(prey, predator, EvaluateExpression(reac.constant), new StateSet(stateSet)));
				}		
				
				Simulator s = new Simulator((int) EvaluateExpression(ssa.loops), stateSet, reactionSet);
				List<StateSet> results = s.Simulate();
				MeanGraph Mean = new MeanGraph(results);
				Mean.createMeanList(results);
				System.out.println(Mean.gd);
				for(StateSet ss : results) {
					System.out.println("ss " + ss.species.toString() + " " + ss.time);
				}
			}
			else if (e instanceof IfStatement) {
				IfStatement ifStmt = (IfStatement) e;
				boolean condition = EvaluatePredicate(ifStmt.getPredicate());
				
				if (condition) {
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
		
		return _evaluations;
	}
	
	public List<List<GraphData>> fetchGraphData() {
		return graphs;
	}
			
	private void ProcessScope(Scope scope) {
		if(scope != null) {
			ExpressionProcessor ep = new ExpressionProcessor(scope.stmts, _values, _evaluations);
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
			Expression varDecl = _values.get(var.ID);
			
			if (varDecl instanceof VariableDeclaration) {
				return EvaluateExpression(((VariableDeclaration) varDecl).value);
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
		else if (p.toString().equals("true")) {
			return true;
		}
		else if (p.toString().equals("false")) {
			return false;
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
		
		return false;
	}

	private List<SSAResult> getSsaResults(SsaAlg alg) {
		ListDeclaration sol = (ListDeclaration) values.get(alg.solution);
		Map<String, Double> species = new HashMap<String,Double>();
		
		for(Expression l : sol.list) {
			VariableDeclaration num = (VariableDeclaration) l;
			Double value = getEvalResult(num.value);
			species.put(num.id, value);
		}
		StateSet stateSet = new StateSet(species, 0);
		
		ListDeclaration reactions = (ListDeclaration) values.get(alg.reacList);
		List<stoichoReaction> reactionSet = new ArrayList<stoichoReaction>();
		
		for(Expression r : reactions.list) {
			ReactionExpr reac = (ReactionExpr) r;
			
			ListExpr left = (ListExpr) reac.left;
			List<ReactionPair> prey = new ArrayList<ReactionPair>();
			for(Expression p : left.list) {
				prey.add((ReactionPair) p);
			}
			
			ListExpr right = (ListExpr) reac.right;
			List<ReactionPair> predator = new ArrayList<ReactionPair>();
			for(Expression p : right.list) {
				predator.add((ReactionPair) p);
			}
			
			reactionSet.add(new stoichoReaction(prey, predator, getEvalResult(reac.constant), new StateSet(stateSet)));
		}		
		
		Simulator s = new Simulator((int) getEvalResult(alg.loops), stateSet, reactionSet);
		return s.Simulate();
	}

	private List<GraphData> generateSSAGraphs(SSAResult result, int iteration) {
		List<GraphData> graphData = new ArrayList<GraphData>();
		for(String species : result.stateSets.get(0).species.keySet()) {
			graphData.add(new GraphData(species, iteration));
		}
		
		for(StateSet state : result.stateSets) {
			for(GraphData graph : graphData) {
				graph.add(state.species.get(graph.Name), state.time);
			}
		}
		
		return graphData;
		
	}
}
