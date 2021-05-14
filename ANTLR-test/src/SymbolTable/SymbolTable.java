package SymbolTable;

import java.sql.Wrapper;
import java.util.Hashtable;


public class SymbolTable implements ISymbolTable{
	
	Hashtable<Identifier, SymbolTableEntry> entries = new Hashtable<>();
	
	@Override
	public Identifier EnterSymbol(Identifier id) {
		entries.put(id, new SymbolTableEntry(id));
		return id;
	}

	@Override
	public Identifier RetrieveSymbol(Identifier id) {
		return entries.get(id).Id;
	}

	@Override
	public Boolean DeclaredLocally(Identifier id) {
		if(entries.contains(id) && entries.get(id).Id.idType.equals(IDType.Declaration)) {
			return true;
		}
		
		else {return false;}
	}
	

}
