package models.expressions;

import models.Statement;

public class IfStatement extends Expression {
	Statement thenStmt;
	Statement elseIfStmt;
	Statement elseStmt;
	Expression condition;
	String typeIf;
	String typeElseIf;
	String typeElse;
	
	public IfStatement(Expression condition, Statement thenStmt, Statement elseIfStmt, 
			Statement elseStmt, String typeIf, String typeElseIf, String typeElse) {
		this.condition = condition;
		this.thenStmt = thenStmt;
		this.elseIfStmt = elseIfStmt;
		this.elseStmt = elseStmt;
		this.typeIf = typeIf;
		this.typeElseIf = typeElseIf;
		this.typeElse = typeElse;
	}
	
	@Override
	public String toString() {
		return typeIf.toString() + '(' + condition.toString() + ')' + '{' + thenStmt.toString() + '}'
				+ typeElseIf.toString() + '(' + condition.toString() + ')' + '{' + elseIfStmt.toString() + '}'
				+ typeElse.toString() + '{' + elseStmt.toString() + '}';
	}
}
