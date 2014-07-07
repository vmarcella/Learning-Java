package Basic.Lesson11;

/**
 * Lesson on multiple classes
 * @author C3NZ
 *
 */
public class MultipleClasses {
	
	public static void main(String[] args) {
		
		//We create an object of the Secondary class. Now have access to all its methods and variables non statically.
		MessageClass scObject = new MessageClass();
		scObject.newMessage();//runs method
	}

}
