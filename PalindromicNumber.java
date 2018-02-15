/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Check to see whether an integer entered is palindromic or onot
 * 
 */

// import all of the java utilities using the * wildcard callout
import java.util.*;

// declare the class PalindromicNumber
public class PalindromicNumber {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner input variable input		
		Scanner input = new Scanner(System.in);
		
// declare the integer palNum		
		int palNum;
		
// prompt the user to enter the three digit integer to be checked		
		System.out.println("Please enter a three digit integer to check if it is palindromic: ");
		
// assign the palNum variable to the next integer entered through the console 		
		palNum = input.nextInt();
		
// close Scanner
		input.close();
		
// declare the string palNumString and convert the palNum integer to a string to be able to check the length as 3		
		String palNumString = new Integer(palNum).toString();

// declare the integer length and check the length of the entered number by user 		
		int length = palNumString.length();
		
// nested if/else statement to determine if the length of the number entered is not equal to three print an error to the console 
// if it the correct length continue with the rest of the if/else statement		
		if (length != 3){
				
			System.out.println("Error: The length of the integer that you entered is incorrect ");
			System.out.println("You entered an integer with a length of " + length + " instead of a length of 3"
					+ ".");
		}
// close if		
	
// else part of the if/else statement using division and the modulus functions get the first and last digit of the number entered to check if the numbers are equal 		
		else{
		
// declare the variables lastDigit and firstDigit as integers and assign the values of palNum % 10 and palNum / 100			
		int lastDigit = palNum % 10;
		int firstDigit = palNum / 100;
		
// if/else statement checking to see if the first and last digits are equal 		
		if (lastDigit == firstDigit){
			
// if equal print to console message saying that the number is palindromic			
			System.out.println("The number " + palNum + " you entered is a palindromic number");
		}
// close if
		
		else {
			
// if not equal print to console message saying that the number is not palindromic			
			System.out.println("The number " + palNum + " you entered is a not a palindromic number");
		}
// close else		
		
		}	
// close last part of the nested if/else statement	
	}
// close main method
}
//close class PalindromicNumber






