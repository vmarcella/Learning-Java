package com.mime.Basic.Lesson28;

public class MainClass {
	public static void main(String[] args) {
		TimeClass tObject = new TimeClass();
		
		System.out.println(tObject.toMilitary());
		System.out.println(tObject.toStandard());
		
		//we can either override the code inside the method nut we have it set to
		//13, 32, 43.
		tObject.setTime(13, 32, 43);
		
		//prints out both methods because they both return strings.
		System.out.println(tObject.toMilitary());
		System.out.println(tObject.toStandard());

	}
}
