package app;

import java.util.ArrayList;
import java.util.List;

import SymbolTable.SymbolTableController;
import antlr.expressionBaseVisitor;
import antlr.expressionParser.ProgramContext;
import models.Program;

public class AntlrToProgram extends expressionBaseVisitor<Program>{

	public List<String> semanticErrors;
	private SymbolTableController symbolTable = SymbolTableController.GetInstance();
	
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		semanticErrors = new ArrayList<>();
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
		
		symbolTable.OpenScope();
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			prog.AddExpression(exprVisitor.visit(ctx.getChild(i)));
		}
		symbolTable.CloseScope();
		
		return prog;
	}

}