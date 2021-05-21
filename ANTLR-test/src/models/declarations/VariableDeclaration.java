package models.declarations;

import models.expressions.Expression;
 
public class VariableDeclaration extends Expression{
	public String id;
	public String type;
	public Expression value;
	
	public VariableDeclaration(String id, String type, Expression value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
	public VariableDeclaration(VariableDeclaration other) {
		this.id = other.id;
		this.type = other.type;
		this.value = other.value;
	}
	
	@Override
	public String toString() {
		return "Decl: " + type + " " + id + " : " + value.toString();
	}
}