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
	 * Visit a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(expressionParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#declReaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclReaction(expressionParser.DeclReactionContext ctx);
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
	 * Visit a parse tree produced by {@link expressionParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(expressionParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#exprParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParams(expressionParser.ExprParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaParams(expressionParser.SsaParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#ssaList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsaList(expressionParser.SsaListContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(expressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(expressionParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#reactionConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionConst(expressionParser.ReactionConstContext ctx);
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