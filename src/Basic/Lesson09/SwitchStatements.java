package Basic.Lesson09;

/**
 * <p>Lessons on Switch statements
 * @author C3NZ
 *
 */
public class SwitchStatements {

	public static void main(String[] args) {
		
		int age;
		age = 16;
		
		//This is a set up for the switch statement.
		//the variable we are testing right now is the integer we made
		//called age. the cases test to see if the variable is equal
		//to the number after the case. break then tells the code to terminate
		//because you already found out which case is true.
		//default is if none of the cases are true then just do this by default.
		switch(age){
		
		case 14:
			System.out.println("You're in 9th grade.");
			break;
		case 15:
			System.out.println("You're in 10th grade.");
			break;
		case 16:
			System.out.println("You're in 11th grade.");
			break;
		default:
			System.out.println("Are you sure you're in high school?");
			break;
		}

	}

}
