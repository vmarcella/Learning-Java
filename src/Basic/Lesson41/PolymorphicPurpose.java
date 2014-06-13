package Basic.Lesson41;

public class PolymorphicPurpose {

	public static void main(String[] args){
		
		//create objects.
		//an array made out of a class that stores objects.
		Animal theList[] = new Animal[2];
		Dog dObject = new Dog();
		Fish fObject = new Fish();
		
		theList[0] = dObject;
		theList[1] = fObject;
		
		//starts at zero by default, made for reading arrays
		for(Animal counter : theList){//do this block of code until counter is equal to array index.
			counter.movement();
		}
	}
}
