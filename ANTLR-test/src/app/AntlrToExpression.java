package app;
 
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import antlr.expressionBaseVisitor;
import antlr.expressionParser.AdditionExpressionContext;
import antlr.expressionParser.LogicalOperatorContext;
import antlr.expressionParser.BracketExpressionContext;
import antlr.expressionParser.DivisionExpressionContext;
import antlr.expressionParser.ElseIfStatementContext;
import antlr.expressionParser.ElseStatementContext;
import antlr.expressionParser.IfStatementContext;
import antlr.expressionParser.ListDeclContext;
import antlr.expressionParser.RelationalOperatorContext;
import antlr.expressionParser.MultiplyExpressionContext;
import antlr.expressionParser.NumberContext;
import antlr.expressionParser.NumberDeclContext;
import antlr.expressionParser.ReacDeclContext;
import antlr.expressionParser.ReactionExpressionConstContext;
import antlr.expressionParser.ReactionExpressionContext;
import antlr.expressionParser.ReactionParameterContext;
import antlr.expressionParser.ReactionParametersContext;
import antlr.expressionParser.SubtractionExpressionContext;
import antlr.expressionParser.VariableContext;
import antlr.expressionParser.WhileStatementContext;
import models.declarations.ListDeclaration;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.Bracket;
import models.expressions.LogicalOperator;
import models.expressions.Division;
import models.expressions.ElseIfStatement;
import models.expressions.ElseStatement;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.ListExpr;
import models.expressions.RelationalOperator;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.ReactionExpr;
import models.expressions.Subtraction;
import models.expressions.Variable;
import models.expressions.WhileStatement;
 
public class AntlrToExpression extends expressionBaseVisitor<Expression> {
 
	private List<String> vars; //A list that stores all the declared variables.
	private List<String> semanticErrors; //A list that stores all the semantic errors.

	public AntlrToExpression(List<String> semanticErrors) {
		vars = new ArrayList<>();
		this.semanticErrors = semanticErrors;
	}

	
	public Integer TryParseInt(String someText) {
		   try {
		      return Integer.parseInt(someText);
		   } catch (NumberFormatException ex) {
		      return null;
		   }
		}
	
	
	
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
		
		if (vars.contains(id)) {
			SemanticError(line, column, "reaction '" + id + "' already declared.");
		} else {
			vars.add(id);
		}

		return new VariableDeclaration(id, type, value);
	}

	@Override
	public Expression visitBracketExpression(BracketExpressionContext ctx) {
		return new Bracket(visit(ctx.getChild(1)));
	}

	@Override
	public Expression visitSubtractionExpression(SubtractionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Subtraction(left, right);
	}

	@Override
	public Expression visitDivisionExpression(DivisionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Division(left, right);
	}

	@Override
	public Expression visitWhileStatement(WhileStatementContext ctx) {
		//WHILE "( Expr log Expr )" "{ stmts }"
		Expression predicate = visit(ctx.getChild(2));
		Expression scope = visit(ctx.getChild(4));
		return new WhileStatement(predicate, scope);
	}


	@Override
	public Expression visitNumberDecl(NumberDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = null; 
		
		if (ctx.getChildCount() > 2) {
			value = visitChildren(ctx); 
		}	
		
		if (vars.contains(id)) {
			SemanticError(line, column, "variable '" + id + "' already declared.");
		} else if(type.equals("int") && TryParseInt(value.toString()) == null) {
			SemanticError(line, column, value.toString() + " is not a valid " + type);
		} else {
			vars.add(id);
		}
		
		return new VariableDeclaration(id, type, value);
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
		
		if (vars.contains(id)) {
			SemanticError(line, column, "list '" + id + "' already declared.");
		} else {
			vars.add(id);
		}		
		 	
		return new ListDeclaration(id, type, reacParams.list);
	}

	@Override
	public Expression visitReactionExpression(ReactionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new ReactionExpr(left, right, null);
	}
	
	@Override
	public Expression visitReactionExpressionConst(ReactionExpressionConstContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		Expression constant = visit(ctx.getChild(4));
		return new ReactionExpr(left, right, constant);
	}

	@Override
	public Expression visitAdditionExpression(AdditionExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right = visit(ctx.getChild(2));
		return new Addition(left, right);
	}

	@Override
	public Expression visitMultiplyExpression(MultiplyExpressionContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression right =  visit(ctx.getChild(2));
		return new Multiplication(left, right);
	}

	@Override
	public Expression visitIfStatement(IfStatementContext ctx) {
		String type = ctx.getChild(0).getText();
		Expression condition = visit(ctx.getChild(2));
		Expression thenExpr = visit(ctx.getChild(5));
		Expression elseExpr = visitChildren(ctx); //Check this again
		return new IfStatement(type, condition, thenExpr, elseExpr);
	}

	@Override
	public Expression visitElseIfStatement(ElseIfStatementContext ctx) {
		String typeElse = ctx.getChild(0).getText();
		String typeIf = ctx.getChild(1).getText();
		Expression condition = visit(ctx.getChild(3));
		Expression thenExpr = visit(ctx.getChild(6));
		return new ElseIfStatement(typeElse, typeIf, condition, thenExpr);
	}

	@Override
	public Expression visitElseStatement(ElseStatementContext ctx) {
		String typeElse = ctx.getChild(0).getText();
		Expression thenExpr = visit(ctx.getChild(2));
		return new ElseStatement(typeElse, thenExpr);
	}

	@Override
	public Expression visitLogicalOperator(LogicalOperatorContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression center = visit(ctx.getChild(1));
		Expression right =  visit(ctx.getChild(2));
		return new LogicalOperator(left, center, right);
	}

	@Override
	public Expression visitRelationalOperator(RelationalOperatorContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression center = visit(ctx.getChild(1));
		Expression right =  visit(ctx.getChild(2));
		return new RelationalOperator(left, center, right);
	}


	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		return new Number(numText);
	}
 
	@Override
	public Expression visitVariable(VariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
 
		String id = ctx.getChild(0).getText();
		if (!vars.contains(id)) {
			SemanticError(line, column, "variable '" + id + "' not declared.");
		}
 
		return new Variable(id);
	}
	
	
	public void SemanticError(Integer line, Integer column, String error) {
		semanticErrors.add("Error @ " + line + ":" + column + " : " + error);
	}
}