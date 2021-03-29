// Generated from expression.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link expressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface expressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(expressionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionDeclaration(expressionParser.ReactionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(expressionParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaringListblababab}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringListblababab(expressionParser.DeclaringListblabababContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaringReactioObject}
	 * labeled alternative in {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringReactioObject(expressionParser.DeclaringReactioObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionInitialization}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionInitialization(expressionParser.ReactionInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdfasdfasdf}
	 * labeled alternative in {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdfasdfasdf(expressionParser.AsdfasdfasdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclInt(expressionParser.DeclIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(expressionParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStatement(expressionParser.DeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(expressionParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParameters(expressionParser.ExprParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaParameters(expressionParser.SsaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaList(expressionParser.SsaListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(expressionParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SSACallsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSSACallsdf(expressionParser.SSACallsdfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arithmeticsdf}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticsdf(expressionParser.ArithmeticsdfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdfasdf}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdfasdf(expressionParser.AsdfasdfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdfasdfss}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdfasdfss(expressionParser.AsdfasdfssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdfasdfasds}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdfasdfasds(expressionParser.AsdfasdfasdsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asdfasdfasdasd}
	 * labeled alternative in {@link expressionParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsdfasdfasdasd(expressionParser.AsdfasdfasdasdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(expressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(expressionParser.VariableContext ctx);
}