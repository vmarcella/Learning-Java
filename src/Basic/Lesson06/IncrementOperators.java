package Basic.Lesson06;

import java.util.Scanner;

public class IncrementOperators {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber = 5;
		int secondNumber = 18;
		
		//This is an incriment operator. they signs have to be used twice
		//Pre incrimenting is different than post incrimenting
		//
		//    Pre incrementing ex: ++firstNumber;
		//    Post incrementing ex: firstNumber++;
		//
		//The difference is, is what pre does is pre is add it before its used
		//and post does it after its used the first time. Only has an effect when
		//being used in the print method.
		firstNumber++;
				
		//what this does is instead of assigning the value of 
		//secondNumber to two, we add it to secondNumber increasing the 
		//Variables value to twenty.
		secondNumber += 2;
		
		System.out.println("Here is the first number: " + firstNumber);
		System.out.println("here is the second: " + secondNumber);
	}	
}
