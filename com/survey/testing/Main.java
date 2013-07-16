package com.survey.testing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Main extends JFrame{
	
	
	ButtonPanel buttonPanel = null;
	static Decorator decorator =  null;
	Main(){
		super();
		decorator = new Decorator();
		buttonPanel = new ButtonPanel();
		setSize(1000,400);
		getContentPane().add(buttonPanel,BorderLayout.SOUTH);
		getContentPane().add(decorator,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args){
		new Main();
	}
}