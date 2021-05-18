package SymbolTable;

public interface ISymbolTable {

	void EnterSymbol(Identifier id);

	Identifier RetrieveSymbol(String id);

}
