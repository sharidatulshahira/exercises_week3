/**
 * 
 */
package E103;

/**
 * @author SIsmail
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Birdwatchers {
	Scanner scan = new Scanner(System.in);
	ArrayList<Birds> listBird ;
	
	public Birdwatchers(){
		this.listBird = new ArrayList<Birds>();
	}
	
	/**
	 * add bird into arraylist
	 */
	public void addBird(String birdName, String latinName){
		listBird.add(new Birds(birdName,latinName));
		
	}
	
	public ArrayList<Birds> getBirds(){
		return this.listBird;
		
	}
	
	/**
	 * prints all birds
	 */
	public void statistics(){
		for (Birds bds : listBird) {
			System.out.println(bds);
			
		}
	}
	
	
	
	
	

}
