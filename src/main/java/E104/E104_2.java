/**
 * EXERCISE 104.2: THE INDEX OF THE SMALLEST
 */
package E104;

/**
 * @author SIsmail
 *
 */
public class E104_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// indexes:   0  1  2  3  4
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

	}
	
	public static int indexOfTheSmallest(int[] array){
		int index = 0;
		int small = array[0];
		for(int i=0; i<array.length; i++){
			if(small<=array[i]){
				small = small;
				
			}
			else{
				small = array[i];
				 index = i;
			}
			
		}
		return index;
		
	}

}
