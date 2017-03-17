/**
 * 
 */
package E103;

/**
 * @author SIsmail
 *
 */

public class Birds {

	private  String birdName;
	private  String latinName;
	private  int count;
	
	
	public Birds(String birdName, String latinName){
		this.setBirdName(birdName);
		this.setLatinName(latinName);
	}


	public String getBirdName() {
		return birdName;
	}


	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}


	public String getLatinName() {
		return latinName;
	}


	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	public String toString(){
		return birdName + "(" + latinName + ")"  + " : " + count + " observations";
	}
	
	
	/**
	 * To count how many some bird has been observed.
	 */
	public int increaseCount(){
		return count++;
	}
	
	

	
	
	

}
