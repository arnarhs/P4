package unitTests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import antlr.expressionLexer;
import app.SyntaxErrorListener;

public class TestMethods {
	
	
    public static List<Token> getTokensFromText(String txt) {
        List<Token> tokens= new ArrayList<>();
		try {
			CharStream input = CharStreams.fromString(txt);
			
			expressionLexer lexer = new expressionLexer(input);
			lexer.addErrorListener(new SyntaxErrorListener());
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	        tokenStream.fill();
	        tokens = tokenStream.getTokens();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tokens;
    }
    
    
    public static List<Token> getTokensFromFile(String filename) {
        List<Token> tokens= new ArrayList<>();
		try {
			CharStream input = CharStreams.fromFileName(filename);
			
			expressionLexer lexer = new expressionLexer(input);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
	        tokenStream.fill();
	        tokens = tokenStream.getTokens();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tokens;
    }
}
