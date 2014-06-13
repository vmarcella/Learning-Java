package Basic.Lesson13;

public class SecondaryClass {
	
	//Private just means that only this class can access it.
	//This variable can be manipulated and changed.
	private String parentsName;
	
	//void means method returns nothing.
	//we set parentsName equal to name which is what we input in the scanner.
	public void theName(String name){
		parentsName = name;
	}
	
	public void newMessage(){
		//%s is asking what string is it going to be returning 
		//always must be followed by a comma and then the method its in.
		//formatting is not needed.
		System.out.printf("Your parents name is " +  parentsName);
	}
	
	
	
}
