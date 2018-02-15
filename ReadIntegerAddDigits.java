/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #2 - 
 * 					
 * 
 *  3. Read in an integer between 0 and 1000 and output to the console the sum of the digits
 * 					
 */



// import Scanner utility
import java.util.Scanner;

// declare the class named ReadIntegerAddDigits 
public class ReadIntegerAddDigits {

	// declare the method main
	public static void main(String[] args) {

		// declare the Scanner variable input
		Scanner input = new Scanner(System.in);
		
		// ask user to input the integer
		System.out.print("Enter an integer between 0 and 1000: ");
		
		// read in the integer
		int num = input.nextInt();
		
		// declare printnum equal to num
		int printnum = num;
		
		// declare int sum and assign 0 as the value
		int sum = 0;
		
		// if / else statement that checks the value of variable num to see if is between 0 and 1000. If it is not in the range output to console an error
		// and break out of the if statement
		if (num < 0 || num > 1000)
			System.out.println("ERROR: This number is not in the range reqeusted");
		
		// if the integer is in the range requested then using the modulus function to get the last digit of the integer and the division function to get
		// get rid of the last digit of the integer. Both are executed as long the integer is not equal to zero
		// the variable sum is added to itself as the last digit is dropped off using modulus
		
		else{
			
		// while condition as long as num is not equal to zero
		while (num != 0){
			
		// add sum to itself and get last digit using modulus
			sum = sum + (num % 10);
			
		// divide num by 10 each time to get rid of the last digit
			num = num / 10;
			
			}
			
		// output to console the sum of the digits
				System.out.println("The sum of the digits of the integer " + printnum + " is " + sum);
			}	
		
		
		}
	
	// end main method
	
	}

//end class ReadIntegerAddDigits
	

