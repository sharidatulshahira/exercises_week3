/**
 * EXERCISE 101.1: BOOK
 */
package E101;

/**
 * @author SIsmail
 *
 */
public class E101_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());

		System.out.println(cheese);

	}

}
