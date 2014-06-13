package com.mime.Basic.Lesson11;

//Going to teach the use of multiple classes instead of just one.
public class MultipleClasses {
	
	public static void main(String[] args) {
		
		//we turned the class we made into an object as seen here.
		//this is how you bring methods from other classes into this class
		//we then used the object and brought over our method friom the other class
		//and now it will print oiut into the screen.
		SecondaryClass scObject = new SecondaryClass();
		scObject.newMessage();

	}

}
