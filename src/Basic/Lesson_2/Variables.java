package Basic.Lesson_2;

/**
 * <p>Lesson on what variables are.
 * 
 * <p>Types of Variables:
 * <p><b>int : Stores integers [7, 0, 123]
 * <p><b>double : Stores decimals (64 bit IEEE 754 floating point) [3.4, 32.01, .003]
 * <p><b>String : Stores strings of characters [hello, yes, name]
 * <p><b>char : Stores characters [a, b, g]
 * <p><b>float : Stores decimals (32 bit IEEE 754 floating point) [3.1, 67.013, .982]
 * <p><b>
 * <p><b>
 * @author Cenz
 *
 */
public class Variables {

	public static void main(String args[]){
		
		//A double is a keyword that tells java that we're working with numbers that use 
		//decimal points. There are ints, doubles, longs, and floats.
		double numberOne;
		//The = is a assignment operator, which assigns our double 
		//to the number value 5.40.
		numberOne = 5.40;
		
		System.out.println(numberOne);
	}
}
