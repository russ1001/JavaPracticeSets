/*Russell Streff
 * CSCI 225
 * 
 * 				Problem Set #7
 * 
				Problem  #1
				
				
For this problem, do NOT use any class that manipulates data in a collection like the Arrays class or the Collection
class
Problem Statement – Sort as Inserted

Write a program that accepts as its first input a number that represents the number of strings to be
inserted followed by the Strings. 
The program should insert the strings into an array in its sorted position.
The array should NOT be sorted after all elements are inserted rather it should be sorted after each individual
element is inserted. 
Once all elements have been inserted print out the sorted array. Sort in ASCENDING
order (A-Z).

You should have methods that do the following:
Prints the array
Places element in its sorted position

Input Format
First input is the number of elements to be inserted.
On each new line is a string to be inserted.

Output Format
A single line with the elements printed in ascending order separated by a comma. 
 * 
 * 
 */




import java.util.*;

public class SortAsInserted {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of strings to be inserted: ");
		int length = input.nextInt();
		
		String[] names = new String[length]; 
		 
			int i;	 

		for(i=0; i<length; i++) {
			
			
			System.out.println("Enter string #" + (i+1));
			names[i] = input.next();
	
			
			
		} 

		
	
		sortArray(names, length);
		
		
		
		} 
// close main method		


	
// sort array	
	public static void sortArray(String[] x, int userLength) {
		
		
			System.out.println(x[1]);
			
		
		
		
	}
	
	
	
	
// print array	
	public static void printArray(String[] printArray) {
		
		
		
		
		
	}
	
	
	
	

}	
// close class SortAsInserted









/*	System.out.println("The string array is:");

for(int i=0; i<length; i++) {
	
	System.out.println(names[i]);
	
}

*/
