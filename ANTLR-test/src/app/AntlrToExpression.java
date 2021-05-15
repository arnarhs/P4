package app;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import GillespieSSA.ReactionPair;
import antlr.expressionBaseVisitor;
import antlr.expressionParser.*;
import models.Statement;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.BoolExpr;
import models.expressions.Bracket;
import models.expressions.LogicalOperator;
import models.expressions.Division;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.ListExpr;
import models.expressions.RelationalOperator;
import models.expressions.Scope;
import models.expressions.SsaAlg;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.Print;
import models.expressions.ReactionExpr;
import models.expressions.Subtraction;
import models.expressions.Variable;
import models.expressions.WhileStatement;
 
public class AntlrToExpression extends expressionBaseVisitor<Expression> {
 
	private Map<String, String> vars = new HashMap<>(); //A map that stores all the declared variables and their types.
	private List<String> semanticErrors; //A list that stores all the semantic errors.

	public AntlrToExpression(List<String> semanticErrors) {
		this.semanticErrors = semanticErrors;
	}	
	
  @Override
	public Expression visitPrintExpr(PrintExprContext ctx) {
		return new Print(visit(ctx.getChild(2)));
	}
  
  
	/* Scope 
	 * 
	 */
	
	@Override
	public Expression visitScopeDecl(ScopeDeclContext ctx) {
		List<Statement> stmts = new ArrayList<Statement>();
		for(int i = 1; i < ctx.getChildCount() - 1; i++) {  // Visit every child but opening and closing brackets
			stmts.add(visit(ctx.getChild(i)));
		}
		
		return new Scope(stmts);
	}
	

	/* SSA CAll
   *
   */
	
  	@Override
	public Expression visitSsaAlg(SsaAlgContext ctx) {
		//[0][1] [2] [3][4] [5] [6]
		//ID '.' SSA '('ID ',' value')' 
		String solution = ctx.getChild(0).toString();
		String reactions = ctx.getChild(4).toString();
		Expression loops = visit(ctx.getChild(6));
		return new SsaAlg(solution, reactions, loops);
	}

  
  
	/* 
	 *  REACTIONS
	 */

	@Override
	public Expression visitReacDecl(ReacDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}
		
		if (vars.get(id) != null) {
			SemanticError(line, column, "reaction '" + id + "' already declared.");
		} else {
			vars.put(id, type);
		}

