package models.expressions;

public class WhileStatement extends Expression {
	
	public Expression stmt; //Keyword? I dunno
	public Expression predicate;
	public Expression scope;
	
	public WhileStatement(Expression stmt, Expression predicate, Expression scope) {
		this.stmt = stmt;
		this.predicate = predicate;
		this.scope = scope;
	}
	
	@Override
	public String toString() {
		return stmt.toString() + predicate.toString() + scope.toString();
		//Takes While as stmt (keyword) 
		//cant remember and the scope
	}

}
