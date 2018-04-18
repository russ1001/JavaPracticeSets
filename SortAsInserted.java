/*
 * 	Russell Streff
 *  CSCI 225
 *  Problem Set #7
 *  
 *  For this problem, do NOT use any class that manipulates data in a collection like the Arrays class or the Collection class 
 *  
Problem Statement – Sort as Inserted 

Write a program that accepts as its first input a number that represents the number of strings to be inserted followed by the Strings.
The program should insert the strings into an array in its sorted position. 
The array should NOT be sorted after all elements are inserted rather it should be sorted after each individual element is inserted.  
Once all elements have been inserted print out the sorted array.  

Sort in ASCENDING order (A-Z). 

You should have methods that do the following: Prints the array Places element in its sorted position 
 
Input Format 
First input is the number of elements to be inserted. On each new line is a string to be inserted. 

Output Format 
A single line with the elements printed in ascending order separated by a comma. 

 * 
 * 
 * 
 */






// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class SortAsInserted
public class SortAsInserted { 

// declare the main method	
	public static void main(String[] args) {

// declare the Scanner variable input and set it to the entered data from keyboard		
		Scanner input = new Scanner(System.in);

// print to console and prompt user to enter the number of strings to be sorted		
		System.out.println("Please enter the number of strings to be sorted: ");

// declare the integer variable length and set it's value to the next inputted value from the user 		
		int length = input.nextInt();
// if statement checking to see if the array length is valid and not negative
// if it is negative print to console error message and exit program
		if(length<1) {  

// print to console error message			
			System.out.println("Error: You entered a non-positive number");
// exit program
			System.exit(1); 
		}
// close if statement
	
// call the sortArray method and pass the size of the array entered by the user		
		sortArray(length);
// message to user that the program sort is complete
		System.out.println("\nYour sort is complete...");
		} 
// close main method		

// sort array method named sortArray
	public static void sortArray(int userLength){
// declare the variable list as a string array with it's size value using the length variable passed by the main method entered by user
		String[] list = new String[userLength];
// declare Scanner variable input and set it to the console input
		Scanner input = new Scanner(System.in);
// declare the String variables temp, key1, key2 and initialize their values to an empty string
		String temp = "";
		String key1 = "";
		String key2 = "";
// declare the integer variable i and set it's value to 0
		int i = 0;
// print to console and prompt the user to enter the first string	
		System.out.println("Enter a string: ");
// declare the String variable element and set it's value to the next integer entered by user		
		String element = input.next(); 
// set the string array list index at counter i to the element enterd by user		
		list[i] = element;
// if statement to check if the user length entered is 1 and if so print the single string and exit the program as sorted
		if(userLength==1) {
// call the printArray method to print array and pass the string array list to it
			printArray(list);
// return to main method			
			return; 
		}
// close if statement
// for loop to iterate through the rest of the string array based on the size enterd by the user
// initialize the counter i to 0, iterate to the size of the array -1 and increment 1 each time		
		for(i=0; i<userLength-1; i++) {
// print to console and prompt the user to enter another string
			System.out.println("Enter a string: ");
// set the Scanner variable element to the next entered string			
			element = input.next(); 
// set the string array list element i+1 to the element variable entered			
			list[i+1] = element;
// set the int variable minIndex to the for loop counter i
			int minIndex = i;
// inner for loop iterating through the size of the array starting at i+1 and incrementing the counter one each time
			for(int j=i+1; j<userLength; j++) {
// set variable key1 to the first element of string array list
				key1 = list[i]; 
// set the variable key2 to the second element of string array list				
				key2 = list[i+1]; 
// if statement comparing key2 to key1 and setting the minIndex variable to the current j counter				
				if(key2.compareTo(key1)<0) {
// set mindIndex to current j
					minIndex = j;
			}
// close if statement
		} 
// close inner for loop
// swap the elements if key2 is less than key1
// set the variable temp to list i element
			temp = list[i];
// set the list i element to the list i+1 element
			list[i] = list[i+1];
// finally set the list i+1 element to temp
			list[i+1] = temp;
		}
// close outer for loop
// call the printArray method and pass the string array list
		System.out.println("Done");
		printArray(list);
}
// close sortArray method	

	

// print array method named printArray	
	public static void printArray(String[] x){
// for loop to print out array using the length of the string array passed to the method as the upper range limit
// the string array is passed from the sortArray method		
			for(int i=0; i<x.length; i++) {

// if statement checking the count of i in relation to the length of the string array
// if the increment integer i is equals to the length of the string array minus one 
// then print out the value of the string array at index i
// else print out the value of the string array at index i with a comma after the value
				if(i==x.length-1) {
				System.out.print(x[i]);
				}
// close if
// else statement
				else 
// print to console the string array at element i + a comma
					System.out.print(x[i] + ", ");
			}
// close for loop			
		}
// close printArray method	
}	
// close class SortAsInserted

