package models.expressions;

import java.util.ArrayList;
import java.util.List;

import models.Statement;

public class Scope extends Expression{
	
	public List<Statement> stmts = new ArrayList<>(); 
	
	public Scope(List<Statement> stmts) 
	{
		this.stmts = stmts;
	}
		
	@Override
	public String toString() 
	{
		String str = "";
		for (Statement s : stmts) 
		{
			str = str + s.toString() + " ";
		}
		
		return str;
	}

}
