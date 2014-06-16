package Basic.Lesson08;

/**
 * Jason Schanils a bitch
 * 
 * 
 * @author C3NZ
 *
 */
public class LogicalOperators {
	
	public static void main(String args[]){
		
		int firstNumber, secondNumber;
		
		firstNumber = 18;
		secondNumber = 40;
		
		//little dating system to check if two people can date.
		//&& means that things on each side have to be true.
		// || is or. Means that one has to be true.
		if(firstNumber > 10 && secondNumber < 60){
			System.out.println("You can date!");
		}else{
			System.out.println("You cannot date!");
		}
	}
}
