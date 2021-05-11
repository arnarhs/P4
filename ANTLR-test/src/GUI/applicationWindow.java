package GUI;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jfree.chart.ChartUtils;

import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class applicationWindow {
	public Runner Runner;
	
	private JFrame frmChemtrails;
	private JTextArea textAreaOutput;
	
	public JTextArea getTextAreaOutput() {
		return textAreaOutput;
	}

	private void setTextAreaOutput(JTextArea textAreaOutput) {
		this.textAreaOutput = textAreaOutput;
	}

	public void show() {
		frmChemtrails.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public applicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChemtrails = new JFrame();
		frmChemtrails.setTitle("ChemTrails");
		frmChemtrails.setBounds(100, 100, 950, 645);
		frmChemtrails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Run");
		
		JTextArea textAreaInput = new JTextArea();
		textAreaInput.setTabSize(2);
		textAreaInput.setLineWrap(true);
		
		setTextAreaOutput(new JTextArea());
		textAreaOutput.setEditable(false);
		textAreaOutput.setTabSize(2);
		textAreaOutput.setLineWrap(true);
		
		GraphPanel chartPanel = new GraphPanel();
		
		JButton btnExportGraph = new JButton("Export");
		GroupLayout groupLayout = new GroupLayout(frmChemtrails.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textAreaInput, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textAreaOutput)
								.addComponent(chartPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 798, Short.MAX_VALUE)
							.addComponent(btnExportGraph)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnExportGraph))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textAreaOutput, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
						.addComponent(textAreaInput, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		btnNewButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  textAreaOutput.setText("");
				  RunnerOutput output = Runner.Run(textAreaInput.getText());
				  //chart.Update(output.Coordinates);
				  chartPanel.UpdateGraph(output);
				  
			  } 
			} );
		
		btnExportGraph.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) { try {
				    File directory = new File("C:/ChemTrails");
				    if (!directory.exists()){
				        directory.mkdir();
				    }
				    
				    LocalDateTime dt = LocalDateTime.now();
				    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
				    String formattedDate = dt.format(myFormatObj);
				    String fileName = "C:/ChemTrails/"+formattedDate+".png";
				    
				    OutputStream out = new FileOutputStream(fileName);
				    ChartUtils.writeChartAsPNG(out,
				    		chartPanel.getChart(),
				    		chartPanel.getWidth(),
				    		chartPanel.getHeight());
					textAreaOutput.setText("Graph exported to "+fileName);
				    out.close();

				} catch (IOException ex) {
					textAreaOutput.setText(ex.getMessage());
				}
			  } 
		});
		
		frmChemtrails.getContentPane().setLayout(groupLayout);
	}
}

