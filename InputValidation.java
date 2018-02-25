/*
Russell Streff
CSCI 225
Problem Set #4

Problem statement #1 - Input Validation

Receive as input a single digit. If the user enters a single digit then output “Thank you”. If the
user enters a letter display “No, that’s a letter.” If the user enters an alphabetic character that
is neither a digit nor a letter display invalid input. 




*/

// import the entire java utility class using the * wildcard callout
import java.util.*;

// declare the class InputValidation
		public class InputValidation {

// declare the main method
			public static void main(String[] args) {
			              
// declare the Scanner variable input to take in from the console the users input 
				Scanner input = new Scanner(System.in);
                        
// declare the variables userResponse as a String and singleDigit as a char                            
				String userResponse;
				char singleDigit;
                                         
// prompt the user to input the single digit from the console
				System.out.println("Please enter a single digit for a validation check: ");

// take in the users input and set the variable userResponse to its value trimming off any leading or trailing spaces of the string using the .trim function                
				userResponse = input.next().trim(); 
				
// print one line to console for spacing
				System.out.println(" ");
	
// close Scanner				
				input.close();
				
// 	declaring a variable stLength as an integer and setting it's value to the length of the entered variable userReponse			
				int stLength = userResponse.length();

// assign the signleDigit char variable to the value of the data entered by the user at index 0              
				singleDigit = userResponse.charAt(0);	
				
// series of if/else statements that check the correctness of the inputted data
// 1st if statement checks if the entered data is a single digit with length of 1
				if(Character.isDigit(singleDigit) && stLength == 1) {
							
// print to console that the entered value is correct					
							System.out.println("Your entered value is correct. Thank you!");
				}
// close if				
					else {
						
// else/if checking for multiple character digit entered						
						if(Character.isDigit(singleDigit) && stLength > 1) {
					
// print to console that the entered data is a series of digits							
							System.out.println("Invalid Data: You entered a series of digits with the length of " + stLength);
						}
// close if					
					
					else {
							
// if/else statement checking if the entered data is a letter or string						
								if(Character.isAlphabetic(singleDigit)) {
									
// print to console that it was a letter or string									
									System.out.println("No, that is a letter or a string!");
									System.out.println("The length of the character string you entered is " + stLength + " and it should have been only a single digit!");
								}
// close if								
								else {
									
// if/else statement checking if the entered data is a special character other than a letter or digit									
									if(!(Character.isAlphabetic(singleDigit))) {
										
// print to console that it was a special character										
										System.out.println("Invalid data: You entered a character(s) other than a single digit");
										System.out.println("You entered " + userResponse);
									}
// close if	
									
								}
// close else	
								
							}
// close else	
						
					 }
// close else
				
				}
// close main method	
			
		}           
// close class InputValidation		

  
					                                         

                                                           

               



 