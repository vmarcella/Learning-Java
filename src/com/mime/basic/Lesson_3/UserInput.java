package com.mime.Basic.Lesson_3;

//Importing the scanner from the built in java library. This is a must.
import java.util.Scanner;

//Will be used for teaching the use of how scanners for user input.
public class UserInput {

	public static void main(String args[]){
		
		//what we do is we create a Scanner and then we name our
		//Scanner simply just scanner. we then set the scanner equal to our 
		//system input and what we basically tell it to do is store whatever we type
		//into our keyboard into the scanner variable.
		Scanner scanner = new Scanner(System.in);
		
		//this waits for our user input from the keyboard and then
		//takes whatever we do type and reprints it out.
		System.out.println(scanner.nextLine());
		
	}
	
}
