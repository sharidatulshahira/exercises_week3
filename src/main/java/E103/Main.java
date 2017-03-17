/**
 * EXERCISE 103: BIRDWATCHERS DATABASE
 */
package E103;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Main {
	private static Birds bird;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String user;
		Scanner scan = new Scanner(System.in);
		Birdwatchers birdwatcher = new Birdwatchers ();
		
		
		while(true){
		System.out.print("?");
		user = scan.nextLine();
		
		if(user.equalsIgnoreCase("quit")){
			break;	
		}
		else if (user.equalsIgnoreCase("add")){
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Latin Name: ");
			String latin = scan.nextLine();
			birdwatcher.addBird(name, latin);
		}
		
		else if(user.equalsIgnoreCase("observation")){
			System.out.println("What was observed? : ");
			String observed = scan.nextLine();
			observe(observed, birdwatcher);
				
			
		}
		
		else if(user.equalsIgnoreCase("statistics")){
			birdwatcher.statistics();
				
		}
		
		else if(user.equalsIgnoreCase("show")){
			System.out.println("What? ");
			String printbird = scan.nextLine();
			show(printbird, birdwatcher);
					
				}
				
			}
		}
		
		
		/**
		 * Adds on observation
		 */
		public static void observe(String bird, Birdwatchers birdWatcher){
			for(Birds bw : birdWatcher.getBirds()){
				if(bw.getBirdName().equals(bird) || bw.getLatinName().equals(bird)){
				bw.increaseCount();
				return;
				}
			}System.out.println("Is not a bird!");
		}
		

		 /**
		 * prints one bird
		 */
		public static void show(String bird, Birdwatchers birdWatcher) {
		        for (Birds b : birdWatcher.getBirds()) {
		            if (b.getBirdName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
		                System.out.println(b);
		                return;
		            }
		        }
		        System.out.println("Is not a bird!");
		    }

	

	

}
