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
		tempMemory = new Stack<SymbolTable>();
		symbolTables.push(new SymbolTable());
		nameSpace = new ArrayList<String>();
	}
	
	//Class fields
	private Stack<SymbolTable> symbolTables;
	private Stack<SymbolTable> tempMemory;
	
	private List<String> nameSpace; 
	
	
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
	public Identifier EnterSymbol(Identifier id) {
		Boolean test = DeclaredLocally(id);

		if(id.idType == IDType.Declaration) {
			if(test) {
				return new Identifier(IDType.errorType, new TypeDescriptor<ErrorTypes>(ErrorTypes.AllreadyDeclared), id.name);
			}
			else {
				return symbolTables.peek().EnterSymbol(id);
			}
		}
		
		else if(id.idType == IDType.IDReference){
			if(test) {
				return symbolTables.peek().EnterSymbol(id);
			}
			
			else {
				return new Identifier(IDType.errorType, new TypeDescriptor<ErrorTypes>(ErrorTypes.NotDeclared), id.name);
			}
		}
		
		else {
			throw new IllegalArgumentException("IDType not valid for SymbolTable"); 
		}
	}


	@Override
	public Identifier RetrieveSymbol(Identifier id) {
		Boolean test = false;
		Identifier currentDeclaration;
		while(!test) {
			if(!symbolTables.empty()) {
				currentDeclaration = symbolTables.peek().RetrieveSymbol(id);
				if(currentDeclaration != null) {
					ResetStack();
					return currentDeclaration;
				}
				
				tempMemory.push(symbolTables.pop());
			}
			
			else {
				test = true;
				ResetStack();				
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
		if(!nameSpace.contains(string)) {
			nameSpace.add(string);
			return nameSpace.size()-1;
		}
		
		else {
			return null;
		}
	}
	
	
	private void ResetStack() {
		for(SymbolTable elem : tempMemory) {
			symbolTables.push(tempMemory.pop());
		}
	}
	
	
}
