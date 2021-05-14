package models.expressions;

public class IfStatement extends Expression {

	private Expression _predicate;
	private Scope _thenScope;
	private Scope _elseScope = null;
	
	public void setPredicate(Expression predicate) {
		predicate = _predicate;
	}
	public Expression getPredicate() {
		return _predicate;
	}
	
	public void setThenScope(Scope thenScope) {
		_thenScope = thenScope;
	}
	public Scope getThenScope() {
		return _thenScope;
	}
	
	public void setElseScope(Scope elseScope) {
		_elseScope = elseScope;
	}
	public Scope getElseScope() {
		return _elseScope;
	}
	
	public IfStatement(Expression predicate, Scope thenScope, Scope elseScope) {
		_predicate = predicate;
		_thenScope = thenScope;
		_elseScope = elseScope;
	}
	
	@Override
	public String toString() {
		return "If Statement";	
	}
}
