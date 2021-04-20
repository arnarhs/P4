package models.expressions;

public class LogicalOperator extends Expression {
    public Expression left;
    public Expression right;
    public Expression center;
    	    
    public LogicalOperator(Expression left, Expression right, Expression center) {
        this.left = left;
        this.right = right;
        this.center = center;
    }

    @Override
    public String toString() {
        return left.toString() + center.toString() + right.toString();
    }
}
