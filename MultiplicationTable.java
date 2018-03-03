/*Russell Streff
CSCI 225
Problem Set #5 - 

				Problem Statement #4 – Multiplication table 
				
				
Take, as input, an integer n that is greater than 0 and prints a times table up to n.
If n is less than or equal to 0 print an error and stop.  
You will need multiple loops to accomplish this. 

Input Format 
An integer to denote the number to multiply up to.  Must be greater than 0. 

Output Format 
A table such that moving across the row and down a column will give the correct multiplication result
				
			
*/

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class MultiplicationTable
public class MultiplicationTable {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the user input from the console		
		Scanner input = new Scanner(System.in);
		
// declare the variable n as an integer that will represent the integer entered by user via the console
// set it's value to zero
		int n = 0;
				
// prompt the user to enter a positive integer via the console		
		System.out.println("Please enter an positive integer: ");
		
// set the integer variable n to the next integer entered via the console		
		n = input.nextInt();
		
// close the Scanner		
		input.close();
		
// check to see if the entered integer is positive		
		if(n<=0) {
			
// if true, print error message to the console			
		System.out.println("Error: The integer you entered is negative.");

// exit program			
		System.exit(1);
		}
// close if		
		
// print one line to console for spacing after input		
		System.out.println();
		
// print to console a label to explain the output
		System.out.println("The multiplication table from 1 to the integer " + n + " is:");
		
// print to console one dashed line
		System.out.println("--------------------------------------------------------------------------------------------------");
		
// outer for loop that will iterate from 1 to the integer n entered by the user incrementing by one each loop		
		for(int i=1; i<=n; i++) {
			
// inner for loop that will iterate from 1 to the integer n entered by the user incrementing by one each loop			
			for(int j=1; j<=n; j++) {
				
// print to console the product of the first counter i and the second counter j with a tab after each character				
				System.out.print(i*j + "\t");
			}
// close inner for loop			
			System.out.println();
// print to console one line to space each set of values of the multiplication table one set per line			
		}
// close outer for loop		
		
	}
// close the main method
}
// close the class MultiplicationTable