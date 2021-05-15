package SymbolTable;

import TypeChecker.TypeDescriptor;

public interface ISymbolTable {

	Identifier EnterSymbol(Identifier id);

	Boolean DeclaredLocally(Identifier id);

	Identifier RetrieveSymbol(String id);

	
}
