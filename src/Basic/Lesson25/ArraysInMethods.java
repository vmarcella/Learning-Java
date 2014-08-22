package Basic.Lesson25;
/**
 * Lesson on Arrays used in methods
 * @author https://github.com/C3NZ
 *
 */
public class ArraysInMethods {

	public static void main(String[] args){
		
		int array[] = {1,2,3,4,5,6};	//Six index array
		
		add(array);	//Runs the method passing array through
		
		
								 
		for (int x : array){	//Runs after the add method has fully executed and changed all the
			System.out.println(x);
		}
	}
	
	//method for adding 5 into each array.
	public static void add(int i[]){
		//First we create a value to tell us what index we're at
		//Second we test to see if the index is less than the arrays index length 
		//If it is then keep adding to integer index until it is not true anymore
		for (int index = 0; index < i.length; index++){
			//i[] is the array
			//index will represent the index we're talking about
			//adds 5 to whatever index in the array is summoned.
			i[index] += 5;
		}
	}
	
	
}
