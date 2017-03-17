/**
 * EXERCISE 95.2: LESS
 */
package E95;

/**
 * @author SIsmail
 *
 */
public class E95_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Money a = new Money(10,0);
		Money b = new Money(3,0);
		Money c = new Money(5,0);

		System.out.println(a.less(b));  // false
		System.out.println(b.less(c));  // true


	}

}
