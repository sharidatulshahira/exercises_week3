/**
 * 
 */
package E94;

/**
 * @author SIsmail
 *
 */
public class Person {
	private String name;
	private String number;
	
	public Person(String name, String number){
		this.name=name;
		this.number=number;
	}
	
	
	/**
	 * @return the name of person
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone number
	 */
	public  String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * used to change the phone number of the person 
	 */
	public void changeNumber(String newNumber){
		this.number=newNumber;
	}
	
	public String toString(){
		return name+ " " + number;
		
	}

	

}
