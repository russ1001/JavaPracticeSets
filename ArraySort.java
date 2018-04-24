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

// declare the class ArraySort
public class ArraySort {

	// declare the main method
	public static void main(String[] args) {

		// declare the Scanner variable input and set it to the System.in console for
		// user input
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the size of the array via the console
		System.out.print("Enter the size of the array: ");

		// declare the integer variable userSize and set it's value to the user input
		int userSize = input.nextInt();

		// if statement checking to see if the array length is valid and not negative
		// if it is negative print to console error message and exit program
		if (userSize < 1) {

			// print to console error message
			System.out.println("Error: You entered a non-positive number");
			// exit program
			System.exit(1);
		}
		// close if statement

		// declare the string array list and set it's size to the user input integer
		// variable userSize
		String[] list = new String[userSize];

		// declare the integer variable count and set it's value to zero to be used as a
		// counter
		int count = 0;

		// declare a string array sortedArray and initialize it as empty
		String[] sortArray = {};

		// print one line for spacing
		System.out.println();

		// for loop to take in from user the strings via the console
		// declare integer variable i and set it's value to zero to use for iteration
		// through the loop
		// use the userSize of the string array as the upper limit for the iteration
		// increment i by one each loop
		for (int i = 0; i < userSize; i++) {

			// increment counter by one
			count++;

			// prompt the user to enter a string to be inserted
			System.out.print("Enter string # " + (i + 1) + ": ");

			// set the string array's value at element i to the entered string
			list[i] = input.next();

			// use the sortedArray string array that passes each loop the current string
			// element entered by user
			// and the current counter to the sortElements method
			sortArray = sortEachElement(list, count);

			// print a line for spacing
			System.out.println();

		}
		// close for loop

		// print line for spacing
		System.out.println("\n");

		// call the printArray method and pass the sortedArray
		printArray(sortArray);
	}
	// close main method

	// declare the sortEachElement method and take in from the main method the
	// entered string and counter
	public static String[] sortEachElement(String[] userList, int size) {

		// declare the string variable temp to be used in swapping the string elements
		String temp;

		// outer for loop that will iterate through the length of the string array
		for (int i = 0; i < size; i++) {

			// inner for loop
			for (int j = i + 1; j < size; j++) {

				// if statement comparing the string element in position i to string element in
				// position j (i+1)
				// if it userList[i] is less than userList[j] then swap elements
				if (userList[i].compareTo(userList[j]) > 0) {

					// swap elements
					// set temp variable to the string element in userList[i]
					temp = userList[i];

					// set userList[i] to userList[j]
					userList[i] = userList[j];

					// set userList[j] to temp
					userList[j] = temp;
				}
				// close if statement
			}
			// close inner for loop
		}
		// close outer for loop

		return userList;
		// return sorted string array
	}
	// close sortEachElement method

	// declare the print method named printArray
	public static void printArray(String[] sortedArray) {

		// for loop that will iterate through the string array and print each element
		// integer variable i set to zero and iterating through the length of the string
		// array incrementing by one
		for (int i = 0; i < sortedArray.length; i++) {

			// if statment checking for the last element to be printed to console
			// with no comma
			if(i==sortedArray.length-1) {
				// print to console the last element in the string array
				System.out.println(sortedArray[i]);
			}
			// close if
			else {
			// print to console each element of the string array
			System.out.print(sortedArray[i] + ",");
		
			}
			// close else
		}
		// close for loop
	}
	// close printArray method
}
// close ArraySort method