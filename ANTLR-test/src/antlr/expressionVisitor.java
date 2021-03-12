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
	 * Visit a parse tree produced by {@link expressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(expressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(expressionParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(expressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(expressionParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(expressionParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(expressionParser.ValueContext ctx);
}