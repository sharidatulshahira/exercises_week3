/**
 * 
 */
package E101;

/**
 * @author SIsmail
 *
 */
import E101.Book;



import java.util.ArrayList;
import java.util.List;
public class Library {
	
	ArrayList<Book> lib = new ArrayList<Book>();

	public Library(){
		
	}
	
	public void addBook (Book newBook){
		lib.add(newBook);
	}
	
	public void printBooks(){
		for (Book book : lib) {
			System.out.println(book);
		}
		
	
	}

	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(int i=0; i<lib.size(); i++){
//		Book search = found.get(i);
//		String titles =  search.title();
//		if (lib.get(i).title().contains(title)){
			
			if(StringUtils.included(lib.get(i).title(), title)){
//			if(StringUtils.included(lib.get(i).title(), title)) {
			found.add(this.lib.get(i));
			
		}
		}
		
		return found;
	}

	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(int i=0; i<this.lib.size(); i++){
		if (lib.get(i).publisher().contains(publisher)){
			found.add(lib.get(i));
			
		}
		}
		
		return found;
	}


	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(int i=0; i<this.lib.size(); i++){
		if (lib.get(i).year()==(year)){
			found.add(lib.get(i));
			
		}
		}
		
		return found;
		
	}

	
}
