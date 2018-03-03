/*Russell Streff
CSCI 225
Problem Set #5 - 

				Problem Statement #5 – Addition Practice 
				
				
Write a program that continuously displays two numbers between 0 and 100 and waits for the user to enter the sum of the two numbers.  
If the sum is wrong then stop and display the count of how many they got right. 
(HINT: You do not need to use a break statement to exit the loop) 

Input Format 
An integer containing the user’s sum. 

Output Format 
If the user gets the sum correct then display correct and move on to the next random problem.  
If the user gets a sum incorrect then stop and display the count of the number of sums they got right.
			
*/

import java.util.*;
import java.security.*;

// declare the class AdditionPractice
public class AdditionPractice {

// declare the main method	
	public static void main(String[] args) {
		

	SecureRandom add = new SecureRandom();	
		
		int numOne;
		int numTwo;
		int sum;
		int answer;
		boolean correct = true;
		
		Scanner input = new Scanner(System.in);
			
			numOne = add.nextInt(101);
			numTwo = add.nextInt(101);
			
			
			System.out.println("Enter the answer: " + numOne + "+" + numTwo + "=");
			sum = input.nextInt();
			
			answer = numOne + numTwo;
			
			if(sum == answer) {
				
				System.out.println("yes");
			}
			
		
		
		
		
		
		
		
		
	}
// close main method	
}
// close class AdditionPractice