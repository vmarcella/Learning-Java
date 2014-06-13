package com.mime.Basic.Lesson40;

public class AnimalList {

	private Animal[] theList = new Animal[5];
	private int counter = 0;
	
	//any object with the data type of the animal class can pass through here.
	public void newAnimal(Animal a){
		if(counter < theList.length);
		theList[counter] = a;
		System.out.println("New animal added at index " + counter);
		counter++;
	}
	
}
