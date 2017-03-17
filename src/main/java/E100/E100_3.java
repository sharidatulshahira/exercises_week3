/**
 * EXERCISE 100.3: COUNTING THE NUMBER OF STARS
 */
package E100;

/**
 * @author SIsmail
 *
 */
public class E100_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NightSky nightSky = new NightSky(8, 4);
		nightSky.print();
		System.out.println("Number of stars: " + nightSky.starsInLastPrint());
		System.out.println("");

		nightSky.print();
		System.out.println("Number of stars: " + nightSky.starsInLastPrint());

		
	}

}
