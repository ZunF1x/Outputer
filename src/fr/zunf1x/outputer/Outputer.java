package fr.zunf1x.outputer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Outputer {
	
	private static JFrame frame;
	private static JPanel panel;
	
	public static void main(String[] args) {
		createDisplay();
	}
	
	private static void createDisplay() {
		frame = new OutputerFrame();
	}
	
	public static JFrame getFrame() {
		return frame;
	}
	
	public static JPanel getPanel() {
		return panel;
	}
}
