package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import GUI.GraphData;
import antlr.expressionLexer;
import antlr.expressionParser;
import models.Program;

public class ExpressionApp {
	
	private static Output output;
	private static List<GraphData> graphs;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.print("Usage: file name\n");
			return;
		}
		
		output = new LogOutput();
		String fileName = args[0];
		expressionParser parser = getParserFromFile(fileName);
		runParser(parser);
	}
	
	public static void parseString(String string) {
		graphs = new ArrayList<GraphData>(); 
		SyntaxErrorListener.Reset();
		
		expressionParser parser = getParserFromString(string);
		runParser(parser);
	}
	
	public static List<GraphData> getGraphsFromParser() {
		return graphs;
	}
	
	private static void runParser(expressionParser parser) {
		ParseTree antlrAST = parser.prog();
		
		AntlrToProgram progVisitor = new AntlrToProgram();
		Program prog = progVisitor.visit(antlrAST);
		if (SyntaxErrorListener.errorOccured) {
			output.Log(SyntaxErrorListener.GetErrorMessage());
			return;
		}
		
		if (progVisitor.semanticErrors.isEmpty()) {
			ExpressionProcessor ep = new ExpressionProcessor(prog.statements);
	        for (String evaluation : ep.ProcessStatements()) {
				output.Log(evaluation);
			}
			graphs = ep.fetchGraphData();
		} else {
			for (String err: progVisitor.semanticErrors) {
				output.Log(err);
			}
		}
	}
	
	private static expressionParser getParserFromString(String string) {
		CharStream input = CharStreams.fromString(string);
		expressionParser parser = getParser(input);
		return parser;
	}
	
	private static expressionParser getParserFromFile(String filename) {
		try {
			CharStream input = CharStreams.fromFileName(filename);
			expressionParser parser = getParser(input);
			return parser;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static expressionParser getParser(CharStream input) {
		expressionLexer lexer = new expressionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		expressionParser parser = new expressionParser(tokens);
		//Add our own personal syntax error listener 
		parser.removeErrorListeners();
		parser.addErrorListener(new SyntaxErrorListener());
		return parser;
	}

	public static void setOutput(Output newOutput) {
		output = newOutput;
	}

}
