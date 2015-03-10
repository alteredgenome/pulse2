//Pulse2 Engine
//(c) 2015 DuoCore Studios
//This software's code is not open source, and you cannot change or redistribute it
//The code has been made publically available for the sake of growing developers
//"Launcher.java"
//"Launcher Class"
package com.duocore.pulse2;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Launcher extends JFrame {
	private static final long serialVersionUID = -6224390548062243879L;
	
	private JPanel window = new JPanel();
	private JButton play, options, about, quit;
	private Rectangle rplay, roptions, rabout, rquit;
	
	private int width = 240;
	private int height = 320;
	private int button_width = 80;
	private int button_height = 40;
	
	public Launcher() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Launcher Successfully Initialized!");
		setTitle("Pulse2 Launcher");
		setSize(new Dimension(width, height));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(window);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		window.setLayout(null);
		
		drawButtonCluster();
	}
	
	private void drawButton_Play() {
		play = new JButton("Play");
		rplay = new Rectangle((width/2)-(button_width/2), 60, button_width, button_height);
		play.setBounds(rplay);
		window.add(play);
	}
	
	private void drawButton_Options() {
		options = new JButton("Options");
		roptions = new Rectangle((width/2)-(button_width/2), 110, button_width, button_height);
		options.setBounds(roptions);
		window.add(options);
	}
	
	private void drawButton_About() {
		about = new JButton("About");
		rabout = new Rectangle((width/2)-(button_width/2), 160, button_width, button_height);
		about.setBounds(rabout);
		window.add(about);
	}
	
	private void drawButton_Quit() {
		quit = new JButton("Quit");
		rquit = new Rectangle((width/2)-(button_width/2), 210, button_width, button_height);
		quit.setBounds(rquit);
		window.add(quit);
	}
	
	private void drawButtonCluster() {
		drawButton_Play();
		drawButton_Options();
		drawButton_About();
		drawButton_Quit();
	}
	
}
//End Launcher.java
