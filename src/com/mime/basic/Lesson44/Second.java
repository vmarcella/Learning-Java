package com.mime.Basic.Lesson44;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Second extends JFrame{
	
	
	//stores photos in an array.
	private Icon[] pictures = {new ImageIcon(getClass().getResource(photoName[0])), new ImageIcon(getClass().getResource(photoName[1]))};
	
	//stores name of the photos we're using into an array.
	private static String[] photoName = { "b.png", "x.png" };
	
	//the parameter takes in an array and thats what the name of the combo boxes are going to be in order.
	private JComboBox box = new JComboBox(photoName);
	//allows the photo to appear on the screen. The parameter takes the photo thats going to be placed on the
	//screen as soon as you run the program.
	private JLabel picture = new JLabel(pictures[0]);

	public Second(){
		//sets title
		super("The title");
		//sets the layout
		setLayout(new FlowLayout());
		
		//adds an item listener because Items have states where they store whats going on.
		box.addItemListener(
				//Anonymous inner class. instead of making a class that  implements the ItemListener
				//the inner class automatically does it all we need to do is add the needed methods.
				new ItemListener(){
					//needed method, takes in the ItemEvent for the parameter.
					public void itemStateChanged(ItemEvent e){
						//if you changed one of the drop downs on the combo box list
						if(e.getStateChange() == ItemEvent.SELECTED){
							//set the JLabel to display the new selected index in the box array.
							picture.setIcon(pictures[box.getSelectedIndex()]);
						}
					}
				}
				);
		//adds it to the screen.
		add(box);
		add(picture);
		//sets size.
		setSize(500,500);
		//sets location relative to the middle of the screen.
		setLocationRelativeTo(null);
		//sets it visible.
		setVisible(true);
		
	}
	
	
}
