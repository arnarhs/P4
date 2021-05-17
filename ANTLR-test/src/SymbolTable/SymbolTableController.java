package SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import TypeChecker.ErrorTypes;
import TypeChecker.TypeDescriptor;

public class SymbolTableController implements ISymbolTable{
	/**
	 * The SymbolTableController class is responsible for maintaining the symbol tables. 
	 * Provides methods for entering, retrieving, and checking declarations, as well as opening and closing scopes. 
	 * **/
	
	
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
		nameSpace = new ArrayList<String>();
	}
	
	//Class fields
	private Stack<SymbolTable> symbolTables;	
	private List<String> nameSpace; 
	
	class STSearchResult {
		public SymbolTable st;
		public Identifier id;
		
		public STSearchResult(SymbolTable st, Identifier id) {
			this.st = st;
			this.id = id;
		}
	}
	
	
	/**
	 * Interfacing methods for the symbol table. 
	 * **/
	
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
			// Declaration
			symbolTables.peek().EnterSymbol(id);
		} else {
			// Assignment
			result.st.EnterSymbol(id);
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


	/*Checks whether a variable is declared within the current innermost scope*/
	@Override
	public Boolean DeclaredLocally(Identifier id) {
		return symbolTables.peek().DeclaredLocally(id);
	}
	
	/*
	 * Creates a permanent storage for all declared variables.
	 * Names will always be referenced by the name space. Comparison of names can be done by comparing integers.  
	 * */
	private Integer EnterSymbolName(String string) {
		if (!nameSpace.contains(string)) {
			nameSpace.add(string);
			return nameSpace.size()-1;
		}
		
		else {
			return null;
		}
	}

}
