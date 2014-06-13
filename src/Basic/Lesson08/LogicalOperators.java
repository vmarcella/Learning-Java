package Basic.Lesson08;

//Lesson on logic operators. Or, Multiple tests.
public class LogicalOperators {
	
	public static void main(String args[]){
		
		int boy, girl;
		
		boy = 18;
		girl = 40;
		
		//little dating system to check if two people can date.
		//&& means that things on each side have to be true.
		// || is or. Means that one has to be true.
		if(boy > 10 && girl < 60){
			System.out.println("You can date!");
		}else{
			System.out.println("You cannot date!");
		}
	}
}
