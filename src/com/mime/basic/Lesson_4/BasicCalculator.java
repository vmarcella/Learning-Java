package com.mime.Basic.Lesson_4;

//Must make an import on the scanner.
import java.util.Scanner;

//Lesson on making a basic calculator.
public class BasicCalculator {

	public static void main(String[] args) {
		
		//We make a user input scanner variable here.
		//Needs to know where to get input from.
		Scanner scanner = new Scanner(System.in);
		
		//if you have a lot of variables you can write them out all on
		//one line as long as you're not giving them values yet.
		double firstNumber, secondNumber, answer;
		
		
		//So what is going on here is we're  printing a line that prompts
		//us to enter our first number. the number we enter will be saved to the double 
		//which is a built in method. Then it asks for our second number, which we just repeat
		//the process of storing it into our secondNumber variable. Then with our variable answer
		//we set it equal to whatever the firstNumber plus the SecondNumber is. and then
		//we print it out.
		System.out.print("Enter your first number: ");
		firstNumber  = scanner.nextDouble();
		
		System.out.print("Enter your second number: ");
		secondNumber = scanner.nextDouble();
		
		answer = firstNumber + secondNumber;
		System.out.println("Your answer is: " + answer);
	}

}
