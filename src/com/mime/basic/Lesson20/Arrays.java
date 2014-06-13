package com.mime.Basic.Lesson20;

public class Arrays {
	
	public static void main(String[] args){
		
		//square brackets let you know that you're going to be making
		//an array. our array can hold ten integers.
		int array[] = new int[10];
		
		//This is known as an index of an array.
		//from 0 - 9 always.
		array[0] = 20;
		array[1] = 43;
		array[9] = 234;
		
		//you can print out any array index.
		System.out.println(array[1]);
		
		
		//an array initializer, don't need to create a new variable
		//each time because we can store them inside the curly
		//brackets and they're given a subscript. we created 5 indexes.
		//this makes things a lot easier for storing a lot of indexes
		int array2[] = {23,43,54,56,77};
		
		//will print out 54 because 43 is in index 2
		System.out.println(array2[2]);
		
		
	}
	
}
