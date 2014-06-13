package com.mime.Basic.Lesson25;

public class ArraysInMethods {

	public static void main(String[] args){
		
		//created an array with 6 indexes.
		int array[] = {1,2,3,4,5,6};
		//we run the method add taking in our array.
		add(array);
		
		//after the method add is finished, we now use a 
		//enhanced for loop that creates a variable x, and reads from
		//the array, array we created, and prints out the values of each index of the
		//array until it is fully emptied.
		for (int x : array){
			System.out.println(x);
		}
		
	}
	
	//a method for adding 5 into each number we stored into the index.
	public static void add(int i[]){
		//so, we create a new variable named index, and as long as index is
		//less than the number of indexes the array has, run this method, and 
		//increment index by one, and repeat the cycle.
		for (int index = 0; index < i.length; index++){
			//so then, the array we passed through and whatever index value it is
			//on, will be incremented by 5.
			i[index] += 5;
		}
	}
	
	
}
