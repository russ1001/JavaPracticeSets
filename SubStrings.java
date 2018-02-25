/*
 * Russell Streff
 * CSCI 225
 * Problem Set #4
 * 
 * Problem statement #5- Substrings
 * 
 * Write a program that accepts two strings and determines whether one is a substring of another.
Input Format
Two strings entered by the user.
Output Format
The string or strings that are substrings of the other. 
 * 
 * 
 * */

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class SubString
public class SubStrings {

// declare the main method	
	public static void main(String[] args) {

// declare the Scanner variable input and set it's value to the console input from the user
		Scanner input = new Scanner(System.in);
		
// declare the variables one and two as strings		
		String one;
		String two;
				
// prompt the user to enter the first string via the console		
		System.out.println("Please enter the first string: ");
		
// assign the variable one the next string entered via the console		
		one = input.next();

// prompt the user to enter the second string via the console
		System.out.println("Please enter the second string: ");
		
// assign the variable two the next string entered via the console	
		two = input.next();
	
// close Scanner		
		input.close();
	
// create one line of space between the input and output		
		System.out.println(" ");
		
// if statement checking to see if the 1st string contains the 2nd string		
		if(one.contains(two)) {
			
// if true then print to console that the 2nd string is a substring of the 1st			
			System.out.println("Yes, the second string " + "'" + two + "'" + " is a substring of the first string " + "'" + one + "'");
		}
// close if		

// if statement checking to see if the 2nd string contains the 1st string		
		if(two.contains(one)) {
			
// if true then print to console that the 1st string is a substring of the 2nd			
			System.out.println("Yes, the first string " + "'" + one + "'" + " is a substring of the second string " + "'" + two + "'");
		}
// close if		
		
// if statement checking to see if neither string is contained in the other
		if(!(one.contains(two)) && !(two.contains(one))) {
			
// if true then print to console that neither string is a substring of the other
			System.out.println("Neither string entered is a substring of each other.");
		}
// close if		
	}
// close main method	
}
// close class SubString