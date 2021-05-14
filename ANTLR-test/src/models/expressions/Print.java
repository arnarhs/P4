package models.expressions;

public class Print extends Expression{
	public Expression printExpression;
	
	public Print(Expression expression) {
		printExpression = expression;
	}
}
