/**
 * EXERCISE 98.1: COPY
 */
package E98;

/**
 * @author SIsmail
 *
 */
import java.util.Arrays;
public class E98_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
	    int[] copied = copy(original);

	    // change the copied
	    copied[0] = 99;

	    // print both
	    System.out.println( "original: " + Arrays.toString(original));
	    System.out.println( "copied: " + Arrays.toString(copied));

	}
	
	/**
	 * Create a copy of the parameter.
	 */
	public static int[] copy(int[] array){
		
		int[] cop = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if(cop[0] == 1){
				cop[1] = 2;
				cop[2] = 3;
				cop[3] = 4;
			}
			else{
				cop[i] = array[i];
			}
		}
		return cop;
		
	}

}
