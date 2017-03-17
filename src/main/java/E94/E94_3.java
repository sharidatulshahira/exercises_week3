/**
 * EXERCISE 94.3: SEARCHING FOR NUMBERS FROM THE PHONEBOOKS
 */
package E94;

/**
 * @author SIsmail
 *
 */
public class E94_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
	    phonebook.add("Pekka Mikkola", "040-123123");
	    phonebook.add("Edsger Dijkstra", "045-456123");
	    phonebook.add("Donald Knuth", "050-222333");

	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println( number );

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println( number );

	}

}
