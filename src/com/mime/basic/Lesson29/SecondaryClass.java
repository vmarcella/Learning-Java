package com.mime.Basic.Lesson29;

public class SecondaryClass {
	private int hour;
	private int minute;
	private int second;
	
	//constructor for no arguments
	//will go down to the method that has three arguments and set them to zero
	//zero, zero, and continue with its process.
	public SecondaryClass(){
		//so when we call an object with no arguments in it, it sets the value
		//of the int h, int m, and int s to zero. changes its parameters to have
		//three values.
		this(0,0,0);
	}
	
	//constructor for one argument 
	public SecondaryClass(int h){
		//when we call an object with 1 argument in it, it uses the variable
		//we passed through in it h, and then sets the rest to zero. changes its 
		//constructors to have three values.
		this(h,0,0);
	}
	
	//constructor for two arguments
	public SecondaryClass(int h, int m){
		//when we call an object with 2 argument in it, it uses the variable
		//we passed through in it h, and m, and then sets the rest to zero.
		//changes it parameters to have three values.
		this(h,m,0);
	}
	
	//constructor for three arguments
	public SecondaryClass(int h, int m, int s){
		//When we call an object that has 3 arguments being passed through it,
		//all variables are assigned here and none are set to zero
		//and the method is ran.
		//runs the method setTime, which is created down below
		setTime(h,m,s);
	}
	
	//method that is going to be used for setting the time, by
	//using three other methods to check to see if the time inputed
	//by the user meets its requirements.
	public void setTime(int h, int m, int s){
		//runs method to set the hour
		setHour(h);
		//runs method to set the minute
		setMinute(m);
		//runs the method to set the second
		setSecond(s);
	}
	//takes in an integer.
	public void setHour(int h){
		//checks to see if h is less than or equal to one
		//and it checks to see if its less than 24 and if 
		//both requirements are meant than the integer can remain the same
		//value but if it doesn't than we set it to zero.
		hour = ((h >= 0 && h<24) ? h : 0);
	}
	
	//also takes in an integer.
	public void setMinute(int m){
		//checks to see if the integer we passed through
		//for minute is greater than or equal to zero but less
		//than 60 and if the requirements are met the value stays the same
		//but if they aren't, the value is set to zero.
		minute = ((m >= 0 && m<60) ? m : 0);
	}
	//also takes an integer.
	public void setSecond(int s){
		//does the same thing as the set minute method.
		second = ((s >= 0 && s<60) ? s : 0);
	}
	//these method returns integers so we can print the values out and
	//format them.
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	//returns everything as a string and converts the numbers into military time.
	public String toMilitary(){
		//formats each value to have two decimal places with %02d and then we place them
		//in the order we want them to be formatted in.
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
}
