/**
 * EXERCISE 104.3: INDEX OF THE SMALLEST AT THE END OF AN ARRAY
 */
package E104;

/**
 * @author SIsmail
 *
 */
public class E104_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// indexes:    0  1  2  3   4
		int[] values = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
	}

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

}
