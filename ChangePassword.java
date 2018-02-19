/*Russell Streff
CSCI 225
Problem Set #4 - Change password
 * 
 * 
 * Having a secure password is important. Write a program that prompts the user to create a new
password with at least one uppercase letter, one lowercase letter, and one digit. The password must
have a length of 5. If the password violates on of these rules, tell the user which error has occurred. If
the password is good, display a message that the password has been changed.
Input Format
A five character string that must contain an uppercase letter, lowercase letter, and one digit.
Output Format
A newline containing a message of whether the password was changed or an error has
occurred. 
 * 
 * */

// import the entire java utility class using the * wildcard callout
import java.util.*;

// declare the class ChangePassword
public class ChangePassword {

// declare the maim method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it's value to the entered data from user
		Scanner input = new Scanner(System.in);
		
// declare the variables as follows:
// passWord as a string
// currenChar as a char
// number, upperCaseLetter, lowerCaseLetter, passWordCorrect as booleans and set their value to false
		String passWord;
		char currentChar;
		boolean number = false;
		boolean upperCaseLetter = false;
		boolean lowerCaseLetter = false;
		boolean passWordCorrect = false;
		
// prompt the user to enter a 5 digit password with the below parameters via the console		
		System.out.println("Please enter a new 5 digit password with at least one uppercase letter, one lowercase letter and one digit: ");
	
// set the variable passWord to the input data from the console
		passWord = input.next();
		
// close Scanner
		input.close();
		
// print one blank line to console for spacing
		System.out.println(" ");
		
// if/else statement checking the length of the string entered greater than the required 5 character string
		if(passWord.length() > 5){
			
// print to console error that the entered data is longer than the required 5 character string
			System.out.println("Error: The password string of length " + passWord.length() + " that you entered is greater than the required 5 character length.");

// exit program so the rest of the code does not run			
			System.exit(1);
		}
// else if statement checking to see if the entered data is less than the required 5 character string		
		else if(passWord.length() <=4) {
			
// print to console error that the entered data is shorter than the required 5 character string			
			System.out.println("Error: The password string of length " + passWord.length() + " that you entered is less than the required 5 character length.");
		
// exit program so the rest of the code does not run				
			System.exit(1);
		}
// close else/if		

// for loop that declares the integer i as a counter and sets it's value to 0
// the loop will iterate through the length of the passWord variable entered through the console
// incremented 1 each time it loops
		for (int i=0; i < passWord.length(); i++) {
		
// setting the currentChar char variable to the passWord variable's character as the for loop iterates through the string			
			currentChar = passWord.charAt(i);
			
// checking to see if the string has a digit 			
			if(Character.isDigit(currentChar)) {
				
// if it is so than set the boolean variable number to true				
				number = true;
				
			}
// close if			

// checking to see if the string has an upper case letter			
			else if(Character.isUpperCase(currentChar)) {

// if it is so than set the boolean variable upperCaseLetter to true				
				upperCaseLetter = true;
				
			}
// close else/if
			
// checking to see if the string has a lower case letter			
			else if(Character.isLowerCase(currentChar)) {
			
// if it is so than set the boolean variable lowerCaseLetter to true				
				lowerCaseLetter = true;
			}
// close else/if			

// checking to see if the boolean variables number, upperCaseLetter and lowerCaseLetter are all true 		
			if(number && upperCaseLetter && lowerCaseLetter) {

// if it is so than set the boolean variable passWordCorrect to true					
				passWordCorrect = true;
			}
// close if				
			
		}
// close for loop		
		
// if the boolean variable passWordCorrect is true		
		if(passWordCorrect == true) {

// print to console password changed			
			System.out.println("Password changed!");
			}
// close if	
		
// else/if statement checking to see what part of the entered password string is incorrect		
		else {
			
// checking to see if the boolean variable number is false 			
			if(number == false)

// print to console that the user needs to enter at least one digit				
			System.out.println("Error: Your password should contain at least one digit.");
	
// checking to see if the boolean variable upperCaseLetter is false 			
			if(upperCaseLetter == false) {
				
// print to console that the user needs to enter at least one upper case letter				
				System.out.println("Error: Your password should contain at least one uppercase letter.");
				
				}
// close if
			
// checking to see if the boolean variable lowerCaseLetter if false			
			if(lowerCaseLetter == false) {
				
// print to console that the user needs to enter at least one lower case letter				
				System.out.println("Error: Your password should contain at least one lowercase letter.");
			}
// close if			
		}
// close else	
	}
// close main method	
}
// close class ChangePassword
