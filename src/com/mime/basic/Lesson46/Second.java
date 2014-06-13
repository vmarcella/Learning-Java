package com.mime.Basic.Lesson46;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Second extends JFrame{
	
	//A string of foods.
	private static String[] nameofFood = {"Bacon", "Wings", "Ham", "Beef", "Pizza"};	
	//this jList holds an array of strings for the names of foods.
	private JList<String> leftList = new JList<String>(nameofFood);
	//this JList holds objects 
	private JList<Object> rightList = new JList<Object>();
	//A Button with the text on it as "Move -->"
	private JButton move = new JButton("Move -->");
	
	
	public Second(){
		
		//sets the title
		super("Multiple Mouse selections");
		//sets the layout.
		setLayout(new FlowLayout());
		//sets the row count.
		leftList.setVisibleRowCount(3);
		//allows you to select multiple things at a time. there is a variation of ones you can do.
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//adds a Scroll panel to the left list.
		add(new JScrollPane(leftList));
		
		move.addActionListener(
				//anonymous inner class. automatically implements Action Listener.
				new ActionListener(){
					//needed method.
					public void actionPerformed(ActionEvent e) {
						//sets whatever you highlighted on the left list to the
						//right list.
						rightList.setListData(leftList.getSelectedValues());
						
					}
					
				}
				
				);
		add(move);
		//sets the amount of rows that are visible by default.
		rightList.setVisibleRowCount(3);
		//sets the fixed height and width of the list
		rightList.setFixedCellHeight(18);
		rightList.setFixedCellWidth(75);
		//allows multiple things to be selected again.
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//adds a JScrollPane to the list.
		add(new JScrollPane(rightList));
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
