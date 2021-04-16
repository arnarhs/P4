package app;
 
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import antlr.expressionBaseVisitor;
import antlr.expressionParser.AdditionExpressionContext;
import antlr.expressionParser.BooleanOperatorExprContext;
import antlr.expressionParser.BracketExpressionContext;
import antlr.expressionParser.DivisionExpressionContext;
import antlr.expressionParser.IfStatementContext;
import antlr.expressionParser.IntDeclAssignmentContext;
import antlr.expressionParser.IntDeclContext;
import antlr.expressionParser.LogicalOperatorExprContext;
import antlr.expressionParser.MultiplyExpressionContext;
import antlr.expressionParser.NumberContext;
import antlr.expressionParser.ReacDeclAssignmentContext;
import antlr.expressionParser.ReacDeclContext;
import antlr.expressionParser.ReactionExpressionConstContext;
import antlr.expressionParser.ReactionExpressionContext;
import antlr.expressionParser.SubtractionExpressionContext;
import antlr.expressionParser.VariableContext;
import models.declarations.VariableDeclaration;
import models.expressions.Addition;
import models.expressions.BooleanExpression;
import models.expressions.Division;
import models.expressions.Expression;
import models.expressions.IfStatement;
import models.expressions.LogicalExpression;
import models.expressions.Multiplication;
import models.expressions.Number;
import models.expressions.ReactionExpr;
import models.expressions.Subtraction;
import models.expressions.Variable;
 
public class AntlrToExpression extends expressionBaseVisitor<Expression> {
 
	private List<String> vars; //A list that stores all the declared variables.
	private List<String> semanticErrors; //A list that stores all the semantic errors.

	public AntlrToExpression(List<String> semanticErrors) {
		vars = new ArrayList<>();
		this.semanticErrors = semanticErrors;
	}
	
	@Override
	public Expression visitReacDeclAssignment(ReacDeclAssignmentContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = visitChildren(ctx); 
		
		if (vars.contains(id)) {
			SemanticError(line, column, "reaction '" + id + "' already declared.");
		} else {
			vars.add(id);
		}		

		return new VariableDeclaration(id, type, value);
	}

	@Override
	public Expression visitReacDecl(ReacDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		
		if (vars.contains(id)) {
			SemanticError(line, column, "reaction '" + id + "' already declared.");
		} else {
			vars.add(id);
		}

		return new VariableDeclaration(id, type, null);
	}

	@Override
	public Expression visitIntDeclAssignment(IntDeclAssignmentContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		Expression value = visitChildren(ctx); 
		
		if (vars.contains(id)) {
			SemanticError(line, column, "variable '" + id + "' already declared.");
		} else {
			vars.add(id);
		}
		
		return new VariableDeclaration(id, type, value);
	}

	@Override
	public Expression visitBracketExpression(BracketExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBracketExpression(ctx);
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
	public Expression visitIntDecl(IntDeclContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;

		String type = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		
		if (vars.contains(id)) {
			SemanticError(line, column, "variable '" + id + "' already declared.");
		} else {
			vars.add(id);
		}		

		return new VariableDeclaration(id, type, null);
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
	public Expression visitBooleanOperatorExpr(BooleanOperatorExprContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression center = visit(ctx.getChild(1));
		Expression right =  visit(ctx.getChild(2));
		return new BooleanExpression(left, center, right);
	}

	@Override
	public Expression visitLogicalOperatorExpr(LogicalOperatorExprContext ctx) {
		Expression left = visit(ctx.getChild(0));
		Expression center = visit(ctx.getChild(1));
		Expression right =  visit(ctx.getChild(2));
		return new LogicalExpression(left, center, right);
	}

	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		return new Number(num);
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