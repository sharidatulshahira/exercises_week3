/**
 * EXERCISE 94.2: ADDING PERSONS TO PHONEBOOK
 */
package E94;

/**
 * @author SIsmail
 *
 */
public class E94_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Phonebook phonebook = new Phonebook();

		    phonebook.add("Pekka Mikkola", "040-123123");
		    phonebook.add("Edsger Dijkstra", "045-456123");
		    phonebook.add("Donald Knuth", "050-222333");

		    phonebook.printAll();

	}

}
