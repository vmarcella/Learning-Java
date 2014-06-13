package Basic.Lesson47;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Second extends JFrame{
	
	private JPanel mousepanel = new JPanel();
	private JLabel mouseStatus = new JLabel("Nothing is happening");
	
	public Second(){
		//sets the title of the window.
		super("Mouse events");
		
		//sets the background color to white.
		mousepanel.setBackground(Color.WHITE);
		
		//sets the JPanel at the middle of the screen.
		add(mousepanel, BorderLayout.CENTER);
		//sets the status bar at the bottom of the screen
		add(mouseStatus, BorderLayout.SOUTH);
		
		//object for the handler class
		HandlerClass hObject = new HandlerClass();
		
		//adds a motion listener and a mouse listener to the panel we have inside the 
		//the J frame.
		mousepanel.addMouseListener(hObject);
		mousepanel.addMouseMotionListener(hObject);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//class for implementing and handling all of the mouse events.
	private class HandlerClass implements MouseListener, MouseMotionListener{

		//mouse listener methods.
		
		//when you click once on the mouse inside the panel it will give you the coordinates
		//at which you clicked at.
		public void mouseClicked(MouseEvent e) {
			mouseStatus.setText("Mouse was clicked at: " + "X:" + e.getX() + " " + "Y:" + e.getY());
			
		}

		//when the mouse enters the the mouse panel, it will change the color to red and display a text
		//saying the mouse has entered the area.
		public void mouseEntered(MouseEvent e) {
			mouseStatus.setText("Mouse entered the area");
			mousepanel.setBackground(Color.RED);
			
		}

		//when the mouse exits the mouse panel it will return the color to white and 
		//alert the user that you have left the panel.
		public void mouseExited(MouseEvent e) {
			mouseStatus.setText("Mouse exited the area");
			mousepanel.setBackground(Color.WHITE);
		}

		//when you hold down on the mouse but aren't moving with it, it'll alert you.
		public void mousePressed(MouseEvent e) {
			mouseStatus.setText("You are pressing down on the mouse");
			
		}

		//when you stop holding down on the mouse after pressing it and release it.
		public void mouseReleased(MouseEvent e) {
			mouseStatus.setText("You released the mouse");
			
		}
		
		
		//mouse Motion events. different from  Mouse listener. The mouse must be in motion
		
		//when you drag the mouse across the panel while pressing down on it.
		public void mouseDragged(MouseEvent e) {
			mouseStatus.setText("The mouse is being dragged");
			
		}

		//when the mouse is in motion going across the screen.
		public void mouseMoved(MouseEvent e) {
			mouseStatus.setText("The mouse moved");
			
		}
		
	}
	
}


	