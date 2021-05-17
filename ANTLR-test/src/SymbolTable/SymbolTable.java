package SymbolTable;

import java.sql.Wrapper;
import java.util.Hashtable;


public class SymbolTable implements ISymbolTable{
	
	Hashtable<String, Identifier> entries = new Hashtable<>();
	
	@Override
	public void EnterSymbol(Identifier id) {
		entries.put(id.GetID(), id);
	}

	@Override
	public Identifier RetrieveSymbol(String id) {
		return entries.get(id);
	}

	@Override
	public Boolean DeclaredLocally(Identifier id) {
		if(entries.contains(id)) {
			return true;
		}
		
		else {return false;}
	}
}