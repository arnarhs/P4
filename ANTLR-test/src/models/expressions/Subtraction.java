package models.expressions;

public class Subtraction extends Expression {
	 public Expression left;
	 public Expression right;

	 public Subtraction(Expression left, Expression right) {
	     this.left = left;
	     this.right = right;
	 }

	 @Override
	 public String toString() {
		 return left.toString() + " - " + right.toString();
	 }
}
