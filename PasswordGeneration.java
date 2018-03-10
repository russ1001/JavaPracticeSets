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

// import the SecureRandom class for the generation of a secure random number rather than using Math.random or Random
import java.security.SecureRandom;

// declare the class PasswordGeneration
public class PasswordGeneration {

// declare the main method	
	public static void main(String[] args) {
	
// declare the Scanner variable input and set it's value to the user entered data via the console		
		Scanner input = new Scanner(System.in);
		
// declare the variables length, charValue as integers and initialize their values to zero
// declare the variable newPass as a character 
// declare the variable asciiSet as a String and set it's value to the full printable ascii set excluding the 'space' which is the first character of the set
// declare the variable password as a SecureRandom generated number
		int length = 0;
		int charValue = 0;
		char newPass;	
		String asciiSet = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\r\n" + "";
		SecureRandom password = new SecureRandom();
			
// prompt the user via the console to enter the integer to be used to set the length of the random number i.e. password to be generated
		System.out.println("Please enter an integer to be used to as the length of a password generated: ");
		
// set the next data entered by user via the console to the input variable length
		length = input.nextInt();

// close Scanner		
		input.close(); 
		
// if statement checking to make sure that the entered integer length is greater than zero
		if(length<=0) {
			
// print error to the console if the entered integer is less than or equal to zero			
			System.out.println("Error: The value entered is a negative integer");
			
// exit program using the System.exit function with the value set to 'true'			
			System.exit(1); 
		}
// close if		
		
// print to console the output explaining the generated random password with a dashed line for spacing the input from the output
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.print("The new secure random generated password with the length of " + length + " that was entered is: ");
				
// for loop iterating from zero through the length entered by user declaring i as an integer and setting it's value to zero
// increment one each iteration
		for(int i=0; i<length; i++) {
			
// set the integer variable charValue to the SecureRandom generated integer with the upper limit set to 95 
// so that the the random generated integer is within the range of printable ascii characters listed as the String asciiSet
			charValue = password.nextInt(95);
			
// set the char variable newPass to the String variable asciiSet character at index of the randomly generated integer charValue			
			newPass = asciiSet.charAt(charValue);
			
			System.out.print(newPass);						 
		}
// close for loop	
	}
// close main method	
}
// close class PasswordGeneration