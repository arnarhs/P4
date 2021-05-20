package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jfree.chart.ChartUtils;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class applicationWindow {
	public Runner Runner;
	
	private JFrame frmChemtrails;
	private JTextArea textAreaOutput;
	private JScrollPane scrollPane;
	
	public JTextArea getTextAreaOutput() {
		return textAreaOutput;
	}

	private void setTextAreaOutput(JTextArea textAreaOutput) {
		this.textAreaOutput = textAreaOutput;
		scrollPane.setViewportView(textAreaOutput);
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
		frmChemtrails.setBounds(100, 100, 1012, 645);
		frmChemtrails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Run");
		
		JTextArea textAreaInput = new JTextArea();
		textAreaInput.setText("//example ChemTrails\r\nsolution sol  : {\r\n\tspecies a : 10,\r\n\tspecies b : 0,\r\n\tspecies c : 50,\r\n\tspecies d : 0\r\n}\r\n\r\nlist reactions : {\r\n\tc  ->  d (0.1),\r\n\ta  ->  b (0.1)\r\n}\r\n\r\nssa(sol, reactions, 50)");
		textAreaInput.setTabSize(2);
		textAreaInput.setLineWrap(true);
		
		GraphPanel chartPanel = new GraphPanel();
		
		JButton btnExportGraph = new JButton("Export");

		scrollPane = new JScrollPane();
		
		JButton btnBuild = new JButton("Build");
		
		GroupLayout groupLayout = new GroupLayout(frmChemtrails.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textAreaInput, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuild, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 792, Short.MAX_VALUE)
							.addComponent(btnExportGraph)))
					.addGap(13))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnBuild)
						.addComponent(btnExportGraph))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
						.addComponent(textAreaInput, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		setTextAreaOutput(new JTextArea());
		textAreaOutput.setEditable(false);
		textAreaOutput.setTabSize(2);
		textAreaOutput.setLineWrap(true);
		
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
		
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				//get code
				//export code  check line 144-154
			}
		});
		
		frmChemtrails.getContentPane().setLayout(groupLayout);
	}
}

