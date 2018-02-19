/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Randomly generate a card from a deck of playing cards and print out result
 * 
 */


// import the utility class SecureRandom
import java.security.SecureRandom;

// declare the class PickCardFromDeck
public class PickCardFromDeck {

// declare the main method
	public static void main(String[] args) {
		
// set variables card and suit as SecureRandom numbers and then generate those numbers using the SecureRandom class
		SecureRandom card = new SecureRandom();
		SecureRandom suit = new SecureRandom();
		
// declare variables numCard and ranSuit as integers		
		int ranCard, ranSuit;
		
// ranCard variable assigned the value of the card SecureRandom variable
// the random number generated by card is initialized the value 1 so that no zeros are generated 
// since there is no card associated with the value zero		
// the upper range of the numbers generated is 13
			ranCard = card.nextInt(13) + 1;
			
// ranSuit variable assigned the value of the suit SecureRandom variable
// the random number generated by suit is initialized the value 1 so that no zeros are generated 
// the upper range of the numbers generated is 4
			ranSuit = suit.nextInt(4) + 1;

// print to console "The random card picked is the " and then using the following two switch statements get the card randomly generated 	
// and print to console
			System.out.print("The random card picked from a deck of 52 playing cards is the ");
			
// switch statement checking the value of the ranCard variable after the SecureRandom variable card has been generated
// print to console the corresponding value of the case and then break out of this switch statement			
			switch(ranCard)
			{
			case 1: 	System.out.print("Ace of ");	break;
			case 2:		System.out.print("Two of ");	break;
			case 3:		System.out.print("Three of "); 	break;
			case 4:		System.out.print("Four of "); 	break;
			case 5:		System.out.print("Five of "); 	break;
			case 6:		System.out.print("Six of "); 	break;
			case 7:		System.out.print("Seven of ");	break;
			case 8:		System.out.print("Eight of "); 	break;
			case 9:		System.out.print("Nine of "); 	break;
			case 10:	System.out.print("Ten of "); 	break;
			case 11:	System.out.print("Jack of "); 	break;
			case 12:	System.out.print("Queen of "); 	break;
			case 13:	System.out.print("King of "); 	break;
		}
// close switch statement			
					
// switch statement checking the value of the ranSuit variable after the SecureRandom variable suit has been generated
// print to console the corresponding value of the case and then break out of this switch statement				
			switch (ranSuit)
		{
			case 1: System.out.println("Clubs");	break;
			case 2: System.out.println("Diamonds"); break;
			case 3: System.out.println("Hearts"); 	break;
			case 4: System.out.println("Spades");	break;			
		}
// close switch statement			
	}
// close main method	
}
// close PickCardFromDeck class











