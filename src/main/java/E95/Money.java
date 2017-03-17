/**
 * 
 */
package E95;

/**
 * @author SIsmail
 *
 */
public class Money {

	private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    /**
     * return the sum of the object
     */
    public Money plus(Money added){
    	int euro = this.euros + added.euros;
    	int cent = this.cents + added.cents;
    	
		return new Money(euro, cent);	
    }
    
    /**
     * compared the value
     */
    public boolean less (Money compared){
    	if (this.euros<compared.euros || this.cents<compared.cents){
    		return true;
    	}
		return false;
    	
    }
    
    /**
     * return the value of the new object by doing minus operation,
     * and if the value would be negative, the object become 0.
     */
    public Money minus (Money decremented){
    	int euroMinus =0;
    	int centMinus =0;
    	
    	
    	if(this.cents>decremented.cents || this.euros>decremented.euros){
    		centMinus = 0;
    		euroMinus = 0;
    	
    		if (decremented.euros>0 && decremented.cents >0){
    			euroMinus = Math.abs(this.euros - decremented.euros);
    			centMinus = Math.abs(this.cents - decremented.cents);
    	
    			if(this.cents<decremented.cents){
    				euroMinus--;
        		
    	}
        	
    	}	
        	
        		
        	
        	        	
        	//return new Money (euroMinus,  centMinus);
    	
//    	}
//    	else {
//    		return decremented;
//    		return new Money (euroMinus,centMinus);
    	
    	
        	 return new Money (euroMinus,  centMinus);
    	}
    
    	
		return decremented;
    }	
    	
    
}
