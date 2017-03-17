/**
 * 
 */
package E102;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Grade {
	
	Scanner scan = new Scanner(System.in);
	
	String grade0 = "";
	String grade1 = "";
	String grade2 = "";
	String grade3 = "";
	String grade4 = "";
	String grade5 = "";

//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
	
	
	
	
	/**
	 * The range of the scores.
	 */
	public void doSomething(Scanner scan){
		System.out.println("Type exam scores, -1 completes: ");
		while(true){
			int scores = scan.nextInt();
			
			if(scores==-1){
				break;	
			}
			else if(scores <= 29){
				grade0 += "*" ;
			}
			else if(scores>=30 &&scores<=34){
				grade1 += "*"; 
			}
			else if(scores>=35 && scores<=39){
				grade2 += "*";
			}
			else if(scores>=40 && scores<=44){
				grade3 += "*";
			}
			else if(scores>=45 && scores<=49){
				grade4 += "*";
			}
			else if(scores>=50 && scores<=60){
				grade5 += "*";
				
			}
		}
	}
	
//	public int percentage(){
		
//		int sum =+ scores;
//		int percentage = (sum/scores)*100;
//		return scores;


	/**
	 * sum of the score number entered by referring the ranges.
	 */
	public int sum(){
		int sum = grade0.length()+grade1.length() + grade2.length() + grade3.length() + grade4.length() + grade5.length();
		return sum;	
	}
	
	/**
	 * percentage of the scores entered.
	 */
	public double percentage(){
		double percentage = (double)(100*(sum()-grade0.length())/sum());
		return percentage;
		
	}
	
	
	public void print(){
		System.out.println("Grade Distribution: ");
		System.out.println("5: " + grade5);
		System.out.println("4: " + grade4);
		System.out.println("3: " + grade3);
		System.out.println("2: " + grade2);
		System.out.println("1: " + grade1);
		
		
		
		System.out.println("Acceptance percentage: " + (double)percentage());
		}
	


}
