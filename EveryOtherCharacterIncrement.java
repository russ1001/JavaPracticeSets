/*
 * Russell Streff
 * CSCI 225
 * Problem Set #5
 * 
 * 					Problem Statement #7 – Every Other Character
 * 
 * 
Write a program that prompts the user for a word and an increment. 
The increment must be
less than the length of the word and greater than 0. 
Print every other character at each increment starting at 0. 
If increment is not between these values then output an error.
Input Format
The first input is a string of characters. 
The second input must be an integer between
0(exclusive) and the length of the string(exclusive).
Output Format
A new line containing only the characters at ever other increment starting at index 0. 
If the increment value is equal to 0 or less or equal to the length of the string or more then output an
error instead. 
 * 
 * 
 * 
 * */


// import the entire java utility using the * wildcard callout
import java.util.*;


// declare the class EveryOtherCharacterIncrement 
public class EveryOtherCharacterIncrement {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the console input
		Scanner input = new Scanner(System.in);
		
// declare the variables word as a String and increment as an integer
// set increment's value to zero
		String word;
		int increment = 0;
		
// prompt the user to enter a word via the console			
		System.out.println("Please enter a word: ");
		
// set the word variable to the next string entered via the console		
		word = input.next();
		
// prompt the user to enter an integer to be used as increment on the entered string		
		System.out.println("Please enter a integer that is less than the character length of the string you entered: ");
		
// set the increment variable to the next integer entered via the console		
		increment = input.nextInt();
		
// close Scanner		
		input.close();
		
// if statement to see if the increment value less than or equal to zero or greater than or equal to the length of the entered string by the user	
// if true, print an error to the console stating such and exit program		
		if(increment >= word.length() || increment <=0) {
			
// print to console an error stating the entered integer is the incorrect length			
			System.out.println("----------------------------------------------");
			System.out.println("ERROR: The increment you entered does not meet the required length");
			
// exit program			
			System.exit(1);
		}
// close if 		
		
// print dashed line to console for spacing		
		System.out.println("----------------------------------------------");
		
// print to console explaining the output to the user
		System.out.println("The characters that result in iterating through the string \'" + word + "\' by an increment of " + increment + " is: ");
		
// print the first character of the string entered		
		System.out.print(word.charAt(0));
	
// for loop using the counter i as an integer with it's value set to the entered increment
// iterate through the loop through the length of the string entered
// increment the counter i by the increment entered by the user 
		for(int i=increment; i<word.length(); i+=increment) {
			
// print to console the character at the index i 			
			System.out.print(word.charAt(i));
			
		}
// close for loop		
		
	}
// close main method	

}
// close class EveryOtherCharacterIncrement
