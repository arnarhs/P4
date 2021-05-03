package models.expressions;

public class Addition extends Expression {
    public Expression left;
    public Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    public Addition() {
	}

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}