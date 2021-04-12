package models.expressions;

import models.Statement;

public class IfStatement extends Expression {
	Expression condition;
	Statement thenStmt;
	Statement elseStmt;
	
	//Boolean thenPart;
	//Boolean elsePart;
	
	public IfStatement(Expression condition, Statement thenStmt, Statement elseStmt) {
		this.condition = condition;
		this.thenStmt = thenStmt;
		this.elseStmt = elseStmt;
		
		//this.thenPart = thenP;
		//this.elsePart = elseP;
		
	}
	
	/*public IfStatement(Expression condition, Expression thenP, Expression elseP) {
		this.condition = condition;
		this.thenPart = thenP;
		this.elsePart = elseP;
	}*/
	
	@Override
	public String toString() {
		return condition.toString() + thenStmt.toString() + elseStmt.toString();
	}
}
