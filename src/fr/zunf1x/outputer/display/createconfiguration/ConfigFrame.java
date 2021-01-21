package fr.zunf1x.outputer.display.createconfiguration;

import javax.swing.JFrame;

public class ConfigFrame extends JFrame {
	
	public ConfigFrame() {
		setTitle("Create a configuration");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(new ConfigPanel());
		
		setVisible(true);
	}
}
