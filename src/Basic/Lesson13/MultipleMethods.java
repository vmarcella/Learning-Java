package Basic.Lesson13;

import java.util.Scanner;

//Multiple methods and instance variables.
public class MultipleMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SecondaryClass scObject = new SecondaryClass();
		System.out.print("Enter name of parent here: ");
		
		//we create a  string named name, and sets it to whatever we input it.
		//we then set the value of the string equal to the string name we created
		//in the parameters in the other class. then we run the next mehtod newMesage to print it out.
		String parentsName = scanner.nextLine();
		
		scObject.theName(parentsName);
		scObject.newMessage();
		scanner.close();
	}

}
