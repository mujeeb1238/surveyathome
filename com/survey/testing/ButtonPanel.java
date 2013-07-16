package com.survey.testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonPanel extends JPanel implements ActionListener{

	JButton nextButton = null;
	JButton previousButton = null;
	CompOnThisPanel comp = null;
	


	ButtonPanel(){
			super();
			nextButton = new JButton("Next");
			previousButton = new JButton("Previous");
			
			setLayout(new BorderLayout());
			add(nextButton,BorderLayout.EAST);
			add(previousButton ,BorderLayout.WEST);
			setBackground(Color.red);
			nextButton.addActionListener(this);
			previousButton.addActionListener(this);
	}
	
	int x1 = 100;
	int x2 = 200;
	int x3 = 300;
	int y = 100;
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==nextButton){
			comp = new CompOnThisPanel();
			comp.setLayout(null);
			for(int i=0; i<5;i++){
				JButton b1 = new JButton("Button: "+i);
				JCheckBox cb = new JCheckBox("CheckBox: "+i);
				b1.setBounds(x2,y,100,25);
				comp.add(b1);
				cb.setBounds(x3,y+=25,100,25);
				comp.add(cb);
				
			}
			Main.decorator.decorateMe(comp);
			//Main.decorator.validate();
		}
		if(ae.getSource()==previousButton){
			comp = new CompOnThisPanel();
			comp.setLayout(null);
			for(int i=0; i<5;i++){
				JTextField tf = new JTextField(15);
				JButton b1 = new JButton("Button: "+i);
				tf.setBounds(x1,y,100,25);
				comp.add(tf);
				b1.setBounds(x2,y-=25,100,25);
				comp.add(b1);
			}
			Main.decorator.decorateMe(comp);
		}
	}
}