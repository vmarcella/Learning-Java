package Basic.Lesson34;

public class InheritFrom {

	private int arraySum;
	
	public void math(int...numbers){
		
		//for loop that starts a variable x at zero because
		//array indexes start at zero also, and then we say for as long as
		//x is less than the number of indexes in the array numbers, add 
		//the value of each index to the variable array sum and then
		//add one to the integer x to move to the next array index and 
		//repeat the process.
		for(int x =0; x < numbers.length; x++){
			
			arraySum += numbers[x];
			
		}
	
		//we print out the sum of the array numbers here.
		System.out.println(arraySum);
		
}
}	
