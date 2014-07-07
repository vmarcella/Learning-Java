package Basic.Lesson04;

import java.util.Scanner;

/**
 * Basic Calculator that adds two numbers together, demonstrates some basic math in java.
 * 
 * @author https://github.com/C3NZ
 **/
public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //creates the source for getting user input from the console.
		
		double firstNumber, secondNumber, answer; // creates three doubles, not assigned
		
		
		System.out.print("Enter your first number: ");
		firstNumber  = scanner.nextDouble(); //gets the first user input, must be type of a double.
		
		System.out.print("Enter your second number: ");
		secondNumber = scanner.nextDouble(); //gets the second user input, also must be the type of a double.
		
		answer = firstNumber + secondNumber; //combines both the first double and the second double
		System.out.println("Your answer is: " + answer); //whenever you want to use more than one thing on a print line you can use +
	
		scanner.close();
	} 

}
