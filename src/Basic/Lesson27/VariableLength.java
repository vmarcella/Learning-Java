package Basic.Lesson27;

public class VariableLength {
	
	public static void main(String[] args){
		//those are all the numbers we put in to go into the method
		//average to be averaged.
		System.out.println(average(43,56,76,8,78,98,90,56));
		
	}
	
	//... means you dont know how many arguments its going to take.
	public static int average(int...numbers){
		int total = 0;
		//where its getting its data, and storing it into integer x
		//returning the value to the method at the end of the method
		for(int x: numbers)
			total += x;
		
		//sets the value of the method to the total divided by the 
		//length of the numbers we put in.
		return total/numbers.length;
	}
	
	
	
}
