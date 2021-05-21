package models;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public List<Statement> statements;
	
	public Program() {
		this.statements = new ArrayList<>();
	}
	
	public void AddExpression(Statement stmt) {
		statements.add(stmt);
	}
}
