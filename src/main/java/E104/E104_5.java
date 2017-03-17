/**
 * EXERCISE 104.5: SORTING
 */
package E104;

/**
 * @author SIsmail
 *
 */
import java.util.Arrays;
public class E104_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = {8, 3, 7, 9, 1, 2, 4};
		sort(values);
		

	}
	
/**
 * sort the number from the smallest number in the index.
 */
private static int indexOfTheSmallestStartingFrom(int[] values, int index) {
		
		
		int small = values[index];
		
		for(int i=index; i< values.length; i++){
			if (small<=values[i]){
				small=small;
			}
			else {
				small = values[i];
				index = i;
			}
		}
		
		return index;
	}

/**
 * Swap the numbers in array.
 */
public static void swap(int[] array, int index1, int index2) {
	
	   int temp = array[index1];
	   array[index1] = array[index2];
	   array[index2] = temp;
	   
	}
	
	public static void sort(int[] array) {
		for (int i=0; i<array.length; i++){
			System.out.println(Arrays.toString(array));
			int small = indexOfTheSmallestStartingFrom(array, i);
			swap(array, i, small);
			
		}
		
	}

}
