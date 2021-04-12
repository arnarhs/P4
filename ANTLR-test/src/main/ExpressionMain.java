package main;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.expressionLexer;
import antlr.expressionParser;
import models.Program;
import models.expressions.AntlrToProgram;
import models.expressions.ExpressionProcessor;

public class ExpressionMain {

	public static void main(String[] args) {
		if (args.length == 1) {
			String fileName = args[0];
			expressionParser parser = getParser(fileName);
			ParseTree antlrAST = parser.prog();
			AntlrToProgram progVisitor = new AntlrToProgram();
			Program prog = progVisitor.visit(antlrAST);
			
			if(progVisitor.semanticErrors.isEmpty()) {
				ExpressionProcessor ep = new ExpressionProcessor(prog.statements);
				for(String evaluation: ep.getEvaluationResults()) {
					System.out.println(evaluation);
				}
			} else {
				for(String err: progVisitor.semanticErrors) {
					System.out.println(err);
				}
			}
		}
		else {
			System.err.print("Usage: file name\n");
		}
	}
	
	private static expressionParser getParser(String filename) {
		
		expressionParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(filename);
			expressionLexer lexer = new expressionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new expressionParser(tokens);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}

}
