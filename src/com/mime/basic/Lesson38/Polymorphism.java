package com.mime.Basic.Lesson38;

//we can use polymorhpic arrays to store objects from classes
//that inherit from a superclass.
public class Polymorphism {

	public static void main(String[] args){
	
	//so we create an array out of the class SuperClass that can
	//hold up to two array indexes.	
	SuperClass objectArray[] = new SuperClass[2];
	//so whats basically going on here is instead of creating an individual object 
	//with its own name each time, we store these objects inside of the array
	//"Object Array" we made, and what that allows us to do is call these objects by
	//the array instead of its own name we'd have to create.
	objectArray[0] = new SecondClass();
	objectArray[1] = new ThirdClass();
	
	//step 1: Create a integer x and set it equal to 0. You'll see why that matters later.
	//Step 2: the conditional, as long as x is smaller than the number of indexes in the
	//array we created, add one to x.
	//Step 3:run the method print from each class we override.
	for (int x = 0; x < objectArray.length; x++){
		objectArray[x].print();
	}
	
	
	}
}
