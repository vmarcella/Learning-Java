package Basic.Lesson30;

public class ToString {

	public static void main(String[] args){
		
		//we set the value here for our constructor.
		SecondaryClass sObject = new SecondaryClass(4,5,6);
		
		
		ThirdClass tObject = new ThirdClass("Vincenzo", sObject);
		
		System.out.println(tObject);
	}
	
	
}
