package models.expressions;

public class Variable extends Expression{
	public String ID;
	
	public Variable(String ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString() {
		return ID;
	}
}
