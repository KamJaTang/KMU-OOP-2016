class BillfodTest {
	public static void main (String args[]){
		Billfod bf1 = new Billfod();
		
		Card card1 = (Card) new CallingCard("a", 123, 456);
		Card card2 = (Card) new CallingCard("b", 789, 999);
		
		bf1.addCard(card1);
		bf1.addCard(card2);
		
		System.out.println(bf1.formatCards());
		
		Billfod bf2 = new Billfod();
		Card card3 = new CallingCard("Alice", 4457, 9964);
		Card card4 = new DriverLicense("Tom", 2014);
		
		bf2.addCard(card3);
		bf2.addCard(card4);

		System.out.println(bf2.getExpiredCardCount());
		
	}
}