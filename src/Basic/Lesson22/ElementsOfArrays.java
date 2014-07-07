package Basic.Lesson22;
/**
 * Lesson on elements of arrays
 * @author https://github.com/C3NZ
 *
 */
public class ElementsOfArrays {
	
	public static void main(String[] args){
	
		int array[] = {23,54,65,24,21};
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
		//the sum is equal to whatever the index value
		//the integer i is equal to.	
		sum += array[i];
	}
	System.out.println("The sum of the array is " + sum);
}
}
