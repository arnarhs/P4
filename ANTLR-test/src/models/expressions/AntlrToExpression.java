package models.expressions;

import antlr.expressionBaseVisitor;
import antlr.expressionParser.AddExpressionContext;
import antlr.expressionParser.DeclaringIntContext;
import antlr.expressionParser.DeclaringReactionContext;
//import antlr.expressionParser.MethodCallContext;
import antlr.expressionParser.MultiplyExpressionContext;
import antlr.expressionParser.NumberContext;
import antlr.expressionParser.ReactingSpeciesContext;
//import antlr.expressionParser.ReactionInitializationContext;
//import antlr.expressionParser.ReactionOperatorWithParaContext;
import antlr.expressionParser.VariableContext;

public class AntlrToExpression extends expressionBaseVisitor<Expression> {

	private List<String> vars; 
	private List<String> semanticErrors; 
	
	@Override
	public Expression visitDeclaringReaction(DeclaringReactionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaringReaction(ctx);
	}

	//DECLARATION
	@Override
	public Expression visitDeclaringInt(DeclaringIntContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		if (vars.contains(id)) {
			semanticErrors.add("Error @" + line.toString() + "," + column.toString() + " : variable '" + id + "' already declared.")
		} else {
			vars.add(id);
		}
		
		String type = ctx.getChild(2).getText();
		int value = Integer.parseInt(ctx.NUM().getText());
		
		return new VariableDeclaration(id, type, value);
	}
	
	//REACTION OPERATOR
	@Override
	public Expression visitReactingSpecies(ReactingSpeciesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReactingSpecies(ctx);
	}
	
	//MULTIPICATION
	@Override
	public Expression visitMultiplyExpression(MultiplyExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMultiplyExpression(ctx);
	}
	
	//ADDITION
	@Override
	public Expression visitAddExpression(AddExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAddExpression(ctx);
	}
	
	//NUMBER
	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		return new Number(num);
	}

	//Variable
	@Override
	public Expression visitVariable(VariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		if (!vars.contains(id)) {
			semanticErrors.add("Error @" + line.toString() + "," + column.toString() + " : variable '" + id + "' not declared.")
		}
		
		return new Variable(id);
	}
	
	/*@Override
	public Expression visitReactionOperatorWithPara(ReactionOperatorWithParaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReactionOperatorWithPara(ctx);
	}

	@Override
	public Expression visitMethodCall(MethodCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethodCall(ctx);
	}

	@Override
	public Expression visitReactionInitialization(ReactionInitializationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReactionInitialization(ctx);
	}*/
	

}
