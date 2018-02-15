/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Take 3 entered integers and print them out in non-decreasing order
 * 
 */

// import whole java utility using the * wildcard callout
// java will only import and call out those classes needed
import java.util.*;

// declare the class NonDecreasingIntegers
public class NonDecreasingIntegers {

// declare the main class	
	public static void main(String[] args) {
		
// declare the input variable as a Scanner object		
		Scanner input = new Scanner (System.in);
		
// declare the variables a, b, c as integers		
		int a,b,c;

// ask the user to enter in three integers to the console		
		System.out.println("Enter three integers: ");
		
// take in the three integers and assign each one to the respective variables		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
// close Scanner
		input.close();
		
		
// print to console the original three integers entered		
		System.out.println("The three integers entered are " + a + " " + b + " " + c);
		
// swap variables based on the values relating to each other taking the variable a and switching with variable b if a is greater than b
// declaring the variable temp as an integer to help with swapping the integers based on which one is larger
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
			
		}

// swap variables based on the values relating to each other taking the variable b and switching with variable c if b is greater than c
// declaring the variable temp as an integer to help with swapping the integers based on which one is larger	
// you are able to use the temp variable as an int again even though it was used in the prior if statement because the scope is only for that if 
// statement
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
			
		}

// checking one last time the new variable a to see if it is greater than b. This has to be done in case when the swap occurred in the previous
// swap that a ended up being greater than b
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
			
		}
		
// print to console the new a,b,c variable values after the if statements were run. This is now in non-decreasing order		
		System.out.println("and the sorted non-decreasing order is " + a + " " + b + " " + c);
		
	}
// end main method	
}
// end class NonDecreasingIntegers
