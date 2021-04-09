package models.declarations;

import models.expressions.Expression;

public class VariableDeclaration extends Expression {
	public String id;
	public String type;
	public String value;
	
	public VariableDeclaration(String id, String type, String value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Decl: " + type.toString() + " " + id.toString() + " : " + value.toString();
	}
}