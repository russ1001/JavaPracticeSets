/*
Russell Streff
CSCI 225
Problem Set #4 - Input Validation

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

// take in the users input and set the variable userResponse to its value                 
				userResponse = input.next().trim(); 
				
				input.close();
				
				int stLength = userResponse.length();

// assign the signleDigit char variable to the value of the data entered by the user at index 0              
				singleDigit = userResponse.charAt(0);			
						
				if(Character.isDigit(singleDigit) && stLength == 1) {
							
							System.out.println("Thank you!");
				}
					else {
						
						if(Character.isDigit(singleDigit) && stLength > 1) {
							
							System.out.println("Invalid Data: You entered a multiple length digit with the length of " + stLength);
							
						}
					
					
				
					else {
								
								if(Character.isAlphabetic(singleDigit)) {
									
									System.out.println("No, that is a letter or a string!");
									System.out.println("The length of the character string you entered is " + stLength + " and it should have been only a single digit!");
								}
								
								else {
									
									if(!(Character.isAlphabetic(singleDigit))) {
										
										System.out.println("Invalid data: You entered a character(s) other than a single digit");
										System.out.println("You entered " + userResponse);
									}
								}
							}
					 }
				}
		}                          

  
					                                         

                                                           

               



 