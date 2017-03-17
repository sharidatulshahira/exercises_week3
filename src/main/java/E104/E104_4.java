/**
 * EXERCISE 104.4: SWAPPING VALUES
 */
package E104;

/**
 * @author SIsmail
 *
 */
import java.util.Arrays;
public class E104_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = {3, 2, 5, 4, 8};

		System.out.println( Arrays.toString(values) );

		swap(values, 1, 0);
		System.out.println( Arrays.toString(values) );

		swap(values, 0, 3);
		System.out.println( Arrays.toString(values) );

	}
	
	public static void swap(int[] array, int index1, int index2) {
		
	   //int swap = array[0];
//	   index1 = 0;
//	   index2 = 1;
	   int temp = array[index1];
	   array[index1] = array[index2];
	   array[index2] = temp;
	   
	}

}
