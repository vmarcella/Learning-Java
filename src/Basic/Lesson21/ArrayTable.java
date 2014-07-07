package Basic.Lesson21;
/**
 * Lesson on array tables
 * @author https://github.com/C3NZ
 *
 */
public class ArrayTable {
	public static void main(String[] args){
		//\t means tab.
		System.out.println("Index\tValue");
		int array[] = {23,45,56,78,46};
		
		//i is just for the for loop to count up, we start it
		//at zero because all array indexes start at zero and we 
		//add one to the integer i until its equal to the length of the
		//array indexes which is 5. we then print out i so we can tell what index we
		//are in and then print out the array with i as the index because thats how we're going to call
		//each index from 0 to 4
		for(int i = 0; i< array.length; i++){
			System.out.println(i + "\t" + array[i]);
		}	
	}
}
