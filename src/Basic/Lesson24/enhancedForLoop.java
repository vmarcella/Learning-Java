package Basic.Lesson24;
/**
 * Lesson on enhanced for loops
 * @author https://github.com/C3NZ
 *
 */
public class enhancedForLoop {

	public static void main(String[] args){
		
	int array[] = {2,5,6,7};
		int total = 0;
		//Variable created inside for loop must be same type as Array you're using
		//the i is stores the value of the arrays indexes that is on the other side of the colon
		//you can basically say int i iterates through each index of the array and everytime it goes through
		//an index it stores itself as the value the index is holding
		for(int i : array){
			total += i;
		}
		System.out.println(total);
	}
	
}
