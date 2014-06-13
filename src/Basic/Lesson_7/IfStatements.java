package Basic.Lesson_7;

//Lesson on the commonly used, if statements. Used for decisions.
public class IfStatements {

	public static void main(String[] args) {
		
		int test = 6;
		
		//"if" is a reserved word. The () before the braces
		//are also known as the Condition. That means
		//its a test in other words to see if what you want is what
		//you want.
		//The Testing operators are:
		//
		// == Equal to
		// != Not equal to
		// < less than
		// > greater than
		// <= less than or equal to
		// >= Greater than or equal to
		// %% Has a remainder of
		//
		//After the condition, then goes the statement.
		//the statement is placed inside braces after the condition.
		//This is a basic true or false kind of way doing it.
		//what it means is if 9 is equal to our integer test, then
		//it will print out that it is, but if that condition is not true, then
		//print out that it is not.
		//Play around with it!
		if (test == 9){
			System.out.println("Test is equal to Nine.");
		}else{
			System.out.println("No it is not.");
		}
		
	}

}
