/**
 * 
 */
package E106;

/**
 * @author SIsmail
 *
 */
public class BinarySearch {


	public static boolean search(int[] array, int searchedValue) {
		for (int num : array) {
			if (num==searchedValue){
				return true;
			}
		}
		return false;
		
		
		}
	

}
