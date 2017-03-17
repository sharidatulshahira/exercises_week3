/**
 * 
 */
package E101;

/**
 * @author SIsmail
 *
 */
public class StringUtils {

	/**
	 * @param args
	 */
	public static boolean included(String word, String searched){
		if (word.toUpperCase().contains(searched.toUpperCase().trim())){
			return true;
		}
		return false;
		
	}

}
