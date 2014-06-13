package com.mime.Basic.Lesson49;

import java.io.File;


public class FileClass {

	public static void main(String[] args){
		//create a file object from the File class and it gets the file from
		//that location
		File file = new File("C:\\Users\\Cenz\\Desktop\\Test.txt");
		//checks to see if the file exists.
		if(file.exists()){
			System.out.println("The file exists!");
		}else{
			System.out.println("It doesn't");
		}
	}
}
