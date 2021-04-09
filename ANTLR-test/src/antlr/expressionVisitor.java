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
	 * Visit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(expressionParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(expressionParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReactionExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactionExpression(expressionParser.ReactionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumOrID}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumOrID(expressionParser.NumOrIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link expressionParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(expressionParser.MultiplyExpressionContext ctx);
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