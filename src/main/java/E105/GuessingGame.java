/**
 * 
 */
package E105;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class GuessingGame {
	Scanner reader =  new Scanner(System.in);
	
	public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);
        
        
        while(true){
        int avg=average(upperLimit,lowerLimit);
        if (isGreaterThan(avg)){
        	lowerLimit = avg+1;
        }
        else  {
        	upperLimit = avg;
        }
        if (upperLimit==lowerLimit){
        	System.out.println("The number you're thinking is " + upperLimit);	
        	break;
        	
        }
        
        }
        // write the game logic here
    }

	public boolean isGreaterThan(int value){
		
		System.out.println("Is your number greater than " + value + " ? (y/n)");
		String answer = reader.nextLine();
		if (answer.equals("y")){
			return true;
		}
		
		return false;
		
	}
	
	public int average(int firstNumber, int secondNumber){
		int average = (firstNumber + secondNumber)/2;
		return average;
		
	}
	
	
	
	public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }
	
	public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
	
	 
}
