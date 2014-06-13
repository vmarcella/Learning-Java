package com.mime.Basic.Lesson40;

//arrays that hold objects
public class ClassToHoldObjects {

	public static void main(String[] args){
		
		//create all the object
		AnimalList alObject = new AnimalList();
		Dog dObject = new Dog();
		Fish fObject = new Fish();
		
		alObject.newAnimal(dObject);
		alObject.newAnimal(fObject);
	}
}
