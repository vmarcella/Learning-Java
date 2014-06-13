package Basic.Lesson28;

public class TimeClass {

	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	
	public void setTime(int hour, int minute, int second){
		//if the int that is passed through is greater than zero
		//and less than 24, then the integer can remain, if not
		//set it to zero
		
		//this means to point to these variables instead of the local variables
		//on top and make the time value 4,5,6
		this.hour = 4;//((h >= 0 && h < 24) ? h : 0);
		this.minute = 5;//((m >= 0 && m < 60) ? m : 0);
		this.second = 6;//((s >= 0 && s < 60) ? s : 0);
	}
	
	//returns strings.
	public String toMilitary(){
		//we format it to have two decimal places, and its formating 
		//the arguments in the order we put it into in
		//which time goes by hour, minutes, seconds.
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	//returns strings.
	public String toStandard(){
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12 ?12 : hour%12)), minute, second,(hour < 12 ? "AM": "PM"));
	}
	
	
}
