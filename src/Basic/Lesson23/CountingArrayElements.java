package Basic.Lesson23;

import java.util.Random;

public class CountingArrayElements {

	public static void main(String[] args) {
		Random num = new Random();
		//the array frequency can store 7 indexes, or seven different values.
		//but we only want indexes one through six for the dice we roll.
		int freq[] = new int[7];
		
		//this just loops this 1000 times, or rolls it 1000 times.
		for(int roll = 1; roll <1000; roll++){
			//we are adding one index each time we do the counter and we
			//are keeping count of how many times. freq index can never be zero
			//because we are adding one to it.
			++freq[1 + num.nextInt(6)];
			
	}
				System.out.println("Face\tFrequency");
				
				//length of the indexes, which will only be six.
				for(int i = 1; i < freq.length; i++){
					System.out.println(i + "\t" + freq[i]);
				}
}
}