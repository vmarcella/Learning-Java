package com.mime.Basic.Lesson39;

public class PolymorphicArguments {

	public static void main(String[] args){
		
		//we create an object for the printer class.
		Printer pObject = new Printer();
		//Step 1: We create references with the data type of SuperClass
		//Step 2: we name them cObject, cObject2, and cObject3
		//Step 3: we then set it equal to a new version of the class we are referring to, or the object
		//of what we're making.
		SuperClass cObject2 = new SecondClass();
		SuperClass cObject3 = new ThirdClass();
		
		//we then use the objects to run the method that will print everything. this will only work
		//for polymorphism because each object that we run through here has to have the same types of methods
		//and data encapsulated in them in order to be passed through with the data type of SuperClass.
		pObject.runIt(cObject2);
		pObject.runIt(cObject3);
	}
	
}
