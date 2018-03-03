/*
 * Russell Streff
 * CSCI 225
 * Problem Set #5
 * 
 *  
 * Problem Statement #3 – Password Generation* 
 *
Take, as input, an integer n that is greater than 0 and randomly generate a password of length n.  
If the value entered is 0 or less then display an error.   
The password may contain characters between ! and ~.  
Please refer to the ASCII table for additional information. 

Input Format 
An integer to denote the size of the password to be generated.  Must be greater than 0. 

Output Format 
An n length string containing randomly generated characters.

*Keep in mind that if you use Math.random() to generate the password then you may not end up with a secure password.
*Secure passwords eliminate repetition and contain high entropy.  
*Math.random() is predictable when given the first value. 

*/




// import the entire java utility using the * wildcard callout

import java.util.*;


// import the SecureRandom class for the generation of a secure random number
import java.security.SecureRandom;

// declare the class PasswordGeneration
public class PasswordGeneration {

// declare the main method	
	public static void main(String[] args) {
	
// declare the Scanner variable input and set it's value to the user entered data via the console		
		Scanner input = new Scanner(System.in);
		
// declare the variable num as an integer
		int num;
		String password;
		
		Random random = new Random();
		
// prompt the user via the console to enter the integer to be used to help generate the random number
		System.out.println("Please enter an integer to be used to as the length of a password generated: ");
		
// set the next data entered by user via the console to the input variable num
		num = input.nextInt();

		input.close();
		
		if(num<=0) {
			
			System.out.println("Error: The value entered is a negative integer");
			System.exit(1); 
		}
		
		for(int i=0; i<num; i++) {
			
			password = random.toString();
			System.out.println(password);
		}
				
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
// close main method	
}
// close class PasswordGeneration