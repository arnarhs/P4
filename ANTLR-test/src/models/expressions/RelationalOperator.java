package models.expressions;

public class RelationalOperator extends Expression {
	public Expression left;
	public Expression right;
	public String operator;
	    	    
	public RelationalOperator(Expression left, String operator, Expression right) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public String toString() {
		return left.toString() + " " + operator + " " + right.toString();
    }
}

