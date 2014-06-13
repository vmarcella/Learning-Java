package Basic.Lesson17;

public class DoWhileLoops {
	public static void main(String[] args){
		int counter = 0;
		
		//performs the task always once even if the conditional
		//Isn't true, and if the conditional isn't true, then it'll stop
		//after it performs the task once.
		do{
			System.out.println(counter);
			counter++;
			
		}while (counter <= 10); 
	}
}
