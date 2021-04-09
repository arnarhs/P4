package models.expressions;
 
import java.util.List;
import org.antlr.v4.runtime.Token;
import antlr.expressionBaseVisitor;
import antlr.expressionParser.AdditionExpressionContext;
import antlr.expressionParser.IntDeclAssignmentContext;
import antlr.expressionParser.IntDeclContext;
import antlr.expressionParser.MultiplyExpressionContext;
import antlr.expressionParser.NumberContext;
import antlr.expressionParser.ReacDeclAssignmentContext;
import antlr.expressionParser.ReacDeclContext;
import antlr.expressionParser.ReactionExpressionContext;
import antlr.expressionParser.VariableContext;
 
public class AntlrToExpression extends expressionBaseVisitor<Expression> {
 
	private List<String> vars; //A list that stores all the declared variables.
	private List<String> semanticErrors; //A list that stores all the semantic errors.
 
 
	@Override
	public Expression visitReacDeclAssignment(ReacDeclAssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReacDeclAssignment(ctx);
	}

	@Override
	public Expression visitReacDecl(ReacDeclContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReacDecl(ctx);
	}

	@Override
	public Expression visitIntDeclAssignment(IntDeclAssignmentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntDeclAssignment(ctx);
	}

	@Override
	public Expression visitIntDecl(IntDeclContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIntDecl(ctx);
	}

	
	@Override
	public Expression visitReactionExpression(ReactionExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReactionExpression(ctx);
	}
	
	@Override
	public Expression visitAdditionExpression(AdditionExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAdditionExpression(ctx);
	}

	@Override
	public Expression visitMultiplyExpression(MultiplyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMultiplyExpression(ctx);
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
			semanticErrors.add("Error @" + line + "," + column + " : variable '" + id + "' not declared.");
		}
 
		return new Variable(id);
	}
 
}