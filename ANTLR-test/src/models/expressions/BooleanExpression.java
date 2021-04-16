package models.expressions;

public class BooleanExpression extends Expression {
    public Expression left;
    public Expression right;
    public Expression center;
    	    
    public BooleanExpression(Expression left, Expression right, Expression center) {
        this.left = left;
        this.right = right;
        this.center = center;
    }

    @Override
    public String toString() {
        return left.toString() + center.toString() + right.toString();
    }
}
