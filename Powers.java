/*Russell Streff
CSCI 225
Problem Set #5 - 

				Problem Statement #1 – Powers 
				
				
Read in as input two values.  The first value is the base number (x) which can be a decimal number.  
The second number represents the upper exponent limit (p) and should be an integer greater than or equal to 0.  
If the upper limit is not a positive integer display “invalid upper limit” and do nothing else.  
If upper limit is valid then, counting from 0 to the upper limit, display x^p where p equals the current count. 

Input Format 
Two values.  The first can be any real number.  The second is strictly a positive integer value. 

Output Format 
New lines containing x^p. 
*/


// input entire java utility using the * wildcard callout
import java.util.*;

// declare the Powers class
public class Powers {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the system input from the user via the console
		Scanner input = new Scanner(System.in);
		
// declare the variable base as a double and set it's value to zero
// declare the variable exponent as an integer and set it's value to zero
		double base = 0;
		int exponent = 0;
		
// prompt user to enter the base number via the console		
		System.out.println("Please enter a base number: ");
		
// set the base variable to the next double entered by the user		
		base = input.nextDouble();
		
// prompt the user to enter the exponent via the console		
		System.out.println("Please enter an exponent limit: ");

// set the exponent variable to the next integer entered by the user		
		exponent = input.nextInt();
		
// close Scanner		
		input.close();
		
// if test to see if the exponent is negative
// if so, print error message to console and exit the program
		if(exponent <0) {
			
// print error to console			
			System.out.println("ERROR: You entered a negative exponent!");
			
// exit program if exponent is negative 			
			System.exit(1);
		}
// close if		
		
// print dashed line to console for spacing between input and output		
		System.out.println("------------------------------------------------------------");
// print to console what the reader will be shown		
		System.out.println("The base number " + base + " to the power of " + exponent + " results in the following:");
		
// print dashed line to console for spacing 
		System.out.println("------------------------------------------------------------");

// for loop declaring and initializing the variable i to an integer and setting it's value to 0
// iterate through the loop equal to the value of the exponent
// increment by one
		for(int i=0; i<=exponent; i++) {
			
// print to console the base number to the power of the entered exponent 
// showing each iteration of the base ^ power using the i counter
// using Math.pow bring the base number to the exponent using the current index of i
			System.out.println(base + "^" + i + " = " + Math.pow(base, i));		
			
		}
// close for loop		
		
	}
// close main method	

}
// close class Powers
