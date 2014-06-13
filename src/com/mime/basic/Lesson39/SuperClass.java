package com.mime.Basic.Lesson39;

//our superclass. every subclass gets its methods unless made private.
//abstract classes are classes that cannot have objects made from them while concrete is the inverse 
//of this. Most classes are concrete by default and abstract is only useful for inheritance and polymorphism
abstract public class SuperClass {

	//when you create references of objects in the data type of superclass never really use the object of the 
	//superclass because it is too big.
	
	//any class that inherits this method cannot be allowed to change the amount of arguments
	//it takes in or else they'd be completely different and overload. All methods must be returning the same thing
	//too. cannot change the visibility of the methods either. an overloaded method is a method with the
	//same name but different amount of arguments
	
	//Abstract means that this method must be over written inside of its sub classes, and it doesnt need
	//a body because the class must be abstract too so an object of this class cannot be created anyways.
	//
	abstract void print();
	
	
}
