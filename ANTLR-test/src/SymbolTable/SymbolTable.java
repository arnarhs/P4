package SymbolTable;

import java.util.Hashtable;

public class SymbolTable implements ISymbolTable{
	
	private Hashtable<String, Identifier> entries = new Hashtable<>();
	
	@Override
	public void EnterSymbol(Identifier id) {
		entries.put(id.GetID(), id);
	}

	@Override
	public Identifier RetrieveSymbol(String id) {
		return entries.get(id);
	}
}