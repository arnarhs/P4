package models.expressions;

public class RelationalOperator extends Expression {
	public Expression left;
	public Expression right;
	public Expression operator;
	    	    
	public RelationalOperator(Expression left, Expression right, Expression operator) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public String toString() {
		return left.toString() + operator.toString() + right.toString();
    }
}

