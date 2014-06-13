package Basic.Lesson36;

//is the layout of the frame, helps organize things
//on screen when space is taken up.
import java.awt.FlowLayout;
//the frame for whatever operating system you're using.
import javax.swing.JFrame;
//imports for a way of putting texts and labels on the screen.
import javax.swing.JLabel;

//we need this class to inherit everything from the imported JFrame
//class

public class Secondary extends JFrame{

	//creates an object out of the JLabel class.
	//the new JLabel is not a requirement, but you can
	//put the name of the label or the text that will display in the parameters
	private JLabel label1 = new JLabel("this is a sentence");
	
	//constructor for the class, runs every time an object for this class is created
	//inside another method or another class.
	public Secondary(){
		//this is how you add a title for the window.
		super("The title bar");
		//imported from FlowLayout and is the basic format for formatting the screen.
		setLayout(new FlowLayout());
		//pops up whenever you hover over the label1 Jlabel.
		label1.setToolTipText("This is a tooltip!");
		//adds the label to the User interference
		add(label1);
		//default operation for closing the gframe, clicking the red
		//button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sets the size of the frame.
		setSize(275, 180);
		//sets the frame visible to the eye
		setVisible(true);
		//sets where it pops up, 
		setLocationRelativeTo(null);
	}
	
}
