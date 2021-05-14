package GUI;

import javax.swing.JTextArea;

import app.ExpressionApp;

public class ChemTrailsRunner implements Runner{
	
	public ChemTrailsRunner(JTextArea textAreaOutput) {
		ExpressionApp.setOutput(new GUIOutput(textAreaOutput));
	}

	@Override
	public RunnerOutput Run(String code) {
		ExpressionApp.parseString(code);
		return null;
	}

}
