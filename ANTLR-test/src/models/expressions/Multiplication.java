package models.expressions;

public class Multiplication extends Expression{
	Expression left;
	Expression right;
	
	public Multiplication(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public String toString() {
		return left.toString() + " * " + right.toString();
	}
}