package Basic.Lesson43;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Second extends JFrame{
	
	//first parameter takes what text is going to be there already and then its size of the row.
	private JTextField textField = new JTextField("Sentence", 20);
	//sets the name of the check boxes in the parameters.
	private JCheckBox boldBox = new JCheckBox("Bold");
	private JCheckBox italicBox = new JCheckBox("Italic");
	
	public Second(){
		//sets the title of the JFrame through its constructor.
		super("Title");
		//sets the layout of the whole entire frame.
		setLayout(new FlowLayout());
		//sets the font of the textfield.
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		//adds all these components to the JFrame.
		add(textField);
		add(boldBox);
		add(italicBox);
		
		//we create a object for the handler class with the data type of the handler class.
		HandlerClass handler  = new HandlerClass();
		//we add itemlisteners to both the italic and the bold box. the parameter accepts the 
		//objects as its arguments form a class that implements the Item Listener.
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
		//sets size of the JFrame.
		setSize(300,81);
		//sets it resizable.
		setResizable(false);
		//stes it to close whenever you exit out of the application.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sets it to the center of the screen.
		setLocationRelativeTo(null);
		//sets it visible.
		setVisible(true);
		
	}
	
	//we implement ItemListener which means that we must use all of its methods.
	private class HandlerClass implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			//create a new font object.
			Font font;
			
			//if these are selected, do this code.
			if(boldBox.isSelected() && italicBox.isSelected()){
				font  = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(italicBox.isSelected()){
				font  = new Font("Serif", Font.ITALIC, 14);
				}
			else if(boldBox.isSelected()){
				font  = new Font("Serif", Font.BOLD, 14);
				}
			else{
				font = new Font("Serif", Font.PLAIN, 14);
				}
			
			textField.setFont(font);	
		}	
	}
}
