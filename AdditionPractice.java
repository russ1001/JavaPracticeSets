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
		
// declare the SecureRandom variable and set it to a new SecureRandom number to be generated
	SecureRandom add = new SecureRandom();	
		
// declare the variables numOne, numTwo, sum, answer, counter as integers
// set the values of sum and answer to zero
// set the value of counter to -1 to make sure when the counter is incremented in the while loop the number of correct answers starts from zero
		int numOne;
		int numTwo;
		int sum = 0;
		int answer = 0;
		int counter = -1;
		
// declare the Scanner variable input and set it to the console input from user		
		Scanner input = new Scanner(System.in);
			
// while loop that will continue performing the loop while the answer that the user enters is equal to the actual sum of the two random generated integers			
			while(sum == answer) {
				
// increment the counter by one
// this represents the number of correct answers given by the user
				counter++;
				
// set the integer variables numOne and numTwo to randomly generated integers from SecureRandom using the index of 101
// since the index starts at zero and we need to have the range to go from 0-100 this gives the correct range otherwise
// if 100 was used as the upper limit then 100 would never be randomly generated
				numOne = add.nextInt(101);
				numTwo = add.nextInt(101);
				
// print to console and prompt the user to enter the answer for the two integers displayed to be added				
				System.out.println("Enter the answer: " + numOne + "+" + numTwo + "=");
				
// set the integer variable sum to the next entered integer from the user via the console				
				sum = input.nextInt();
				
// set the integer variable answer to the sum of the integer variables numOne and numTwo				
				answer = numOne + numTwo;
				
// if statement to check to see if the entered answer from the user is correct print to console "Great job!"				
				if(answer == sum) {
					
// print to console Great job when the user's answer is correct					
					System.out.println("Great job!");
				}
// close if				
				
			}
// close while
			
			input.close();
// close Scanner			
			
// print to console a dashed line for spacing from input to output			
			System.out.println("-----------------------------------------------------------");
			
// print to console the number of correct solutions the user entered			
			System.out.println("The number of correct solutions you entered is: " + counter);
	}
// close main method	
}
// close class AdditionPractice
