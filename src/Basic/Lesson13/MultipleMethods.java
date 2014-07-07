package Basic.Lesson13;

import java.util.Scanner;

/**
 * Lesson on Multiple methods and instance variables.
 * @author https://github.com/C3NZ
 *
 */
public class MultipleMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	//creates scanner
		Name scObject = new Name();	//creates object
		System.out.print("Enter your name: ");
		
		String parentsName = scanner.nextLine(); //gets the input value from console
		
		scObject.theName(parentsName); //passes the local variable into the "theName" method
		scObject.newMessage();	//runs the "newMessage method, doesn't need any arguments"
		scanner.close();
	}

}
