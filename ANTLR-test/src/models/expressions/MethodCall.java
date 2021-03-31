package models.expressions;

public class MethodCall extends Expression{
	public ID	id;
	public Param parameters;
	
	public MethodCall(ID id, Param parameters) {
		this.id = id;
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		return "MethodCall: " + id.toString() + "(" + parameters.toString() + ")";
	}
}
