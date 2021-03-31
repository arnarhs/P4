package models.declarations;
import models.Declarations;
import models.expressions.Type;
import models.expressions.ID;
import models.expressions.Param;
import models.Scope;

public class Method extends Declarations {
	Type type;
	ID id;
	Param parameters; 
	Scope scope;
	
	public Method(Type type, ID id, Param parameters, Scope scope ) {
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
