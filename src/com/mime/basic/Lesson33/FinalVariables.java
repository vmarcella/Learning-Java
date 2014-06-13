package com.mime.Basic.Lesson33;

public class FinalVariables {

	public static void main(String[] args) {
		
		//set the value of the number variable to ten, so it cannot change.
		SecondaryClass sObject = new SecondaryClass(10);
	
		//create a for loop, the variable doesnt matter
		//because it only exists inside the method. we run
		//the method add five times which adds 10 to overand over again
		//to the integer sum, and then looks for a string inside the class
		//we pulled the object from and will look for the toString method
		//and print it out and repeat.
		for(int i = 0; i < 5; i++){
			sObject.add();
		}
		
		System.out.printf("%s", sObject);
		
	}

}
