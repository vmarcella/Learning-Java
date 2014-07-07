package Basic.Lesson17;

/**
 * Lesson on do while loops.
 * @author https://github.com/C3NZ
 *
 */

public class DoWhileLoops {
	public static void main(String[] args){
		int counter = 0;
		
		//performs the task always once even if the conditional
		//Isn't true, and if the conditional is true, then it'll run
		//as many times as the conditional wants it to
		do{
			System.out.println(counter);
			counter++;
			
		}while (counter <= 10); 
	}
}
