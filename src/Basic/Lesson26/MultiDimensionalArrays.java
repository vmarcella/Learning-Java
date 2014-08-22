package Basic.Lesson26;
/**
 * Lesson on MultiDimensional arrays.
 * @author https://github.com/C3NZ
 *
 */
public class MultiDimensionalArrays {

	public static void main(String[] args){
		//first [] is for the row while the second [] is for the column, or the index.
		int array[][] = {{2,3,4,5,6},{23,432,5465,76}};	//array[1][2] = 5465
		
		int array2[][] = {{23,453,65,87},{423},{345}};	//array[0][0] = 23
		
		System.out.println("First Array: " + "\n");
		arrayDisplay(array);
		System.out.println("Second Array: " + "\n");
		arrayDisplay(array2);
	}
	
	public static void arrayDisplay(int x[][]){
		//loops through the rows, then loops through the columns if there is any
		for(int row = 0; row < x.length; row++){
			System.out.println("Row: " + row);
			
			if(x[row].length <= 1)//detects the amount of columns the row in the array has
				{  
				System.out.println("There is a total of " + x[row].length + " column!");
			}else{
				System.out.println("There are a total of " + x[row].length + " columns!");
			}
			
			//for every column there is in the certain row of the index we called, execute this code.
			for(int column = 0; column < x[row].length; column++){
				System.out.println("Column/Index " + column + ": " + x[row][column] );//prints out the column value
			}
			System.out.println(); //just for spacing at the end.
		}
	}	
}
