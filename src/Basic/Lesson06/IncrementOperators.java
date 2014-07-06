package Basic.Lesson06;

import java.util.Scanner;
/**
 * <p>Demonstations on the increment operator:
 * 
 * <p><b>Pre incrementing ex: ++firstNumber;</b>
 * <p><b>Post incrementing ex: firstNumber++;</b>
 * <p><b>Difference: Pre incrementing adds 1 to the variable before it's used in the method, while Post incrementing does it after the method
 * 
 * @author C3NZ
 **/ 
public class IncrementOperators {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in); //creates the scanner object for user input.
		
		int firstNumber = 5; //assign firstNumber to 5
		int secondNumber = 18; //assign secondNumber to 18
		
		firstNumber++; //adds 1 to firstNumber 
				
		secondNumber += 2; //Adds two to the secondNumber variable instead of assigning its value to 2.
		
		System.out.println("Here is the first number: " + firstNumber); //prints
		System.out.println("here is the second: " + secondNumber); //prints
		scanner.close();
	}	
}
