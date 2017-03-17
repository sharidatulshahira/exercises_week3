/**
 * EXERCISE 96: SUM OF THE ARRAY
 */
package E96;

/**
 * @author SIsmail
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    /**
     * return sum of the numbers in the array
     */
    public static int sum(int[] array) {
    	int sum = 0;
        for (int i=0; i<array.length; i++){
        	
        	sum = sum + array[i];
        }
		return sum;
     
    }

	

}
