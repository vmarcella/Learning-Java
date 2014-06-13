package Basic.Lesson31;

import java.util.EnumSet;

//enumerations are like classes but are used for different things.
public class Enumerations {

	public static void main(String[] args){
	
		//we make an enhanced for loop.
		//we call the class through the object we make
		//called sObject. Enumerations make built in arrays
		//and we call them as seen down below. values is a key Word
		//that can't be changed.
		//the sObject loops through the names of the objects or
		//constants inside the enumeration class we made, not its data
		//inside the parenthesis.
	for(SecondaryClass sObject: SecondaryClass.values())
		//the format is all strings.
		//So we print out the name of the method or constant we're on in the array
		//then we run the method to get the description of the constant we're on
		//which will go through the constructor we made in the other class.
		//then we get the age of the object or constant we're on by also passing through the constructor 
		//whenever the object is made.
		System.out.printf("%s\t%s\t%s\n", sObject, sObject.getDesc(), sObject.getAge());
	
	System.out.println("\nAnd now for the range of constants!!!\n");
	
		//we import the enumSet so we can get a range form enums we want to print out instead of printing out every
		//single constant. it takes in two arguments, the from where you want to start, and where
		//you want it to end.
		for(SecondaryClass sObject : EnumSet.range(SecondaryClass.Vincenzo, SecondaryClass.Lily)){
			System.out.printf("%s\t%s\t%s\n", sObject, sObject.getDesc(), sObject.getAge());
		}
	
	}
}
