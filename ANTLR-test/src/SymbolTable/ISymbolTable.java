package SymbolTable;

import TypeChecker.TypeDescriptor;

public interface ISymbolTable {

	void EnterSymbol(Identifier id);

	Identifier RetrieveSymbol(String id);
	
	Boolean DeclaredLocally(Identifier id);

}
