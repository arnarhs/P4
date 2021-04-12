package models.expressions;

import java.util.ArrayList;
import java.util.List;

import models.Statement;

public class Param extends Expression {
	public List<Statement> parameters = new ArrayList<>();
	
	public Param(){}
	
	public Param(List<Statement> parameters) 
	{
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		String str = "Param: ";
		
		for(Statement elem : parameters) {
			str = str + elem.toString() + ", ";
		}
		
		return str;
	}
	
} 
