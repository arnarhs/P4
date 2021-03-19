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

	@Override
	public Expression visitDeclaringReaction(DeclaringReactionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaringReaction(ctx);
	}

	//DECLARATION
	@Override
	public Expression visitDeclaringInt(DeclaringIntContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaringInt(ctx);
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
		// TODO Auto-generated method stub
		return super.visitNumber(ctx);
	}

	//Variable
	@Override
	public Expression visitVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariable(ctx);
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
