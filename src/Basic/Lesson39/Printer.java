package Basic.Lesson39;

public class Printer{
	
	//accepts an object from the super class so it can accept
	//any subclass from the SuperClass too. the objects of the superclass must contain
	//the data type of the superclass its inheriting all its stuff from.
	public void runIt(SuperClass x){
		
		x.print();
	}
	
}
