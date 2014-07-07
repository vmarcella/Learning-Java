package Basic.Lesson09;

/**
 * <p>Lessons on Switch statements</p>
 * 
 * <code><b>
 * 	switch(age){
 * </b></code>
 * 
 * <p> all switch statements start with the reserved word "switch" followed by a set of parameters.
 * The paramters take in variable names of all reserved types. "Case" is also a reserved word. Case can be looked at as an "if" statement.
 * <code><b>case 14:</b> is equal to <b>if(age == 14)</b></code>
 * </p>
 * @author https://github.com/C3NZ
 *
 */
public class SwitchStatements {

	public static void main(String[] args) {
		
		int  age = 15;
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
