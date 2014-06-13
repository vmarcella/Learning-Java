package com.mime.Basic.Lesson42;

import javax.swing.JFrame;//import the frame
import java.awt.FlowLayout;//import the default layout
import java.awt.event.ActionListener;//import the Listener for events
import java.awt.event.ActionEvent;//import what happens if an event occurs
import javax.swing.JButton;//imports the button
import javax.swing.Icon;//imports the Icon we set
import javax.swing.ImageIcon;//imports the Image Icon loader
import javax.swing.JOptionPane;//Imports the JOption Pane.

public class Second extends JFrame{

	private JButton button;
	private JButton customButton;
	public Second(){
		
		super("The title");//allows access to JFrame class. Also names the title.
		setLayout(new FlowLayout()); // gives us a default layout.
		
		button = new JButton("Button"); // sets name of button and creates object for it
		add(button);	//adds it to screen
		
		//we create a new icon and set it equal to the photos we created in paint.
		//phtots must be in the same package as this class in order for it to work.
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.png"));
		
		//we name the button and set the the icon we want to use here.
		customButton = new JButton("Custom", b);
		customButton.setRolloverIcon(x);//roll over is when we move the mouse on to the button
		add(customButton);
		
		HandlerClass hObject = new HandlerClass();//create the object for the HandlerClass
		button.addActionListener(hObject);//add the action listener to these buttons
		customButton.addActionListener(hObject);
		
		
		setSize(150,120);//sets size of frame
		setVisible(true);//sets visibility of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets how it closes
		setLocationRelativeTo(null);//sets the location at which its created.
		setResizable(false);//sets resizable.
	}
	
	//allows us to inherit all the methods form ActionListener but we must overwrite it.
	//waits for ana ction to happen.
	private class HandlerClass implements ActionListener{

		//when an action is performed to where we have an action listener.
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand() + " was pressed"));

			
		}
		
	}
	
}
