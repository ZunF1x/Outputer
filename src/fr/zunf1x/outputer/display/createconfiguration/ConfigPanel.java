package fr.zunf1x.outputer.display.createconfiguration;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ConfigPanel extends JPanel {
	
	public ConfigPanel() {
		setLayout(null);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setBackground(Color.DARK_GRAY);
	}
}
