package models;

import java.util.ArrayList;
import java.util.List;

import models.expressions.Expression;

public class Program {
	public List<Expression> expressions;
	public List<Statement> statements;
	
	public Program() {
		this.expressions = new ArrayList<>();
		this.statements = new ArrayList<>();
	}
	
	public void AddExpression(Expression expr) {
		expressions.add(expr);
	}
	public void AddDeclaration(Statement stmt) {
		statements.add(stmt);
	}

}
