package Basic.Lesson13;

public class Name{
	 //variable can only be manipulated by this class because of private modifier, but can be accessed by every method
	//inside the class
	private String yourName;
	
	
	public void theName(String name){ //sets the variable we made in the class equal to the argument getting passed through
		yourName = name;
	}
	
	public void newMessage(){	//prints out your name. will be null if called before "thenName" method
		System.out.println("Your name is " +  yourName);
	}
	
	
	
}
