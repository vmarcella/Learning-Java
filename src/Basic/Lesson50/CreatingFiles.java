package Basic.Lesson50;

import java.util.Formatter;


public class CreatingFiles {

	public static void main(String[] args){
		
		
		//what the try method does is, is try to execute the code and if an
		//exception happens (The code fails) it will catch the error.
		try{
			//Formatter allows us to create a file at any location we want to.
			//if we don't specify any name then the file gets made in wherever your workspace
			//is.
			Formatter x = new Formatter("C:\\Users\\Cenz\\Desktop\\Test.txt");
			System.out.println("File Created!");
			x.close();
		//happens if the try methods fail.	
		}catch(Exception e){
			//prints the exception to the stack trace
			e.printStackTrace();
			System.out.println("error occured while writing file.");
		}
		
	}
	
	
}
