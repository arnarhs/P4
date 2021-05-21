package models.expressions;

public class WhileStatement extends Expression {
	
	private Expression _predicate;
	private Scope _scope;
	
	public void setPredicate(Expression predicate) {
		predicate = _predicate;
	}
	public Expression getPredicate() {
		return _predicate;
	}
	
	public void setScope(Scope scope) {
		_scope = scope;
	}
	public Scope getScope() {
		return _scope;
	}
	
	public WhileStatement(Expression predicate, Scope scope) {
		_predicate = predicate;
		_scope = scope;
	}
	
	@Override
	public String toString() {
		return _predicate.toString() + _scope.toString();
	}
}
