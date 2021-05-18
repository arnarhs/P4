package SymbolTable;

import java.util.Stack;

public class SymbolTableController implements ISymbolTable{
	/**
	 * The SymbolTableController class is responsible for maintaining the symbol tables. 
	 * Provides methods for entering, retrieving, and checking declarations, as well as opening and closing scopes. 
	 * **/
	
	
	//Class fields
	private Stack<SymbolTable> symbolTables;	
	
	class STSearchResult {
		public SymbolTable st;
		public Identifier id;
		
		public STSearchResult(SymbolTable st, Identifier id) {
			this.st = st;
			this.id = id;
		}
	}
	
	//Singleton pattern to ensure that all calls refer to the same SymbolTableController.
	private static SymbolTableController instance;
	
	public static SymbolTableController GetInstance() {
		if(instance == null) {
			instance = new SymbolTableController();
		}
		return instance;
	}
	
	//Private constructor
	private SymbolTableController() {
		symbolTables = new Stack<SymbolTable>();
	}

	
	public void OpenScope() {
		symbolTables.push(new SymbolTable());
	}
	
	public void CloseScope() {
		if(!symbolTables.empty()) {
			symbolTables.pop();
		}
	}

	@Override
	public void EnterSymbol(Identifier id) {
		STSearchResult result = SearchSymbolTables(id.GetID());
		
		if (result == null) {
			symbolTables.peek().EnterSymbol(id);	// Declaration
		} else {
			result.st.EnterSymbol(id);				// Assignment
		}
	}

	@Override
	public Identifier RetrieveSymbol(String id) {
		STSearchResult result = SearchSymbolTables(id);
		if (result != null) {
			return result.id;
		}
		return null;
	}
	
	public STSearchResult SearchSymbolTables(String id) {
		for (SymbolTable st : symbolTables) {
			Identifier identifier = st.RetrieveSymbol(id);
			if(identifier != null) {
				return new STSearchResult(st, identifier);
			}
		}
		return null;
	}
}
