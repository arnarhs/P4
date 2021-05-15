package SymbolTable;

import java.sql.Wrapper;
import java.util.Hashtable;


public class SymbolTable implements ISymbolTable{
	
	Hashtable<String, SymbolTableEntry> entries = new Hashtable<>();
	
	@Override
	public Identifier EnterSymbol(Identifier id) {
		entries.put(id.name, new SymbolTableEntry(id));
		return id;
	}

	@Override
	public Identifier RetrieveSymbol(String id) {
		return entries.get(id).Id;
	}

	@Override
	public Boolean DeclaredLocally(Identifier id) {
		if(entries.contains(id)) {
			return true;
		}
		
		else {return false;}
	}
	

}
