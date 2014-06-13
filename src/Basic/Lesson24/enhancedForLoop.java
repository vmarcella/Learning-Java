package Basic.Lesson24;

public class enhancedForLoop {

	public static void main(String[] args){
		
		int array[] = {2,5,6,7};
		int total = 0;
		
		//needs type of data in the identifier.
		//the i is storing the value of the arrays
		//of all indexes. then it takes the name of the
		//array its collecting this data from.
		for(int i : array){
			total += i;
		}
		System.out.println(total);
	}
	
}
