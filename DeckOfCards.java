
public class DeckOfCards {

	public static void main(String[] args) {
		
		int[] deck = new int[52];
		
		// 52 cards
		// 4 suits
		// 13 ranks
		// 52/13 = 0-3 = suits
		// 52%13 = 0-12 = ranks	
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// initialize array
		for(int i=0; i<deck.length; i++) {
			
			deck[i] = i;
			
		}
		
		// shuffle deck
		for(int i=0; i<deck.length; i++) {
			
			int index = (int) (Math.random() * deck.length);
			
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for(int i=0; i<4; i++) {
			
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
		
		
		
	}
	
}
