package models.declarations;
import models.Declarations;
import models.expressions.ID;
import models.expressions.Type;

public class VariableDeclaration extends Declarations {
	public ID id;
	public Type type;
	
	public VariableDeclaration(ID id, Type type) {
		this.id = id;
		this.type = type;
	}
	
	@Override
	public String toString() {
		
		return "Decl: " + type.toString() + " " + id.toString();
	}
}
