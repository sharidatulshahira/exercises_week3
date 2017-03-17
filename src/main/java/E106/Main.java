/**
 * EXERCISE 106: IMPLEMENTATION OF BINARY SEARCH
 */
package E106;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	 

	public static void main(String[] args) {
	        // Here you can test binary search
	        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
	        Scanner reader = new Scanner(System.in);

	        System.out.print("Values of the array: " + Arrays.toString(array));
	        System.out.println();

	        System.out.print("Enter searched number: ");
	        String searchedValue = reader.nextLine();
	        System.out.println();
	        
	     // Print the binary search result here

	        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
	       
	        	if(result==true){
	        		
	        		System.out.println("Value " + searchedValue + " is in the array" );
	        	}
	        	else{
	        		System.out.println("Value " + searchedValue + " is not in the array");
	        		
	        	}

	        
	        
	        
	}

}
