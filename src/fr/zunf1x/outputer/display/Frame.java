package fr.zunf1x.outputer.display;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import fr.zunf1x.outputer.display.createconfiguration.ConfigFrame;

public class Frame extends JFrame {
	
	private static Frame frame;
	private static Panel panel;
	
	public Frame() {
		setTitle("Outputer");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setContentPane(panel = new Panel());
		setJMenuBar(createMenuBar());
		
		setVisible(true);
	}

    private JMenu createSaveMenu() {
        JMenu saveMenu = new JMenu("Save");
        
        saveMenu.setForeground(Color.GRAY);
        
        JMenuItem createConfig = new JMenuItem("Create configuration");
        createConfig.setBackground(Color.GRAY);
        createConfig.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		ConfigFrame configFrame = new ConfigFrame();
        	}
        });
        
        saveMenu.add(createConfig); 
        
        JMenuItem importItem = new JMenuItem("Import configuration");
        importItem.setBackground(Color.GRAY);
        saveMenu.add(importItem);
        	
        JMenuItem save = new JMenuItem("Save configuration");
        save.setBackground(Color.GRAY);
        saveMenu.add(save);
        
        JMenuItem saveAs = new JMenuItem("Save configuration as");
        saveAs.setBackground(Color.GRAY);
        saveMenu.add(saveAs);
        
        return saveMenu;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createSaveMenu());
        
        menuBar.setBackground(Color.DARK_GRAY);
        
        return menuBar;
    }
	
	public static Frame getFrame() {
		return frame;
	}
	
	public Panel getPanel() {
		return panel;
	}
}
