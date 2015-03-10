//Pulse2 Engine
//(c) 2015 DuoCore Studios
//This software's code is not open source, and you cannot change or redistribute it
//The code has been made publically available for the sake of growing developers
//"Component.java"
//"Main Class"

//Begin Component.java
package com.duocore.pulse2;
import javax.swing.JFrame;

public class Component extends JFrame{
	private static final long serialVersionUID = -6591350457336775309L;

	public static void main(String args[]) {
		System.out.println("Pulse2 Engine");
		System.out.println("(c) 2015 DuoCore Studios");
		System.out.println("\n");
		System.out.println("Initializing Launcher...");
		new Launcher();
		
	}
}
//End Component.java
