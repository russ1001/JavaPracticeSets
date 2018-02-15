/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - ISBN number calculation
 * 
 */



// import the whole java utility class using the * wildcard callout
import java.util.*;

// declare the class ISBNProject
public class ISBN {

// declare the main class 
	public static void main(String[] args) {
		
// declaring the variable input as Scanner 		
		Scanner input = new Scanner (System.in);

// declaring the nine integers needed to calculate the isbn number with checksum as integers	
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		
// declaring checksum as an integer		
		int checksum;

// prompting the user to input the nine digit isbn number 		
		System.out.println("Please enter the nine digit ISBN number (please enter each digit individually):");

// taking each digit individually and assigning each time the next integer entered to the corresponding int variable  		
		d1 = input.nextInt();
		d2 = input.nextInt();
		d3 = input.nextInt();
		d4 = input.nextInt();
		d5 = input.nextInt();
		d6 = input.nextInt();
		d7 = input.nextInt();
		d8 = input.nextInt();
		d9 = input.nextInt();
		
// close Scanner
		input.close();		
		
// set the variable checksum to the following formula for the isbn number caluclation		
		checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) +(d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
		
// checking to see if the checksum variable is equal to 0, if so print "X" at the end of the nine digit sequence as the checksum
// the isbn number 013031997 will return a checksum of 10 and thus a "X" at the end of the sequence	
		if (checksum == 10){

// printing to console the ISBN10 number with a checksum of 10 showing the "X" as the last digit			
			System.out.println("The ISBN number entered is #" + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");
		}
		
// the else part of the if/else statement verifying the checksum is not 10		
		else {
			
// printing to console the ISBN10 number with a checksum of anything other than 10			
			System.out.println("The ISBN number entered is #" + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + checksum);

// close else part of the if/else statement			
		}
		
// close the main method	
	}

// close the class ISBN	
}




