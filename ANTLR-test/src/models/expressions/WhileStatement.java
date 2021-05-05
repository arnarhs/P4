package models.expressions;

public class WhileStatement extends Expression {
	
	public Expression predicate;
	public Expression scope;
	
	public WhileStatement(Expression predicate, Expression scope) {
		this.predicate = predicate;
		this.scope = scope;
	}
	
	@Override
	public String toString() {
		return predicate.toString() + scope.toString();
		//Takes While as stmt (keyword) 
		//cant remember and the scope
	}

}
