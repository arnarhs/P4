package models.expressions;

public class Bracket extends Expression {
	 public Expression expr;

	 public Bracket(Expression expr) {
	     this.expr = expr;
	 }

	 @Override
	 public String toString() {
	     return "(" + expr.toString() + ")";
	 }
}
