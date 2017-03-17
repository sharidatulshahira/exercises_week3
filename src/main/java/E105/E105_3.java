/**
 * EXERCISE 105.3: GUESSING LOGIC
 */
package E105;

/**
 * @author SIsmail
 *
 */
public class E105_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();

		// we play two rounds
		game.play(0,10);  // value to be guessed now within range 1-10
//		game.play(10,99);  // value to be guessed now within range 10-99

	}

}
