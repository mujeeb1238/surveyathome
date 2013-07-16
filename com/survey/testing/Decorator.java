package com.survey.testing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Decorator extends JPanel{
	
	
	Decorator(){
		setBackground(Color.green);
		setLayout(new BorderLayout());
		
	}
	
	public void decorateMe(JPanel panel){
		//super.removeAll();
//		/System.out.println(this.getColumnCount());
		this.removeAll();
		//this.validate();
		//this.repaint();
		panel.setBackground(Color.WHITE);
		this.add(panel,BorderLayout.CENTER);
		//super.validate();
		this.validate();
		//this.repaint();
	}
}