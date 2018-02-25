/*
 * Russell Streff
 * CSCI 225
 * Problem Set #4 
 * 
 * Problem statement #6 - Wrapped
 * 
 * Prompt the user to enter 2 words. Take the first half of the first word and put it at the front of the
second word. Take the second half of the first word and put it at the end of the second word. Print the
new string.
Input Format
Two strings that don’t necessarily have to be a word but a random collection of characters.
Output Format
The second word wrapped up by the first word. 
 * 
 * */

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class WrappedStrings
public class WrappedStrings {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and assign it to the console data entered
		Scanner input = new Scanner(System.in);
		
// declare the variables firstWord and secondWord as Strings and assign empty strings to them
// declare the variables firstHalf and secondHalf as Strings
// declare the variable length1 as an integer
		String firstWord = "";
		String secondWord = "";
		String firstHalf;
		String secondHalf;
		int length1;
			
// prompt the user to enter the first word via the console
		System.out.println("Please enter the first word to be processed: ");

// assign the variable firstWord to the next input string from console		
		firstWord = input.next();
		
// trim off any leading or trailing edge space
		firstWord = firstWord.trim();
		
// prompt the user to enter the first word via the console
		System.out.println("Please enter the second word to be processed: ");

// assign the variable firstWord to the next input string from console		
		secondWord = input.next();
		
// trim off any leading or trailing edge space from the entered data
		secondWord = secondWord.trim();
		
// close Scanner
		input.close();
		
//assign the variable length1 to the length of the first string
		length1 = (firstWord.length() / 2);

// assign the variable firstHalf to the value of the firstWord variable's entered length divided by 2 (i.e. the first half of the string) starting at index 0
		firstHalf = firstWord.substring(0,length1);
		
// assign the variable secondHalf to the value of the firstWord variable's entered length starting at index length1 (i.e. starting at the second half of the string)
		secondHalf = firstWord.substring(length1,firstWord.length());
		
// print to console the first word entered, the 1st half and 2nd half of the word
// print to console the second word entered and then that word wrapped by the 1st and 2nd halves of the 1st word
		System.out.println("\nThe wrap word entered was " + firstWord + " and the 1st half of that word is " + firstHalf + ", the 2nd half of that word is " + secondHalf);
		System.out.println("The word to be wrapped by these two halves is " + secondWord);
		System.out.println("The resulting wrapped word is " + firstHalf + secondWord + secondHalf);
		
	}
// close main method
}
// close WrappedStrings class
