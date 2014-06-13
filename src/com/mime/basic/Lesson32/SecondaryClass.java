package com.mime.Basic.Lesson32;

public class SecondaryClass {
	
	private String first;
	private String last;
	//static means that the variable wont change once data is incremented 
	//to it, and remains the same until the program is over or more data is added/subtracted
	//from it. All objects that use this share the same static variable, means there is only
	//one of these variables. Only one can be in this class.
	//variable is shared between all objects, doesnt change from object to object.
	private static int members = 0;
	
	public SecondaryClass(String First, String Last){
		//we use local variables to set the strings we passed through the
		//objects to them so we can now call them externally if we wanted to.
		first = First;
		last = Last;
		//every time an object is created add one to the integers members.
		//and the value stays because its a static variable.
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
	
	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
	
	
	
}
