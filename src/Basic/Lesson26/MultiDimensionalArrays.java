package Basic.Lesson26;

public class MultiDimensionalArrays {

	public static void main(String[] args){
		//first [] is for the row while the second []
		//is for the column, or the index.
		int array[][] = {{2,3,4,5,6},{23,432,5465,76}};
		//array[0][0] = 2
		int array2[][] = {{23,453,65,87},{423},{345}};
		
		
		System.out.println("First Array: ");
		arrayDisplay(array);
		System.out.println("Second Array: ");
		arrayDisplay(array2);
	}
	
	public static void arrayDisplay(int x[][]){
		//loops through the rows, then loops through the columns if there is any
		for(int row = 0; row < x.length;row++){
			//we set columns equal to zero, then as long as the columns is less than
			//the length of the number of columns in the row keep printing out the row and
			//the index of it.
			for(int column=0;column < x[row].length; column++){
				System.out.println(x[row][column] + "\t");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	
}
