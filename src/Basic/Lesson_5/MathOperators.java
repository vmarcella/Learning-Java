package Basic.Lesson_5;

import java.util.Scanner;

//Learning basic math operators.
public class MathOperators {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		//Play around with this code and make your own Math operators
		//(+, -, *, /)
		//% is a modulus. it can be used to find the remainder of whatever you're dividing.
		//so if you divide 3 by 2, the modulus will be 1 because there is one left over.
		int girls, boys, people;
		girls = 11;
		boys = 4;
		people = girls % boys;
		System.out.println(people);
		
	}
	
	
}
