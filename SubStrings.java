/*
 * Russell Streff
 * CSCI 225
 * Problem Set #4 - Substrings
 * 
 * Write a program that accepts two strings and determines whether one is a substring of another.
Input Format
Two strings entered by the user.
Output Format
The string or strings that are substrings of the other. 
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
		
		String one;
		String two;
		
		
		System.out.println("Enter two strings: ");
		
		one = input.next();
		two = input.next();
		
		input.close();
		
		for (int i = 0; i<one.length(); i++) {
			
			char currentChar1 = one.charAt(i);
			
			System.out.println(currentChar1);
			
		}
		
		for (int j = 0; j<two.length(); j++) {
			
			char currentChar2 = two.charAt(j);
			
			System.out.println(currentChar2);
			
		}
		
		
		
		
		
		
		
		
		
		
	}
// close main method	
}
// close class SubString
