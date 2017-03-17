/**
 * 
 */
package E94;

/**
 * @author SIsmail
 *
 */
import E94.Person;
import java.util.ArrayList;


/**
 * class Phonebook that stores object(Person) using arraylist
 *
 */
public class Phonebook {
	ArrayList<Person> list;
	
	public Phonebook(){
		list = new ArrayList<Person>();
	}
	
	/**
	 * add name and number in the arraylist inside the phone number
	 */
	public void add(String name, String number){
		list.add(new Person(name,number));
//		list.add(number);
	}
	
	/**
	 * prints all the persons inside the Phonebook
	 */
	public void printAll(){
		for (Person lists : list) {
			System.out.println(lists);
			
		}
	}
	
	/**
	 * returns the phone number based on the given name
	 * 
	 */
	public String searchNumber(String name){
		for (Person search : list) {
			if(search.getName().equals(name)){
				return search.getNumber();
			}
			else {
				return ("number not know");
			}
			
		}
		return name;
		
		
			
		
	}
	
}
