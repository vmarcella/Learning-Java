package Basic.Lesson35;

//imported the components for the JOptionPane to work and be loaded.
import javax.swing.JOptionPane;

public class GraphicalInterface {

	public static void main(String[] args){
		
		//will prompt you to input a number into a Option pane, by default stores everything by 
		//string because thats how you get the jOptionPane to work.. Option panes are used for user
		//input.
		String firstNumber = JOptionPane.showInputDialog("Enter first number");
		
		String secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		//we parse the any number we enter into the first and second box
		//and what parse means is that we actually convert the string into an integer so 
		//originally when we enter 5 it has no numerical value because it is stored a
		//string but if we parse it, it becomes an integer and gets the value of whatever number we 
		//put in.
		int numberOne = Integer.parseInt(firstNumber);
		int numberTwo = Integer.parseInt(secondNumber);
		
		
		int sum  = numberOne + numberTwo;
		
		//message dialogs are used for just displaying a message.
		//1st parameter is positioning
		//2nd parameter is what you want it to say inside.
		//3rd parameter is the title
		//4th parameter is the format in which you want the message dialog box to be in
		JOptionPane.showMessageDialog(null,"The sum is " + sum, "sum of products", JOptionPane.PLAIN_MESSAGE );
	}
	
		
}
