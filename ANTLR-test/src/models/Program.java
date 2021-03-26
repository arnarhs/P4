package models;

import java.util.ArrayList;
import java.util.List;

import models.expressions.Expression;

public class Program {
	public List<Expression> expressions;
	
	public Program() {
		this.expressions = new ArrayList<>();
	}
	
	public void AddExpression(Expression expr) {
		expressions.add(expr);
	}

}
