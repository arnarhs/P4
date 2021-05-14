package SymbolTable;

import TypeChecker.TypeDescriptor;
import TypeChecker.TypeWrapper;

enum IDType {
	IDReference,
	Declaration,
	errorType;
}

public class Identifier {
	IDType idType;
	TypeDescriptor variableType;
	Integer name;
	
	public Identifier() {}
	
	public Identifier(IDType idtype, TypeDescriptor variableType, Integer name) {
		
	}
}
