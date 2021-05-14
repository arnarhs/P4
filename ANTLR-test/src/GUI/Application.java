package GUI;

import java.awt.EventQueue;

public class Application {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationWindow window = new applicationWindow();
					window.Runner = new ChemTrailsRunner(window.getTextAreaOutput());
					window.show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
