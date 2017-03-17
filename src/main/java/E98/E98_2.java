/**
 * EXERCISE 98.2: REVERSE COPY
 */
package E98;

/**
 * @author SIsmail
 *
 */
import java.util.Arrays;
public class E98_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
	    int[] reverse = reverseCopy(original);

	    // print both
	    System.out.println( "original: " +Arrays.toString(original));
	    System.out.println( "reversed: " +Arrays.toString(reverse));
	}
	
	
	/**
	 * Creates an array which contains the elements of the parameter but in reversed array.
	 */
	public static int[] reverseCopy(int[] array){
		int[] reverse = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverse[i] = array[array.length-1-i];	
		}
		return reverse;
		
		

	
}
}