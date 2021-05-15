package models.expressions;

public class BoolExpr extends Expression {
	
	private String _value = "false";
	
	public String getValue() {
		return _value;
	}
	
	public void setValue(String value) {
		_value = value;
	}
	
	public BoolExpr (String value) {
		this._value = value;
	}
	
	@Override
	public String toString() {
		return _value;
	}
}
