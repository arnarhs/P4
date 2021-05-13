package GUI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import app.Output;

public class GUIOutput implements Output{
	private JTextArea textAreaOutput;
	
	public GUIOutput(JTextArea textAreaOutput) {
		this.textAreaOutput = textAreaOutput;
	}
	
	@Override
	public void Log(String output) {
		String appendedOutput = textAreaOutput.getText() + output + "\n";
		textAreaOutput.setText(appendedOutput);
	}

	@Override
	public void Result(HashMap<Double, Double> result) {
		// TODO Auto-generated method stub
		
	}

}
