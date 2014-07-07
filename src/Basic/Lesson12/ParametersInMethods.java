package Basic.Lesson12;


import java.util.Scanner;

/**
 * Lesson on usage of a methods parameters
 * @author C3NZ
 *
 */
public class ParametersInMethods {
	public static void main(String[] args){
			
		Scanner scanner = new Scanner(System.in);	//gets input from keyboard through eclipse console
		NewMessage scObject = new NewMessage();	//creates object
			
		System.out.print("Enter your name: ");
		String user = scanner.nextLine();	//gets input, sets it equal to string
			
		//use method from NewMessage class non statically, passes through our string as an argument
		//and now the newMessage method has access to that variables's data.
		scObject.newMessage(user);
		scanner.close();	//closes scanner
		}
	
	
	
}
