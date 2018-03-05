/* Russell Streff
 * CSCI 225
 * Problem Set #5
 * 
 * 					Problem Statement #6– N2 
 * 
 * 
Write a program that asks the user for a positive integer.  
Then, using a while loop, find the smallest integer n such that n2 is greater than the users integer.  
If the user enters an integer that is not greater than or equal to 0 then display an error. 

Input Format 
A positive integer supplied by the user. 

Output Format 
Smallest integer n such that it n2 is greater than the user’s supplied number



 */



// import entire java utility class using the * wildard callout
import java.util.*;

// declare class IntegerSquaredGreaterThanUserInteger
public class IntegerSquaredGreaterThanUserInteger {

// declare main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the input from console by user		
		Scanner input = new Scanner(System.in);
		
// declare the variables userInteger, counter and newInteger as integers
// set counter and newInteger values to zero
		int userInteger;
		int counter = 0;
		int newInteger = 0;
		
// prompt the user to enter the positive integer via the console 				
		System.out.println("Please enter a positive integer: ");
		
// set the userInteger variable to the next integer entered via the console		
		userInteger = input.nextInt();
		
// close Scanner		
		input.close();
		
// if statement checking to make sure that the entered integer by the user is greater than or equal to zero	
		if(userInteger < 0 ) {
		
// print error message to console if integer entered is negative			
			System.out.println("Error: You entered a negative integer.");

// exit program 						
			System.exit(1);
			
		}
// close if 
		
// while loop iterates as long as the newInteger calculated in the loop is less than the user's entered integer		
		while(newInteger < userInteger) {
			
// increment the counter by one			
				counter++;
				
// set the newInteger variable value to the counter to the power of 2 casting the value to an int as the Math.pow is used for doubles				
				newInteger = (int) Math.pow(counter, 2);
				
			}
// close while loop		
	
// print dashed line to console for spacing		
		System.out.println("------------------------------------------------");
		
// print the answer of the smallest integer n such that n^2 is greater than the entered integer by the user		
		System.out.println("The smallest integer n such that n^2 is greater than " + userInteger +  ":  " +  counter + "^2 > " + userInteger + ", the actual squared integer is " + newInteger);
		
	}
// close main method
}
// close class IntegerSquaredGreaterThanUserInteger
