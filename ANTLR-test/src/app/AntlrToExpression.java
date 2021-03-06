package app;
 
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import GillespieSSA.ReactionPair;
import SymbolTable.Identifier;
import SymbolTable.SymbolTableController;
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
import models.expressions.ReactionExpr;
import models.expressions.Subtraction;
import models.expressions.Variable;
import models.expressions.WhileStatement;
 
public class AntlrToExpression extends expressionBaseVisitor<Expression> {
 
	private SymbolTableController symbolTable = SymbolTableController.GetInstance();
	private List<String> semanticErrors; //A list that stores all the semantic errors.

	public AntlrToExpression(List<String> semanticErrors) {
		this.semanticErrors = semanticErrors;
	}	
	
  
  
	/* Scope 
	 * 
	 */
	
	@Override
	public Expression visitScopeDecl(ScopeDeclContext ctx) {
		symbolTable.OpenScope();
		List<Statement> stmts = new ArrayList<Statement>();
		for(int i = 1; i < ctx.getChildCount() - 1; i++) {  // Visit every child but opening and closing brackets
			stmts.add(visit(ctx.getChild(i)));
		}
		symbolTable.CloseScope();
		
		return new Scope(stmts);
	}
	

	/* SSA CAll
   *
   */
	
  	@Override
	public Expression visitSsaAlg(SsaAlgContext ctx) {
		String solution = ctx.getChild(2).toString();
		String reactions = ctx.getChild(4).toString();
		Expression loops = visit(ctx.getChild(6));
		Expression repeat = null;
		if (ctx.getChildCount() > 8) {
			repeat = visit(ctx.getChild(8)); 
		}
		return new SsaAlg(solution, reactions, loops, repeat);
	}
  	
  
	/* 
	 *  REACTIONS
	 */
	
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

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}	
		
		VariableDeclaration decl = new VariableDeclaration(id, type, value);
		
		EnterSymbol(idToken, new Identifier(id, decl));
		
		return decl;
	}


	@Override
	public Expression visitNumberAssign(NumberAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		String id = ctx.getChild(0).getText();
		VariableDeclaration oldVarDecl = (VariableDeclaration) RetrieveSymbol(idToken, id);
		VariableDeclaration newVarDecl = new VariableDeclaration(oldVarDecl.id, oldVarDecl.type , visit(ctx.getChild(2)));
		
		UpdateSymbol(new Identifier(id, newVarDecl));
		
		return newVarDecl;
	}
	

	//One reaction parameter

	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		return new Number(numText);
	}

  
  
	/*
	 *  Reaction Lists
	 */

	@Override
	public Expression visitListDecl(ListDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		ListExpr reacParams = new ListExpr();
		
		if(ctx.getChildCount() > 2) {
			reacParams = (ListExpr) visit(ctx.reacParams());	
		}
		
		return visitListDecl(idToken, ctx, reacParams.list);
	}
	
	private ListDeclaration visitListDecl(Token idToken, ParserRuleContext ctx, List<Expression> list) {
		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		
		ListDeclaration decl = new ListDeclaration(id, type, list);
		
		EnterSymbol(idToken, new Identifier(id, decl));
		
		return decl;
	}
  
  	@Override
	public Expression visitListAssign(ListAssignContext ctx) {
  		Token idToken = ctx.ID().getSymbol();	
		ListExpr reacParams = (ListExpr) visit(ctx.reacParams());		
		return visitListAssign(idToken, ctx, reacParams.list);
	}
  	
  	public ListDeclaration visitListAssign(Token idToken, ParserRuleContext ctx, List<Expression> list) {
		String id = ctx.getChild(0).getText();
		
		ListDeclaration oldListDecl = (ListDeclaration) RetrieveSymbol(idToken, id);
		ListDeclaration newListDecl = new ListDeclaration(oldListDecl.id, oldListDecl.type, list);
		
		UpdateSymbol(new Identifier(id, newListDecl));
		
		return newListDecl;
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
	
	
	
	/*
	 *  Solutions
	 */

	@Override
	public Expression visitSolutionDeclaration(SolutionDeclarationContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		ListExpr speciList = new ListExpr();
		
		if(ctx.getChildCount() > 2) {
			speciList = (ListExpr) visit(ctx.declList());	
		}
		
		return visitListDecl(idToken, ctx, speciList.list);
	}

	@Override
	public Expression visitSolutionAssign(SolutionAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();	
		ListExpr speciList = (ListExpr) visit(ctx.declList());		
		return visitListAssign(idToken, ctx, speciList.list);
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
	
		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}	
				
		VariableDeclaration decl = new VariableDeclaration(id, type, value);
		
		EnterSymbol(idToken, new Identifier(id, decl));
		
		return decl;
	}
	
	@Override
	public Expression visitBoolAssign(BoolAssignContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		String id = ctx.getChild(0).getText();
		
		VariableDeclaration oldBoolDecl = (VariableDeclaration) RetrieveSymbol(idToken, id);
		VariableDeclaration newBoolDecl = new VariableDeclaration(oldBoolDecl.id, oldBoolDecl.type, visitChildren(ctx));
		
		UpdateSymbol(new Identifier(id, newBoolDecl));
		
		return newBoolDecl;
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
		String operator = ctx.getChild(2).getText();
		Expression right =  visit(ctx.getChild(2));
		return new LogicalOperator(left, operator, right);
	}

	@Override
	public Expression visitRelationalOperator(RelationalOperatorContext ctx) {
		Expression left = visit(ctx.getChild(0));
		String operator = ctx.getChild(2).getText();
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
		return visitVariable(idToken, ctx);
	}
	
	
	/*
	 *  IF STATEMENT
	 */
	

	@Override
	public Expression visitIfStatement(IfStatementContext ctx) {
		Expression condition = visit(ctx.getChild(2));
		Scope thenScope = (Scope) visit(ctx.getChild(4));
		Scope elseScope = null;
		if(ctx.getChildCount() > 5) {
			elseScope = (Scope) visit(ctx.getChild(6));
		}
		return new IfStatement(condition, thenScope, elseScope);
	}
	
	
	/*
	 *  WHILE STATEMENT
	 */
	
	@Override
	public Expression visitWhileStatement(WhileStatementContext ctx) {
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
		return visitVariable(idToken, ctx);
	}
	
	public Variable visitVariable(Token idToken, ParserRuleContext ctx) {
		String id = ctx.getChild(0).getText();
		
		RetrieveSymbol(idToken, id); // This is just used for the semantic error in this case. The returned expression is not needed.
 
		return new Variable(id);
	}
	
	public void EnterSymbol(Token idToken, Identifier identifier) {
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		if (symbolTable.RetrieveSymbol(identifier.GetID()) != null) {
			SemanticError(line, column, "symbol '" + identifier.GetID() + "' has already been declared.");
		} else {
			symbolTable.EnterSymbol(identifier);
		}
	}
	
	public void UpdateSymbol(Identifier identifier) {
		symbolTable.EnterSymbol(identifier);
	}
	
	public Expression RetrieveSymbol(Token idToken, String id) {
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		Identifier identifier = symbolTable.RetrieveSymbol(id);
		
		if (identifier == null) {
			SemanticError(line, column, "attempting to assign to undeclared id '" + id + "'");
			return null;
		}
		
		return identifier.GetExpression();
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