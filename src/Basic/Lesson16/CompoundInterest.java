package Basic.Lesson16;

/**
 * Compound interest program
 * @author https://github.com/C3NZ
 *
 */

public class CompoundInterest {

	public static void main(String[] args){
		double amount; //total amount after interest is done
		double principal = 1500; //principal amount we start with
		double rate = .043; //the annual rate of interest as a decimal 
		double compounded = 4; //number of times the interest is compounded per year 
		
		for(int day = 1; day <= 20; day++){
			amount = principal * (Math.pow(1 + (rate / compounded), compounded * day));
			System.out.println(day + "\t" + amount);
		}
		
	}
	
}
