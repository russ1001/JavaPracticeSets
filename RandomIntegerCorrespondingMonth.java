/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Randomly generate an integer and print out it's corresponding month 
 * 
 */


// import the java security library using the * wildcard callout to be able to use the SecureRandom class
import java.security.*;

// declare the class RandomIntegerCorrespondingMonth
public class RandomIntegerCorrespondingMonth {

// declare the main method	
	public static void main(String[] args){

		// declare the variable num as a random number using the Random() class
		SecureRandom num = new SecureRandom();
		// declare the variable range as an int and the variable month as a String and assigned it as empty
		int range;
		String month = "";
		
		// set the variable range to the randomly generated variable num 
		// add one to the value so that zero is not one of the values randomly generated
		// within the paranthesis the value 12 is the number that the Random() class will generate numbers up to
		range = 1 + num.nextInt(12);
		
		// switch statement to check the value of range 
		// each case represents one of the months of the year
		// whatever the corresponding case it will return the variable month to be set as that month 
		// the switch function will break when one of the cases is reached
		// the default case is not really needed since there is no input from the user with the possibility of entering
		// a month that is not in the range
		switch (range)
		{
		case 1: 	month = "January";	 	break;
		case 2: 	month = "February";	 	break;
		case 3: 	month = "March"; 		break;
		case 4: 	month = "April";	 	break;
		case 5: 	month = "May";		 	break;
		case 6: 	month = "June"; 		break;
		case 7:	 	month = "July"; 		break;
		case 8: 	month = "August"; 		break;
		case 9: 	month = "September"; 	break;
		case 10: 	month = "October"; 		break;
		case 11: 	month = "November"; 	break;
		case 12: 	month = "December"; 	break;
		
		}
		// end switch statement
		
		// print to console the randomly generated integer and corresponding month of the year
		System.out.println("The randomly generated integer is " + range + " and the corresponding month of the year is " + month + ".");	
		
	}
	// end main method
}
// end class RandomIntegerCorrespondingMonth
