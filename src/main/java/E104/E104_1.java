/**
 * EXERCISE 104.1: SMALLEST
 */
package E104;


/**
 * @author SIsmail
 *
 */
import java.util.Arrays;
public class E104_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		Arrays.sort(values);
		System.out.println("smallest: " + smallest(values));
		
		
	}
	public static int smallest(int[] array) {
		int small = array[0];
		for(int i=0; i<array.length; i++){
			if (small<array[i]){
				small=small;
			}
			else{
				small = array[i];
			}
			
		}
		return small;
		
	}

}
