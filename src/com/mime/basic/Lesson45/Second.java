package com.mime.Basic.Lesson45;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Second extends JFrame{

	//array for color names for picking them on the JList.
	private static String[] colornames = {"Black", "Blue", "Red", "White"};
	
	//array for the colors
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

	private JList<String> list = new JList<String>(colornames);
	
	public Second(){
		super("Choose a color!");
		setLayout(new FlowLayout());
		//sets how many rows are visible for the list
		list.setVisibleRowCount(4);
		//this only allows you to select one thing at a time. other modes include multiple selections
		//etc.
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//adds a JScrollPane to the list and then adds it to the screen.
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				//another anonymous inner class. automatically implements List selection listener
				//for you.
				new ListSelectionListener(){

					//method that needs to be imported.
					public void valueChanged(ListSelectionEvent e) {
						//in order to change the background you need to access through the content pane.
						//we set the background to whatever index you select on the list. turns into an int
						//from 0-3
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}
					
				}
				);
		//sets size of the window
		setSize(200,200);
		//sets it to the middle
		setLocationRelativeTo(null);
		//sets it visible
		setVisible(true);
		
	}
}
