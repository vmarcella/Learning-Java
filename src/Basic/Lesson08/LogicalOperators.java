package Basic.Lesson08;

/**
 * <p>Demonstrations on  multiple tests, or also known as Logical Operators.</p>
 * <p>The Logical Operators are:</p>
 * <p><b>&& means "and".Both conditions must be true in order to be true.[if conditon && condition are true / false]</p></b>
 * <p><b>|| means "or". One condtiio n has to be true in order to make the whole statement true. [if condition || condition are true / false]
 * 
 * @author C3NZ
 *
 */
public class LogicalOperators {
	
	public static void main(String args[]){
		
		int firstNumber, secondNumber;
		
		firstNumber = 11;
		secondNumber = 40;
		
		if(firstNumber > 10 || secondNumber < 60){ //will be true by default
			System.out.println("First statement is true");
		}else{
			System.out.println("FIrst statement was not true");
		}
		
		if(firstNumber > 10 && firstNumber < 60){ //will be false
			System.out.println("Second statement is true");
		}else{
			System.out.println("Second statement is false");
		}
	}
}
