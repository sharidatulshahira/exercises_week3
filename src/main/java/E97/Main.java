/**
 * EXERCISE 97: ELEGANT PRINTING OF AN ARRAY
 */
package E97;

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
        printElegantly(array);
    }

    /**
     * Print the numbers in the array on the same row.
     * The number should be separated with comma and whitspace.
     */
    public static void printElegantly(int[] array) {
       for (int i = 0; i < array.length; i++) {
    	   if (i < 4){
    		   System.out.print(array[i] + ", ");
    	   }
    	   else {
    		   System.out.print(array[i]);
    	   }
		
	}
    }

	

}
