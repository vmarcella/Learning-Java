package com.mime.Basic.Lesson32;

public class StaticVariables {
	
	public static void main(String[] args){
		
		//pass through the strings into each constructor every time we call
		//an object to be created.
		SecondaryClass sObject = new SecondaryClass("Vincenzo", "Marcella");
		SecondaryClass sObject2 = new SecondaryClass("Vincenzo", "Marcell");
		SecondaryClass sObject3 = new SecondaryClass("Vincenzo", "Marcel");
	
	
		System.out.println();
		
		System.out.println(sObject2.getFirst());	
		System.out.println(sObject2.getLast());
		System.out.println(sObject2.getMembers());
	
	}
}
