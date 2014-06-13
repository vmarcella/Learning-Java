package Basic.Lesson33;

public class SecondaryClass {

	private int sum;
	//final means that the value cannot be changed until the program is ended
	//and wont change until its over.
	private final int number;
	
	//sets number to x, can't be changed.
	public SecondaryClass(int x){
		number = x;
	}
	//adds whatever number to the sum integer.
	public void add(){
		sum += number;
	}
	
	//formats to string to print out
	//the the sum.
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
	
}
