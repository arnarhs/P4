package GUI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import app.Output;

public class GUIOutput implements Output{
	private JTextArea textAreaOutput;
	private JFrame graphOutput; 
	
	public GUIOutput(JTextArea textAreaOutput, JFrame graphOutput) {
		this.textAreaOutput = textAreaOutput;
		this.graphOutput = graphOutput;
	}
	
	@Override
	public void Send(String output) {
		String appendedOutput = textAreaOutput.getText() + output + "\n";
		textAreaOutput.setText(appendedOutput);
	}
	
	public void Send(Hashtable<Double, Double> graphData) {
		
	}

}
