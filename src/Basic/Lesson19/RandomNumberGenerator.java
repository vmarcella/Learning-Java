package Basic.Lesson19;

import java.util.Random;

/**
 * Lesson on Random number generators
 * @author https://github.com/C3NZ
 *
 */

public class RandomNumberGenerator {
	
	public static void main(String[] args){
		Random die = new Random();	//object for random number generator
		int number;
		
		
		for(int counter = 1; counter <= 10; counter++){//as long as counter is less than or equal to 10, keep doing these functions
			
			number = 1 + die.nextInt(6);	//number generators start at 0 so we add 1 because dice can never roll a 0.
			System.out.println("you rolled a " + number); //print out what you rolled
		}
	}
}
