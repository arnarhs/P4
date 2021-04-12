package app;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxErrorListener extends BaseErrorListener {

	public static boolean errorOccured = false;
	
	@Override
	public void syntaxError(
			Recognizer<?, ?> recognizer, 
			Object offendingSymbol, 
			int line, 
			int charPositionInLine,
			String msg, 
			RecognitionException e) {
		errorOccured = true;
		
		System.err.println("Error @ " + line + ":" + (charPositionInLine + 1) 
						   + " : " + msg);
	}
}