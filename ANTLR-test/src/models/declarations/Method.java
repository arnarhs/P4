package models.declarations;
import models.expressions.Param;
import models.expressions.Scope;

public class Method extends Declarations {
	String type;
	String id;
	Param parameters; 
	Scope scope;
	
	public Method(String type, String id, Param parameters, Scope scope ) {
		this.type = type;
		this.id = id; 
		this.parameters = parameters;
		this.scope = scope;
	}
	
	@Override
	public String toString() {
		return type.toString() + id.toString() + " (" + parameters.toString() + ")" + scope.toString();
	}
}