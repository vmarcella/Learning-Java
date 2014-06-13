package Basic.Lesson51;
import java.util.Scanner;

public class WritingToFiles {

	static String text;
	static Boolean notFinished = true;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CreateFile fObject = new CreateFile();
		fObject.createFile();
		System.out.println("Input some text you'd like to add into your new document");
		text = scanner.nextLine();
		fObject.addText(text);
		fObject.closeFile();
	}

}
