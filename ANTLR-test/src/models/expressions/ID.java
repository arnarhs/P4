package models.expressions;

public class ID extends Expression{
	public String name; 
	
	public ID (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "ID: "+name;
	}

}
