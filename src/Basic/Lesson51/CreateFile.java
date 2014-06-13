package Basic.Lesson51;

import java.util.Formatter;

public class CreateFile {

	private Formatter x = null;
	
	public void createFile(){
		
		try{
		 x = new Formatter("C:\\Users\\Cenz\\Desktop\\Test.txt");
		}catch(Exception e){
			System.out.println("Error while creating file, check stack trace!");
			e.printStackTrace();
		}
		
	}
	
	public void addText(String str){
		x.format("%s", str);
		x.format("%n", "");
	}
	
	
	public void closeFile(){
		x.close();
	}
	
}
