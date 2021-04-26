package models.expressions;

public class Assign extends Expression{
	public String id;
	public Expression value;
	
	public Assign(String id, Expression value) {
		this.id = id;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return id.toString() + " : " + value.toString();
	}
}
