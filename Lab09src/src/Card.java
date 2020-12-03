import java.util.*;

public class Card 
{
    private String name;

    public Card() {
        name = "";
    }

    public Card(String n) {
        name = n;
    }

    public String getName() {
        return name; 
    }

    public boolean isExpired() {
    	return false;
    }

    public String format() {
        return "Card holder: " + name;
    }
    
    public String toString(){
    	String result = "name=" + name;
    	return "[" + result + "]";
    }
    
    public boolean equals(Card c1, Card c2){
    	if (c1.getClass().getName().equals(c2.getClass().getName()) 
    		&& c1.toString().equals(c2.toString())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

class IDCard extends Card{
	private String idNumber;
	
	public IDCard(String n, String id){
		super(n);
		idNumber = id;
	}
	
	public String toString(){
    	String result = super.toString() + ", ID Number=" + idNumber;
    	return  "[" + result + "]";
    }
	
	public boolean equals(Card c1, Card c2){
    	if (c1.getClass().getName().equals(c2.getClass().getName()) 
    		&& c1.toString().equals(c2.toString())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
		
}

class CallingCard extends Card{
	private int pin;
	private int cardNumber;
	
	public CallingCard(String n, int cardNum, int pinNum){
		super(n);
		cardNumber = cardNum;
		pin = pinNum;
	}
	
	public String format(){
		String result = super.format() + ", Card Number: " + cardNumber + ", PIN: " + pin;
		return result;
	}
	
	public String toString(){
    	String result = super.toString() + ", Card Number =" + cardNumber +
    			", PIN="+pin;
    	return  "[" + result + "]";
    }
	
	public boolean equals(Card c1, Card c2){
    	if (c1.getClass().getName().equals(c2.getClass().getName()) 
    		&& c1.toString().equals(c2.toString())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

}

class DriverLicense extends Card{
	private int expirationYear;
	
	public DriverLicense(String n, int expYear){
		super(n);
		expirationYear = expYear ;
	}
	
	public boolean isExpired(){
		GregorianCalendar calendar = new GregorianCalendar();
		int currentYear = calendar.get(Calendar.YEAR);
		
		if (currentYear > expirationYear) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String format(){
		String result = super.format() + ", Expration Year of Driver License:" + expirationYear ;
		return result;
	}
	
	public String toString(){
    	String result = super.toString() + ", Expiration Year=" + expirationYear;
    	return  "[" + result + "]";
    }
	
	public boolean equals(Card c1, Card c2){
    	if (c1.getClass().getName().equals(c2.getClass().getName()) 
    		&& c1.toString().equals(c2.toString())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
}

class Billfod{
	private Card card1;
	private Card card2;
	
	public void addCard(Card c){
		if (card1 == null) {
			card1 = c;
		}
		else if (card2 == null){
				card2 = c;
		}
	}
	
	public String formatCards(){
		String result = card1.format() + "\n" +card2.format();
		return result;
	}
	
	public int getExpiredCardCount(){
		int count = 0;
		
		if( card1 instanceof DriverLicense){
			if(!(card1.isExpired()))
			{
				count++;
			}
		}
		
		if( card2 instanceof DriverLicense){
			if(!(card2.isExpired())){
				count++;
			}
		}

		return count;
	}
	
	public String toString(){
		if( card1 == null){
			return "Billfold";
		}
		else if( card2 == null){
			return "Billfold" + this.card1.getName();
		}
		return "Billfold=" + this.card1.getName() + ", "+ this.card2.getName();
	}
	
	public boolean equals(Card c1, Card c2){
    	if (c1.getClass().getName().equals(c2.getClass().getName()) 
    		&& c1.toString().equals(c2.toString())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

}

