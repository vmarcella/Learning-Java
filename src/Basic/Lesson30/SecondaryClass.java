package Basic.Lesson30;

public class SecondaryClass {
	
	//create our private local variables
	private int month;
	private int day;
	private int year;
	
	//constructor that takes in three integers.
	public SecondaryClass(int m, int d, int y){
		//set local variables equal to the variables we passed through.
		month = m;
		day = d;
		year = y;
		
		//we print out this string and every time we call the Key Word "this"
		//it looks for the method to String that must return a string, only when
		//it sees a string.
		System.out.printf("The Constructor for this is %s\n", this);
	}
	
	//the method we need for the key word "this" to be used in the 
	//system out. This method is built into java's API so it can't be named
	//without a purpose.
	public String toString(){
		
		//We format it to a string %d is the common thing used for dates
		//and then we use it in order we want it to be in
		return String.format("%d/%d/%d", month, day, year);
		
	}
	
}
