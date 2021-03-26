package models;

import java.util.ArrayList;
import java.util.List;

public class Scope extends Statement{
	
	public List<Statement> stmts = new ArrayList<>(); 
	
	public Scope(List<Statement> stmts) 
	{
		this.stmts = stmts;
	}
	
	@Override
	public String toString() 
	{
		String str = "";
		for (Statement var : stmts) 
		{
			str = str + var.toString() + " ";
		}
		
		return str;
	}

}