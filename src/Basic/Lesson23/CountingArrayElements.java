package Basic.Lesson23;

import java.util.Random;
/**
 * Lesson on counting array elements.
 * @author https://github.com/C3NZ
 *
 */
public class CountingArrayElements {

	public static void main(String[] args) {
		Random num = new Random();
		//the array frequency can store 7 indexes.
		//but we only want indexes one through six for the dice we roll.
		int freq[] = new int[7];
		
		//this just loops this 1000 times.
		for(int roll = 1; roll <1000; roll++){
			//we are adding one index each time we do the counter and we
			//are keeping count of how many times. we're also adding one to whichever
			//index is called
			++freq[1 + num.nextInt(6)];
			
	}
				System.out.println("Face\tFrequency");
				
				//print out what each face was rolled and the amount of times it was rolled
				for(int i = 1; i < freq.length; i++){
					System.out.println(i + "\t" + freq[i]);
				}
}
}