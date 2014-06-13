package Basic.Lesson30;

public class ThirdClass {
	private String name;
	//this is a reference to an object.
	private SecondaryClass birthday;
	
	public ThirdClass(String Name, SecondaryClass theDate){
		
		name = Name;
		birthday = theDate;
	}
	
	public String toString(){
		//we pass in the name for the string as the first %s and then we pass in
		//the reference to the object secondary class which looks for the toString method
		//inside the other class to get a date to set up for your birthday.
		return String.format("My name is %s, My birthday is %s", name, birthday);
	}
	
}
