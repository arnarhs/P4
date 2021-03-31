package models.expressions;

public class Variable extends Expression{
	String ID;
	
	public Variable(String ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString() {
		return ID;
	}
}
