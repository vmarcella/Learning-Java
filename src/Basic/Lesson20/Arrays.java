package Basic.Lesson20;

/**
 * Lesson on Arrays
 * @author https://github.com/C3NZ
 *
 */

public class Arrays {
	
	public static void main(String[] args){
		
		//square brackets always indicate arrays. arrays store things inside indexes and as you can see
		//we set the number of indexes that this arrays has is 10.
		int array[] = new int[10];
		
		//this is how you store data to an array index. by default the indexes have a value of zero
		array[0] = 20;
		array[1] = 43;
		array[9] = 234;
		
		//you can print out any array index.
		System.out.println(array[4]);
		
		
		//an array initializer, don't need to create a new variable
		//each time because we can store them inside the curly
		//brackets and they're given a subscript. we created 5 indexes.
		//this makes things a lot easier for storing a lot of indexes
		int array2[] = {23,43,54,56,77};
		
		//will print out 54 because 43 is in index 2
		System.out.println(array2[2]);
		
		
	}
	
}
