package models.expressions;

public class Division extends Expression {
	 public Expression left;
	 public Expression right;

	 public Division(Expression left, Expression right) {
	     this.left = left;
	     this.right = right;
	 }

	 @Override
	 public String toString() {
	     return left.toString() + " / " + right.toString();
	 }
}
