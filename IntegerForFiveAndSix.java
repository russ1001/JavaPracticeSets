/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Check the divisibilty of an integer by 5 and 6
 * 
 */

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class IntegerForFiveAndSix
public class IntegerForFiveAndSix {

// declare the main method	
	public static void main(String[] args) {
	
// declare the Scanner variable input to take in input from console		
	Scanner input = new Scanner(System.in);
	
// declare the variables num, divFive, divSix as integers 
// declare the variable answer as boolean and set it's value to false
	int num;
	int divFive;
	int divSix;
	boolean answer = false;
		
	
// prompt the user to enter an integer via the console
	System.out.println("Enter an integer to see to what degree it is divisible by 5 and 6: ");
		
// assign the variable num to the next integer entered by user	
	num = input.nextInt();
	
// close Scanner	
	input.close();
	
// create some space between the entered integer and the answer	
	System.out.println("");
	
// calculate the remainder of the numbers 5 and 6 of the integer entered by the user using the divFive and divSix varaibles
	divFive = num % 5;
	divSix = num % 6;
	
// nested if/else statements that checks whether the entered integer is divisible by 5 and 6, 5 or 6 and 5 or 6 but not both	
// check if the integer is divisible by 5 and 6	
	if (divFive == 0 && divSix == 0) {
		
// 	yes divisible by 5 and 6	
		answer = true;
		
// print to console the answer		
		System.out.println("Is the number "  + num + " divisible by 5 and 6? Answer: " + answer);
		
		}
	
		else {
			
// no divisible by 5 and 6				
			answer = false;
			
// print to console the answer				
			System.out.println("Is the number "  + num + " divisible by 5 and 6? Answer: " + answer);
		
		}
	
// check if the integer is divisible by 5 or 6	
				if (divFive == 0 || divSix == 0) { 
		
// yes divisible by 5 or 6					
					answer = true;
					
// print to console the answer					
					System.out.println("Is the number "  + num + " divisible by 5 or 6? Answer: " + answer);
		}
						else {
// no divisible by 5 or 6 							
							answer = false;
							
// print to console the answer							
							System.out.println("Is the number "  + num + " divisible by 5 or 6? Answer: " + answer);
		}		
// check if the integer is divisible by 5 or 6, but not both			
					if (divFive == 0 ^ divSix == 0) {
					
// yes divisible by 5 or 6 but not both						
						answer = true;
						
// print to console the answer						
						System.out.println("Is the number "  + num + " divisible by 5 or 6, but not both? Answer: " + answer);
		}
							else { 
// no divisible by 5 or 6 but not both								
								answer = false;
								
// print to console the answer								
								System.out.println("Is the number "  + num + " divisible by 5 or 6, but not both? Answer: " + answer);
			
		}
// close last check of if/else statements					
				
	}
// close main method

}
// close class IntegerFiveAndSix

