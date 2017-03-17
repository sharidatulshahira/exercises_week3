/**
 * 
 */
package E100;

/**
 * @author SIsmail
 *
 */
import java.util.Random;
public class NightSky {

	/**
	 * @param args
	 */
	private double density;
	private int width;
	private int height;
	private int starInLastPrint;
	private Random random = new Random();
	
	//private Random random;
	
	public NightSky(double density, int width, int height){
		this.density = density;
		this.width= width;
		this.height = height;
		
	}
	
	public NightSky(double density){
		this(density,20,10);
	}
	
	public NightSky(int width, int height){
		this(0.1, width, height);
		
	}
	
	/**
	 * Print star randomly with amount the star printed
	 */
	public void printLine(){
		
		
		for (int i = 0; i < this.width; i++) {
			
			if (random.nextDouble() >density){
				System.out.print(" ");
			}
			
			else {
				System.out.print("*");
				this.starInLastPrint++;		
			}
			
		}
	}
	
	/**
	 * reset the amount of star printed.
	 */
	public void print(){
		this.starInLastPrint = 0;
		for(int i=0; i<this.height; i++){
			printLine();
			System.out.println();
		}
	}
	
	public int starsInLastPrint(){
		
		return this.starInLastPrint;
		
	}
	
	

	
}
