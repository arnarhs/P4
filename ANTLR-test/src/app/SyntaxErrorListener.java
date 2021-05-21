package app;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxErrorListener extends BaseErrorListener {

	private static String errorMsg;
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
		
		errorMsg = "Error @ " + line + ":" + (charPositionInLine + 1) + " : " + msg;
		System.out.println(errorMsg);
	}
	
	public static String GetErrorMessage() {
		return errorMsg;
	}
}