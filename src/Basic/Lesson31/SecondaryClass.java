package Basic.Lesson31;

public enum SecondaryClass {

	//these are constants that can be built by enumerations,
	//they work like objects in a way and can have a set of their own parameters.
	//we just put commas to imply that we're adding more of these constants.
	//each constant has its own set of varbales inside it.
	Vincenzo("Brother", "16"),
	Lauren("Sister", "13"),
	Lily("YoungerSister", "8"),
	Christina("Mother", "36"),
	Vincent("Husband", "38"),
	Barbara("Grandmother", "65");
	
	
	private final String description;
	private final String age;
	
	//Constructors don't need a public in front of them for the 
	//constructor to be called.
	SecondaryClass(String description, String age){
		//this.description and this.age points to the local variables we created
		//on top and we then assign them to whatever the variables being passed 
		//through the constructor
		this.description = description;
		this.age = age;
	}
	//this just returns the Description String
	public String getDesc(){
		return description;
	}
	//This just returns the age.
	public String getAge(){
		return age;
	}
	
}


