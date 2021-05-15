package SymbolTable;

import TypeChecker.TypeDescriptor;

public interface ISymbolTable {

	Identifier EnterSymbol(Identifier id);

	Identifier RetrieveSymbol(Identifier id);

	Boolean DeclaredLocally(Identifier id);

	
}
