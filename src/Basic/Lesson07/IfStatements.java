package Basic.Lesson07;

/**
 * <p>Demonstration on if statements.
 * <p>"if" is a reserved word. Inside the parameters of the if(), goes the condition. The condition is tested to see
 * if it's either true or false. Inside the brackets goes the statement, and if the statement is true, the code is executed. Otherwise
 * , else's code is executed.
 * 
 * <p>The Testing operators are:
 * <p><b> == : is Equal [ if(x == 2) ]
 * <p><b> != : is not equal [ if(x != 2) ]
 * <p><b> < : Less than [ if(x < 12) ]
 * <p><b> > : Greater than [ if(x > 12) ]
 * <p><b> >= : Greater than or equal to [ if(x >= 32) ]
 * <p><b> <= : Less than or equal to [ if(x <= 45) ]
 * <p><b> %% : Has a remainder of [ if(x %% 12) ]
 * 
 * @author C3NZ
 **/ 
public class IfStatements {

	public static void main(String[] args) {
		
		int test = 6; //set test equal to 6
		
	
		if (test == 9){ //is test equal to 9?
			System.out.println("Test is equal to Nine."); //does not work
		}else{ //if not true
			System.out.println("No it is not."); //works by default
		}
	}
}
