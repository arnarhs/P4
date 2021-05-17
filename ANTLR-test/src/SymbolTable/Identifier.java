package SymbolTable;

import TypeChecker.TypeDescriptor;
import models.expressions.Expression;

enum IDType {
	IDReference,
	Declaration,
	errorType;
}

public class Identifier {
	
	private String _id;
	private Expression _expression;
	
	public String GetID() {
		return _id;
	}
	public Expression GetExpression() {
		return _expression;
	}
		
	public Identifier(String id, Expression expression) {
		this._id = id;
		this._expression = expression;
	}
}
