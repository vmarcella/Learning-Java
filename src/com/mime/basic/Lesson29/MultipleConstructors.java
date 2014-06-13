package com.mime.Basic.Lesson29;

public class MultipleConstructors {

	public static void main(String[] args){
		
		//every time an object is called a constructor runs through its processes.
		
		//calls the constructor with zero arguments.
		SecondaryClass sObject = new SecondaryClass();
		
		//calls the constructor with one argument.
		SecondaryClass sObject2 = new SecondaryClass(5);
		
		//calls the argument with two arguments.
		SecondaryClass sObject3 = new SecondaryClass(5,13);
		
		//calls the constructor with all three arguments.
		SecondaryClass sObject4 = new SecondaryClass(5,13,43);
		
		//using the first object we created it runs the method to Military
		//and prints it out inside a format to make sure its a string.
		//we're using different objects because we are using a different
		//amount of parameters inside the objects in order to use different
		//constructors.
		System.out.printf("%s\n", sObject.toMilitary());
		System.out.printf("%s\n", sObject2.toMilitary());
		System.out.printf("%s\n", sObject3.toMilitary());
		System.out.printf("%s\n", sObject4.toMilitary());
		
	}
	
}
