package Basic.Lesson10;

import java.util.Random;

/**
 * 
 * <p>Introduction to while loops.</p>
 * <p>While loops are used for running code for an unknown amount of times
 * .
 * 
 * @author C3NZ
 *
 */
public class WhileLoops {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(101); //0 - 100 can be set to number
			
			while(number <= 100){ //do this as many times as needed
				System.out.println(number);
				number++;//add one to the number
			}

	}

}
