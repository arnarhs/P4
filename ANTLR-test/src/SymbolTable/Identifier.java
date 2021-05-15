package SymbolTable;

import TypeChecker.TypeDescriptor;
import models.expressions.Expression;

enum IDType {
	IDReference,
	Declaration,
	errorType;
}

public class Identifier {
	Expression value;
	String name;
	
	public Expression GetExpression() {
		return value;
	}
	
	public Identifier() {}
	
	public Identifier(String name, Expression value) {
		this.value = value;
		this.name = name;
	}
}
