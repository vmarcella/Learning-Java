package Basic.Lesson37;

//the layout for things in the frame, helps things organize in the screen
import java.awt.FlowLayout;
//all the events that can happen are imported from this code.
import java.awt.event.ActionEvent;
//listens for the user to do something to the gui.
import java.awt.event.ActionListener;

//creates the frame for the application
import javax.swing.JFrame;
//creates a text field we can type in
import javax.swing.JTextField;
//same thing as a password field except the text is hidden.
import javax.swing.JPasswordField;
//little box that pops up and can hold texts and other fields of sorts.
import javax.swing.JOptionPane;

//gives us all methods from JFrame class through inheritance.
public class Secondary extends JFrame{

		//the objects and variables for all these imported classes
		private JTextField text1 = new JTextField(10);
		private JTextField text2 = new JTextField("Enter text here");
		private JTextField text3 = new JTextField("You cannot edit this", 20);
		private JPasswordField passwordField = new JPasswordField("Password");
		
		//constructor
		public Secondary(){
			//sets the title of the Frame.
			super("Title");
			//we set the layout, a method inside a method really, but
			//this is the default layout
			setLayout(new FlowLayout());
			//sets the text field to not be allowed to edited when set to false.
			//true by default.
			text3.setEditable(false);
			//adds to the window
			add(text1);
			add(text2);
			add(text3);
			add(passwordField);
			
			//always need an event handling class.
			//every time you use this object it refers to the class
			//the object is for. we give each of these text boxes and
			//password fields functionality. we pass through the object 
			//because the method addActionListener takes in methods for its
			//parameters.
			Handler hObject = new Handler();
			text1.addActionListener(hObject);
			text2.addActionListener(hObject);
			text3.addActionListener(hObject);
			passwordField.addActionListener(hObject);
			//how the program closes
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//sets size of the frame
			setSize(350, 100);
			//sets the frame visible
			setVisible(true);
			//sets the location of the field
			setLocationRelativeTo(null);
		}
		//this class inherits everything that was in the previous class secondary so we can
		//use any methods or variables from secondary class in here, it implements ActionListener which
		//just allows us to use the action listener in this class. Action listener allows 
		//things to wait for the event to happen and once the event happens it can execute code.
		private class Handler implements ActionListener{
			
			//this is a built in method that needs to be named this, it executes
			//when an action is performed, or whenever this class is called.
			public void actionPerformed(ActionEvent event){
				
				//set string equal to nothing in it.
				String string = "";
				
				//so basically we do here is we look to see if anyone typed
				//Anything into any of these text boxes and hits enter, we want to
				//set string equal to field (whatever one you entered in), and what you entered.
				//get action command returns strings of whatever is typed in that is associated with
				//this action.
				
				//event.getSource just finds the location of where the action happened.
				if(event.getSource() == text1)
					string = String.format("field 1: %s", event.getActionCommand());
				else if(event.getSource() == text2)
					string = String.format("field 2: %s", event.getActionCommand());
				else if(event.getSource() == text3)
					string = String.format("field 3: %s", event.getActionCommand());
				else if(event.getSource() == passwordField)
					string = String.format("password field is: %s", event.getActionCommand());
				
				//prints everything after action is completed.
				//first argument is the positioning, and second is what you want it to print.
				JOptionPane.showMessageDialog(null, string);
			}
			
		}
		
}
