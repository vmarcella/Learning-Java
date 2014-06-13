package com.mime.Basic.Lesson19;

import java.util.Random;


public class RandomNumberGenerator {
	
	public static void main(String[] args){
		//creates a random number generator which can generate
		//things at random.
		Random dice = new Random();
		int number;
		
		
		for(int counter = 1; counter <= 10; counter++){
			//add 1 so we never get 0 and can get 6.
			//we set the number to 6 because we only want
			//6 values to be allowed to generate in this array
			//it will only generate values of 0-5, always starts at
			//0
			number = 1 + dice.nextInt(6);
			System.out.println("number" + number);
		}
	}
}
