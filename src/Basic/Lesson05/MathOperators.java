package Basic.Lesson05;

import java.util.Scanner;

/**
 * <p>Basic demonstrations of math operators like :
 * <p><b> + : Addition operator [5 + 12 = 17] </b>
 * <p><b> - : Subtraction operator [10 - 8 = 2] </b>
 * <p><b> * : Multiplication operator [2 * 4 = 8] </b>
 * <p><b> / : Division operator [12 / 4 = 3] </b>
 * <p><b> % : Remainder (Modulus) [16 % 3 = 1]</b>
 * @author C3NZ
 **/ 
public class MathOperators {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); //creates new scanner for user input.
		int firstNumber, secondNumber, thirdNumber; //creates 3 integers, not assigned any data yet.
		firstNumber = 11; 
		secondNumber = 4;
		thirdNumber = firstNumber % secondNumber;
		System.out.println(thirdNumber); //prints out thirdNumber\
		scanner.close();
	}
}
