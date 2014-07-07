package Basic.Lesson03;


import java.util.Scanner;
/**
 * Detecting User Input from the keyboard. Also requires imports from the Java.util
 * package.
 * @author https://github.com/C3NZ
 *
 */
public class UserInput {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); // creates the scanner, passes System.in through Scanner parameters.
		System.out.println(scanner.nextLine()); //prints out whatever is input to the keyboard
		scanner.close(); //closes the scanner and deletes it from memory.
	}
	
}
