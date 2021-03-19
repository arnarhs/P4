package models.expressions;

public class Addition extends Expression{
	Expression leftside;
	Expression rightside;
	
	public Addition(Expression leftside, Expression rightside) {
		this.leftside = leftside;
		this.rightside = rightside;
	}
	
	@Override
	public String toString() {
		return leftside.toString() + "+" + rightside.toString();
	}
}
