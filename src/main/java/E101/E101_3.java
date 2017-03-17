/**
 * EXERCISE 101.3: SEARCH FUNCTIONALITY
 */
package E101;

import java.util.ArrayList;

/**
 * @author SIsmail
 *
 */
public class E101_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library library = new Library();

		library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		ArrayList<Book> result = library.searchByTitle("Cheese");
		for (Book book: result) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: library.searchByPublisher("Penguin Group  ")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: library.searchByYear(1851)) {
		    System.out.println(book);
		}

	}

}
