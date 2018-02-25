/*
Russell Streff
CSCI 225
Problem Set #4
Problem statement #3 - NEWS (Cardinal Direction) 

Take in as input a cardinal direction (North, East, South, or West) and output a character that
represents the direction entered. The user should be allowed to input the directions in any
case. E.g. NoRtH, NORTH, north should all do the same thing. The characters that are
outputted are as follows: 

North : ^
East : >
South : v
West : <
If an invalid string was entered display invalid direction and what the user entered. 

*/


// import the full java utility using the * wildcard callout
import java.util.*;

// declare the class CardinalDirection
public class CardinalDirection {

// declare the main method
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the users input from the console
		Scanner input = new Scanner(System.in);
		
// declare the variables direction and result as Strings and initialize as empty strings		
		String direction = "";
		String result = "";
				
// prompt the user to enter a cardinal direction via the console
		System.out.println("Please enter a cardinal direction: ");
		
// set the direction string variable to the entered data		
		direction = input.next();
		
// close Scanner		
		input.close();
				
// for loop that will take the case of each element of the string and convert all characters to upper case
// declare the variable i as an integer to be used as a counter
// iterate through the for loop equal to the length of the direction variable
			for (int i = 0; i < direction.length(); i++) {
				
// declare the variables currentChar and changeChar as chars to be used in the if statement below to change each element of the string to upper case
// initialize currentChar to first index of the string direction
// initialize changeChar to be empty
				char currentChar = direction.charAt(i);
				char changeChar = ' ';
				
// if statement checking whether the element in the string is either upper or lower case				
				if(Character.isLowerCase(currentChar) || Character.isUpperCase(currentChar))
				
// set the element checked to changeChar variable as an upper case character 					
					changeChar = Character.toUpperCase(currentChar);
				
// set the string variable result to the new upper case character and then add it to itself creating the new upper case string cardinal direction				
					result = result + changeChar;
			}
// close for loop			
				
// if statement checking the direction as possible north regardless of the case using equalsIgnoreCase method		
			if(direction.equalsIgnoreCase("North")) {
			
// print to console the correct corresponding symbol and the cardinal direction in upper case				
				System.out.println("\nThe cardinal direction entered is " + direction + " and the corresponding symbol is ^");
				System.out.println("and the capitalized version is " + result);
			}
// close if 			
			
			else {
		
// else/if statement checking the direction as possible south regardless of the case using equalsIgnoreCase method		
			if(direction.equalsIgnoreCase("South")) {

// print to console the correct corresponding symbol and the cardinal direction in upper case				
				System.out.println("\nThe cardinal direction entered is " + direction + " and the corresponding symbol is v");
				System.out.println("and the capitalized version is " + result);
			}
// close if			
			
			else {
				
// else/if statement checking the direction as possible east regardless of the case using equalsIgnoreCase method			
			if(direction.equalsIgnoreCase("East")) {
			
// print to console the correct corresponding symbol and the cardinal direction in upper case	
				System.out.println("\nThe cardinal direction entered is " + direction + " and the corresponding symbol is >");
				System.out.println("and the capitalized version is " + result);
			}
// close if			
			
			
			else {
	
// else/if statement checking the direction as possible west regardless of the case using equalsIgnoreCase method
			if(direction.equalsIgnoreCase("West")) {
				
// print to console the correct corresponding symbol and the cardinal direction in upper case	
				System.out.println("\nThe cardinal direction entered is " + direction + " and the corresponding symbol is <");
				System.out.println("and the capitalized version is " + result);
			}
// close if
			
// else if statement checking to see if the first 4 conditions are not met then print to console an error as invalid data
// checks the string element length of the entered direction that should have a length of 4 or 5
			else {
				
				if(direction.length() > 5  && direction.length() <= 4) {
					
					System.out.println("\nERROR: Invalid cardinal direction! You entered " + direction + " which is NOT a cardinal direction.");
				}
// close if				
				
				else {
// else statement that catches any other parameters not checked already for error				
				System.out.println("\nERROR: The direction " + direction + " that you entered is not a cardinal direction.");
			
						}
// close else				
					}
// close else			
				}
// close else
			}
// close else			
		}
// close else			
	}
// close main method	
}
// close class CardinalDirection
