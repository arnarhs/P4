// Generated from expression.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(expressionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(expressionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(expressionParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(expressionParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaringListblababab}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringListblababab(expressionParser.DeclaringListblabababContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaringListblababab}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringListblababab(expressionParser.DeclaringListblabababContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void enterReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void exitReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdfasdfasdf}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void enterAsdfasdfasdf(expressionParser.AsdfasdfasdfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdfasdfasdf}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 */
	void exitAsdfasdfasdf(expressionParser.AsdfasdfasdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclInt(expressionParser.DeclIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclInt(expressionParser.DeclIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(expressionParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(expressionParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(expressionParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(expressionParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void enterExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 */
	void exitExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 */
	void enterSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 */
	void exitSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 */
	void enterSsaList(expressionParser.SsaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 */
	void exitSsaList(expressionParser.SsaListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SSACallsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSSACallsdf(expressionParser.SSACallsdfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SSACallsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSSACallsdf(expressionParser.SSACallsdfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmeticsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticsdf(expressionParser.ArithmeticsdfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmeticsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticsdf(expressionParser.ArithmeticsdfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdfasdf}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterAsdfasdf(expressionParser.AsdfasdfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdfasdf}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitAsdfasdf(expressionParser.AsdfasdfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdfasdfss}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterAsdfasdfss(expressionParser.AsdfasdfssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdfasdfss}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitAsdfasdfss(expressionParser.AsdfasdfssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdfasdfasds}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterAsdfasdfasds(expressionParser.AsdfasdfasdsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdfasdfasds}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitAsdfasdfasds(expressionParser.AsdfasdfasdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asdfasdfasdasd}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterAsdfasdfasdasd(expressionParser.AsdfasdfasdasdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asdfasdfasdasd}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitAsdfasdfasdasd(expressionParser.AsdfasdfasdasdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(expressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(expressionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVariable(expressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVariable(expressionParser.VariableContext ctx);
}