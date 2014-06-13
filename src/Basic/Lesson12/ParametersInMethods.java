package Basic.Lesson12;


import java.util.Scanner;

//This will be used for learning the use of parameters in methods.
public class ParametersInMethods {
	public static void main(String[] args ){
			
		Scanner scanner = new Scanner(System.in);
		SecondaryClass scObject = new SecondaryClass();
			
		System.out.print("Enter your name: ");
		String user = scanner.nextLine();
			
		//We then use the object that we created out of the secondary class
		//to run the method newMessage and it then uses the data we had assigned
		//the String user in this class into the secondary class where the string user
		//is located in there. if you remove user from the method we are calling for you will
		//get an error because in order for it to run the method we need it to use the parameters
		//we had assigned it to in the other class 
		scObject.newMessage(user);
		scanner.close();
		}
	
	
	
}
