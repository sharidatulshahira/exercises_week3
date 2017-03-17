/**
 * EXERCISE 99: ARRAY TO STARS
 */
package E99;

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
        printArrayAsStars(array);
    }

    /**
     * Print a line with stars for each number in the array
     */
    public static void printArrayAsStars(int[] array) {
        // code here
    	for(int i=0; i<array.length; i++){
    		int k=array[i];	
    		for(int j=0; j<k; j++){
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }

	

}
