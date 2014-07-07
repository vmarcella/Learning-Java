package Basic.Lesson15;

import java.util.Scanner;
/**
 * 
 * @author https://github.com/C3NZ
 *
 */
public class SimpleAveraging {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	//gets input
			int total = 0;
			int grade;
			int average;
			int counter = 0;
			
			while(counter < 10){ //as long as counter is less than 10
				grade = input.nextInt(); //gets the grade you added
				total = total + grade; //adds it to the total
				counter++;	//adds one to counter
			}
			average = total / 10; //you divide by however many averages you have
			System.out.println("Your average is " + average);
			input.close();
	}
}
