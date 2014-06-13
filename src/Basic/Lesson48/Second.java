package Basic.Lesson48;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Second extends JFrame{
	private String details;
	private JLabel statusbar = new JLabel();
	
	public Second(){
		//Sets the title of the page.
		super("Adapters");
		//adds the status bar to the screen.
		add(statusbar, BorderLayout.SOUTH);
		//adds a mouse listener to the JFrame itself with the paramater of the class object
		MouseClass mouseObject = new MouseClass();
		addMouseListener(mouseObject);
		//sets the size of the screen
		setSize(400, 400);
		//sets the location to the middle
		setLocationRelativeTo(null);
		//sets the JFrame visible.
		setVisible(true);
	}
	
	//instead of implementing all methods from the Mouse Event class we extend the 
	//mouse adapter which does the same exact thing except you dont have to use every method
	//method which is good for code neatness.
	private class MouseClass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			
			//sets the string details equal to the click count.	
			details = ("You clicked: "+ e.getClickCount());
			
			//if the button that was pressed is equal to the 
			//left button, middle wheel, or the right button
			//the string details gets this text added on depending which one is
			//clicked on.
			if(e.getButton() == MouseEvent.BUTTON1){
				details += (" with left mouse button");
			}else if(e.getButton() == MouseEvent.BUTTON2){
				details += (" with the middle mouse button");
			}else if(e.getButton() == MouseEvent.BUTTON3){
				details += (" with the right mouse button");
			}
		//sets our status bar's text to the outcome of the string details.
			statusbar.setText(details);
		}
	}
	
}