		return new VariableDeclaration(id, type, value);
	}
  
  @Override
	public Expression visitReacAssign(ReacAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		Expression value = visit(ctx.getChild(2));		
		
		if (vars.get(id) == null) {
			SemanticError(line, column, "attempting to assign to undeclared id '" + id + "'");
		}
		
		return new VariableDeclaration(id, vars.get(id), value);
	}
	
	@Override
	public Expression visitReactionExpression(ReactionExpressionContext ctx) {
		ListExpr left = (ListExpr) visit(ctx.getChild(0));
		ListExpr right = (ListExpr) visit(ctx.getChild(2));
		Expression constant = visit(ctx.getChild(4));
		return new ReactionExpr(left, right, constant);
	}
	
	@Override
	public Expression visitReactionPairList(ReactionPairListContext ctx) {
		ListExpr list = new ListExpr();
		Expression pair = visit(ctx.reacPair());
		list.Add(pair);		
		list.Combine((ListExpr) visit(ctx.reacPairList()));
		return list;
	}

	@Override
	public Expression visitReactionPairSingle(ReactionPairSingleContext ctx) {
		ListExpr list = new ListExpr();		
		list.Add(visitChildren(ctx));
		return list;
	}

	@Override
	public Expression visitReactionPairMultiplier(ReactionPairMultiplierContext ctx) {
		return new ReactionPair(ctx.ID().toString(), Integer.parseInt(ctx.NUM().toString()));
	}

	@Override
	public Expression visitReactionPair(ReactionPairContext ctx) {
		return new ReactionPair(ctx.ID().toString());
	}
	
	
	/*
	 *  NUMBERS (INT, DOUBLE & SPECIES)
	 */
 

	@Override
	public Expression visitNumDecl(NumDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}	
		
		if (vars.get(id) != null) {
			SemanticError(line, column, "variable '" + id + "' already declared.");
		//} else if(type.equals("int") && TryParseInt(value.toString()) == null) {
		//	SemanticError(line, column, value.toString() + " is not a valid " + type);
		} else {
			vars.put(id, type);
		}
		
		return new VariableDeclaration(id, type, value);
	}


	@Override
	public Expression visitNumberAssign(NumberAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		Expression value = visit(ctx.getChild(2));		
		
		if (vars.get(id) == null) {
			SemanticError(line, column, "attempting to assign to undeclared id '" + id + "'");
		}
		
		return new VariableDeclaration(id, vars.get(id), value);
	}
	

	//One reaction parameter

	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		return new Number(numText);
	}

  
  
	/*
	 *  LISTS
	 */

	@Override
	public Expression visitListDecl(ListDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		ListExpr reacParams = new ListExpr();
		
		if(ctx.getChildCount() > 2) {
			reacParams = (ListExpr) visit(ctx.reacParams());	
		}
		
		if (vars.get(id) != null) {
			SemanticError(line, column, "list '" + id + "' already declared.");
		} else {
			vars.put(id, type);
		}		
		 	
		return new ListDeclaration(id, type, reacParams.list);
	}
  
  	@Override
	public Expression visitListAssign(ListAssignContext ctx) {
  		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		ListExpr value = (ListExpr) visit(ctx.reacParams());		
		
		if (vars.get(id) == null) {
			SemanticError(line, column, "attempting to assign to undeclared id '" + id + "'");
		}
		
		return new ListDeclaration(id, vars.get(id), value.list);
	}
	
	//Multiple reaction parameters
	public ListExpr visitReactionParameters(ReactionParametersContext ctx) {
		ListExpr list = new ListExpr();
		Expression reac = visit(ctx.reacExpr());
		list.Add(reac);		
		list.Combine((ListExpr) visit(ctx.reacParams()));
		return list;
	}

	//One reaction parameter
	@Override
	public ListExpr visitReactionParameter(ReactionParameterContext ctx) {
		ListExpr list = new ListExpr();		
		list.Add(visitChildren(ctx));
		return list;
	}

	@Override
	public Expression visitSolutionDeclaration(SolutionDeclarationContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		ListExpr speciList = new ListExpr();
		
		
		if(ctx.getChildCount() > 2) {
			speciList = (ListExpr) visit(ctx.declList());
		}
		
		if (vars.get(id) != null) {
			SemanticError(line, column, "solution '" + id + "' already declared.");
		} else {
			vars.put(id, type);
		}
		
		return new ListDeclaration(id, type, speciList.list);
	}
	

	//Multiple declarations
	@Override
	public Expression visitSpeciesDecls(SpeciesDeclsContext ctx) {
		ListExpr list = new ListExpr();
		Expression reac = visit(ctx.numDecl());
		list.Add(reac);		
		list.Combine((ListExpr) visit(ctx.declList()));
		return list;
	}

	//One declaration of species
	@Override
	public Expression visitSpeciesDecl(SpeciesDeclContext ctx) {
		ListExpr list = new ListExpr();		
		list.Add(visitChildren(ctx));
		return list;
	}

	
	/*
	 *  ARITHMETIC
	 */
	
	@Override
	public Expression visitBracketExpression(BracketExpressionContext ctx) {
		return new Bracket(visit(ctx.getChild(1)));
	}


	@Override
	public Expression visitAdditionExpression(AdditionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Addition(left, right);
	}
	
	@Override
	public Expression visitSubtractionExpression(SubtractionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Subtraction(left, right);
	}

	@Override
	public Expression visitMultiplyExpression(MultiplyExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right =  visit(ctx.getChild(2));
		return new Multiplication(left, right);
	}
	
	@Override
	public Expression visitDivisionExpression(DivisionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Division(left, right);
	}
	
	
	/*
	 *  BOOLS
	 */
	
	@Override
	public Expression visitBoolDecl(BoolDeclContext ctx) {		
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
	
		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}	
				
		if (vars.get(id) != null) {
			SemanticError(line, column, "variable '" + id + "' already declared.");
		} else {
			vars.put(id, type);
		}
		
		return new VariableDeclaration(id, type, value);
	}
	
	@Override
	public Expression visitBoolAssign(BoolAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		Expression value = visitChildren(ctx); 	
		
		if (vars.get(id) == null) {
			SemanticError(line, column, "attempting to assign to undeclared id '" + id + "'");
		}
		
		return new VariableDeclaration(id, vars.get(id), value);
	}	
	
	@Override
	public Expression visitBoolean(BooleanContext ctx) {	
		String strValue = ctx.getChild(0).toString();
		return new BoolExpr(strValue);
	}
	
	
	/*
	 *  PREDICATES
	 */


	@Override
	public Expression visitLogicalExpr(LogicalExprContext ctx) {
		Expression left = visit(ctx.getChild(0));
		String operator = ctx.getChild(1).toString();
		Expression right =  visit(ctx.getChild(2));
		return new LogicalOperator(left, operator, right);
	}

	@Override
	public Expression visitRelationalOperator(RelationalOperatorContext ctx) {
		Expression left = visit(ctx.getChild(0));
		String operator = ctx.getChild(1).toString();
		Expression right =  visit(ctx.getChild(2));
		return new RelationalOperator(left, operator, right);
	}
	
	@Override
	public Expression visitPBracketExpression(PBracketExpressionContext ctx) {
		return new Bracket(visit(ctx.getChild(1)));
	}
	
	@Override
	public Expression visitBooleanVariable(BooleanVariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
 
		String id = ctx.getChild(0).getText();
		if (vars.get(id) == null) {
			SemanticError(line, column, "variable '" + id + "' not declared.");
		}
 
		return new Variable(id);
	}
	
	
	/*
	 *  IF STATEMENT
	 */
	

	@Override
	public Expression visitIfStatement(IfStatementContext ctx) {
		Expression condition = visit(ctx.getChild(2));
		Scope thenScope = (Scope) visit(ctx.getChild(4));
		return new IfStatement(condition, thenScope, null);
	}
	
	@Override
	public Expression visitIfElseStatement(IfElseStatementContext ctx) {
		Expression condition = visit(ctx.getChild(2));
		Scope thenScope = (Scope) visit(ctx.getChild(4));
		Scope elseScope = (Scope) visit(ctx.getChild(6));
		return new IfStatement(condition, thenScope, elseScope);
	}
	
	
	/*
	 *  WHILE STATEMENT
	 */
	
	@Override
	public Expression visitWhileStatement(WhileStatementContext ctx) {
		//WHILE "( Expr log Expr )" "{ stmts }"
		Expression predicate = visit(ctx.getChild(2));
		Scope scope = (Scope) visit(ctx.getChild(4));
		return new WhileStatement(predicate, scope);
	}
	

	/* 
	 *  HELPERS
	 */

	@Override
	public Expression visitVariable(VariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
 
		String id = ctx.getChild(0).getText();
		if (vars.get(id) == null) {
			SemanticError(line, column, "variable '" + id + "' not declared.");
		}
 
		return new Variable(id);
	}
	
	
	public void SemanticError(Integer line, Integer column, String error) {
		semanticErrors.add("Error @ " + line + ":" + column + " : " + error);
	}
	
	public Integer TryParseInt(String someText) {
	   try {
	      return Integer.parseInt(someText);
	   } catch (NumberFormatException ex) {
	      return null;
	   }
	}
}