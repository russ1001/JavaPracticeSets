/*
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
 * 
 * 
 * Name: Russell M. Streff Jr.       UID:  362362363       Date:  8/30/18
 * 
 * 
 * 
 * CSCI 275
 * 
 * Task 2 Assignment
 * 
 * Write a test program that prompts the user to enter the number of rows and columns 
 * of a two-dimensional array and then the values in the array and displays true if 
 * the array contains four consecutive numbers with the same value. Otherwise, 
 * display false.
 */






// import entire java utility using the * wildcard callout
import java.util.*;

// declare the class streffTask2 as public
public class streffTask2 {

	// declare the main method
	public static void main(String[] args) {

		// declare the Scanner variable input and set it's input value to the System.in entry from keyboard
		Scanner input = new Scanner(System.in);

		// prompt user to enter the size of the array to hold the numbers
		// of the two dimensional array i.e. enter the number of rows and columns
		System.out.println("Please enter the number of rows: ");
		int rows = input.nextInt();
		System.out.println("Please enter the number of columns: ");
		int columns = input.nextInt();

		// checking to make sure that the user entered at least row size 4 or column size 4
		// if neither of the values entered are at least than 4 exit the program with error message displayed
		if(rows < 4 && columns < 4) {

			System.out.println("ERROR: You entered a row and column size that was less than 4");
			System.exit(0);
		}
		// close if statement


		// declare the two dimensional array using the values entered by user via console
		int[][] game = new int[rows][columns];

		// prompt user to enter the numerical values into the array
		System.out.println("Please enter the values into the array: ");

		// nested for loop to insert numerical values into array
		for(int i = 0; i < game.length; i++) {

			for(int j = 0; j < game[i].length; j++) {

				game[i][j] = input.nextInt();

			}
			// close inner for loop			
		}
		// close outer for loop

		// call the isConsecutiveFour method from main passing the two-dimensional array game to the method
		isConsecutiveFour(game);

		// close Scanner
		input.close();



	}
	// close main method


	// initialize and declare the method isConsecutiveFour that will test whether
	// there are 4 consecutive numbers entered into the array by the user 
	public static boolean isConsecutiveFour(int[][] values) {


		// first check rows from left to right, top to bottom
		// using nested for loop

		for(int i=0; i<values.length; i++) {

			int currentValue = values[i][0];
			int consecutiveCount = 0;

			for(int j=0; j<values[i].length; j++) {

				if(values[i][j] == currentValue) {

					consecutiveCount++;
					if(consecutiveCount == 4) return true;
				}
				else {

					currentValue = values[i][j];
					consecutiveCount = 1;
				}

			}
			// close inner for loop
		} 
		// close outer for loop


		// next check columns left to right, top to bottom
		// once again using nested for loop

		for(int j=0; j<values[0].length; j++) {

			int currentValue = values[0][j];
			int consecutiveCount = 0;

			for(int i=0; i<values.length; i++) {

				if(values[i][j] == currentValue) {

					consecutiveCount++;
					if(consecutiveCount == 4) return true;
				}
				else {

					currentValue = values[i][j];
					consecutiveCount = 1;

				}

			}

		}


		// next check diagonals from left to right going downwards
		//===================================================================	
		// From upper left to lower right
		// iterate through the lower half of array

		for (int i = 0; i < values.length; i++) {
			int currentValue = values[i][0];
			int consecutiveCount = 1;
			for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				} else {
					currentValue = values[j][k];
					consecutiveCount = 1;
				}
				if (consecutiveCount == 4) {
					return true;
				}
			}
		}

		// From upper left to lower right
		// iterate through upper half of array

		for (int i = 0; i < values[0].length; i++) {
			int currentValue = values[0][i];
			int consecutiveCount = 1;
			for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
				if (currentValue == values[k][j]) {
					consecutiveCount++;
				} else {
					currentValue = values[k][j];
					consecutiveCount = 1;
				}

				if (consecutiveCount == 4) {
					return true;
				}
			}
		}

		// From upper right to lower left
		// iterate through upper half of array

		for (int i = 0; i < values[0].length; i++) {
			int currentValue = values[0][i];
			int consecutiveCount = 1;
			for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				} else {
					currentValue = values[j][k];
					consecutiveCount = 1;
				}
				if (consecutiveCount == 4) {
					return true;
				}
			}
		}

		// From upper right to lower left
		// iterate through lower half of array

		for (int i = 0; i < values.length; i++) {
			int currentValue = values[i][values[i].length-1];
			int consecutiveCount = 1;
			for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				} else {
					currentValue = values[j][k];
					consecutiveCount = 1;
				}
				if (consecutiveCount == 4) {
					return true;
				}
			}
		}

		return false;	

	}
	// close isConsecutiveFour method


}
// close streffTask2 method

