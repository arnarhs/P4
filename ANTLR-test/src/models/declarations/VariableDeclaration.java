package models.declarations;
import models.Declarations;

public class VariableDeclaration extends Declarations {
	public String id;
	public String type;
	public Integer value;
	
	public VariableDeclaration(String id, String type, int value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return type + " " + id + " : " + value.toString();
	}
}
