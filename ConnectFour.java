/*	Russell Streff
 * CSCI 225
 * 
 * Problem Set #8
 * 
 * 	Connect Four problem
 * 
 * 
 * Lab and Project for Chapter 8 

     Connect Four is a two-player board game in which the players alternately drop colored disks 
     into a seven-column, six-row vertically suspended grid. The objective of the game is to connect
     four same-colored disks in a row, a column, or a diagonal before your opponent can do likewise.   
     The program prompts two players to drop a red or yellow disk alternately.  
     Whenever a disk is dropped, the program redisplays the board on the console and determines 
     the status of the game (win, lose, or continue).
 */ 


// import the entire java utility using the * wildard callout
import java.util.*;

// declare the class ConnectFour
public class ConnectFour {

	// declare the main method	
	public static void main (String[] args) {

		// call the createPattern method and pass the two-dimensional String array f to it		
		String[][] f = createPattern();

		// declare the boolean variable loop and set it's value to true
		// this will keep the while loop going until a winner has been found 
		boolean loop = true;

		// declare the integer variable count and set it's value to zero
		// this is used as a counter to determine which color disc's turn it is red or yellow
		int count = 0;

		// call the printPattern method and actually print the patter of the two-dimensional String array
		// the size of the array is set in the method itself    
		printPattern(f);

		// while loop that will run as long as the boolean variable loop is true
		// when a winner is found the loop variable is changed to false thus ending the while loop and
		// ending the entire program    
		while(loop){

			// if statement that checks the turn using the counter variable count
			// check to see if the modulus of count is even or odd
			// if it is even it is red's turn, if odd it is yellow's turn to drop a disc
			if (count % 2 == 0) dropRedPattern(f);
			else dropYellowPattern(f);

			// increment counter by one so that the next turn will switch to the other player       
			count++;

			// re-print the String array this time with the R or Y in corresponding spot chosen by the user
			// this is done by once again calling the printPattern method and passing the current String array
			printPattern(f);

			// call out the checkWinner method to see if there is a match of four consecutive discs 
			// either red or yellow
			// this will not mean anything for at least the minimum of seven moves
			if (checkWinner(f) != null){

				// if the returned value from the checkWinner method returns a R then red is the winner
				if (checkWinner(f) == "R")

					// print to console that the red player is the winner        	  
					System.out.println("The red player won!");

				// if the returned value from the checkWinner method returns a Y then yellow is the winner
				else if (checkWinner(f)== "Y")

					// print to console that the yellow player is the winner 
					System.out.println("The yello player won!");

				// if there was a winner then change the value of the boolean variable loop to false and end program
				loop = false;
			}
			// close if        
		}
		// close while    
	}
	// close main method






	// declare the two-dimensional String array createPattern method
	public static String[][] createPattern(){

		// set the size of the String array to 7 x 15 to accommodate the vertical lines and spaces in between
		// that the values R or Y will be placed
		String[][] f = new String[7][15];

		// for loop that iterates from up to down iterating through the length of the array
		for (int i =0;i<f.length;i++){

			// for loop to iterate over each column from left to right iterating through the length 
			// of the index of the String array at index f[i].length
			for (int j =0;j<f[i].length;j++){

				// if statement checking to make sure that every other column has the vertical line using modulus,
				// this will allow the values entered by the user to be placed in between the lines
				if (j% 2 == 0) f[i][j] ="|";
				// even columns have the vertical line and the odd columns a space
				else f[i][j] = " ";

				// when the iteration gets to 6 print out the bottom baseline of the grid
				if (i==6) f[i][j]= "-";
			}
			// close inner for loop

		}
		// close outer for loop
		return f;
		// return the printed grid to the main method
	}
	// close the createPattern method







	// declare the printPattern method using the two-dimensional String array passed by the main method
	// at this point (the first time it is called there is no date in the array so it is blank
	public static void printPattern(String[][] f){

		// outer for loop that will iterate through the length of the String array 	  
		for (int i =0;i<f.length;i++){

			// inner for loop iterating through the length of the String array at index f[i].length 
			for (int j=0;j<f[i].length;j++){

				// print to console the String array f[i][j]
				System.out.print(f[i][j]);
			}
			// close inner for loop      
			System.out.println();
			// print blank line
		}
		// close outer for loop
	}
	// close printPattern method






	// declare the dropRedPattern method using the two-dimensional String array passed by the main method
	public static void dropRedPattern(String[][] f){


		// prompt the user to enter a column where he/she wants to drop their disc
		System.out.println("Drop a red disk at column (0–6): ");

		// declare Scanner variable scan and set it to the data entered by the user via the console
		Scanner scan = new Scanner (System.in);

		// declare integer variable c and set it's value to the next integer entered by the user
		// multiply the entered value by 2 and add 1 to make sure the actual entered value corresponds
		// to the correct column
		int c = 2*scan.nextInt()+1;

		// we have the correct column so now we have to loop over each row from the 
		// bottom (index 5) to the top (index 0)
		// when we find the first  empty space place the corresponding color "disc" R 
		// then break out of the loop since the value has been placed
		// the iteration counter i is decremented by one instead of incremented by one
		for (int i =5;i>=0;i--){

			// if statement checking for a blank and if blank then insert the character R
			if (f[i][c] == " "){

				// insert R at index f[i][c]    	  
				f[i][c] = "R";

				// break out of the for loop
				break;
			}
			// close if statement      
		}
		// close for loop    
	}
	// close dropRedPattern method






	// declare the dropYellowPattern method (this is the same as the dropRedPattern method) only inserting Y 
	public static void dropYellowPattern(String[][] f){

		// prompt the user to enter a column where he/she wants to drop their disc	  
		System.out.println("Drop a yellow disk at column (0–6): ");

		// declare Scanner variable scan and set it to the data entered by the user via the console   
		Scanner scan = new Scanner (System.in);

		// declare integer variable c and set it's value to the next integer entered by the user
		// multiply the entered value by 2 and add 1 to make sure the actual entered value corresponds
		// to the correct column   
		int c = 2*scan.nextInt()+1;

		// we have the correct column so now we have to loop over each row from the 
		// bottom (index 5) to the top (index 0)
		// when we find the first  empty space place the corresponding color "disc" Y 
		// then break out of the loop since the value has been placed
		// the iteration counter i is decremented by one instead of incremented by one   
		for (int i =5;i>=0;i--){ 

			// if statement checking for a blank and if blank then insert the character Y
			if (f[i][c] == " "){

				// insert Y at index f[i][c]    	  
				f[i][c] = "Y";

				// break out of the for loop 
				break;

			}
			// close if statement     
		}
		// close for loop
	}
	// close dropYellowPattern method








	// declare the checkWinner method using the two-dimensional String array passed by the main method
	public static String checkWinner(String[][] f){

		// first check is for a horizontal solution of four consecutive "discs" (R or Y) 
		// outer for loop iterating through the length of the each row which is 6 (0-5) 
		for (int i =0;i<6;i++){

			// inner for loop loops through the values that the user entered and can only be in the odd columns 
			// so iterate through f[i][j+1],3,5,7 etc...by iterating by the increment of 2
			for (int j=0;j<7;j+=2){

				// if statement checking the odd spaces for 4 consecutive colors
				if ((f[i][j+1] != " ")
						&& (f[i][j+3] != " ")
						&& (f[i][j+5] != " ")
						&& (f[i][j+7] != " ")
						&& ((f[i][j+1] == f[i][j+3])
								&& (f[i][j+3] == f[i][j+5])
								&& (f[i][j+5] == f[i][j+7])))

					// if a 4 consecutive colored "discs" (R or Y) is found then return the found corresponding color
					return f[i][j+1];  
			}
			// close inner for loop
		}
		// close outer for loop

		// similar to checking for the horizontal lines above this for loop will check
		// for vertical consecutive "discs" (R or Y)
		// outer for loop     
		for (int i=1;i<15;i+=2){

			// inner for loop 
			for (int j =0;j<3;j++){


				if((f[j][i] != " ")
						&& (f[j+1][i] != " ")
						&& (f[j+2][i] != " ")
						&& (f[j+3][i] != " ")
						&& ((f[j][i] == f[j+1][i])
								&& (f[j+1][i] == f[j+2][i])
								&& (f[j+2][i] == f[j+3][i])))

					// return to main method if 4 consecutive "discs" are found with the correct color
					return f[j][i];  
			}
			// close inner for loop
		}
		// close outer for loop    







		// checking for a diagonal solution for 4 consecutive "discs" (R or Y)
		// starting from top left and iterating through bottom right
		// the code given from BlackBoard called this the "major" diagonal
		// outer for loop 
		for (int i=0;i<3;i++){

			// inner for loop
			// the uppermost box will start from 1 and increase by 2 until it becomes 7 (the 3rd box on a row)
			for (int j=1;j<9;j+=2){

				// if statement checking the "major" diagonal 
				if((f[i][j] != " ")
						&& (f[i+1][j+2] != " ")
						&& (f[i+2][j+4] != " ")
						&& (f[i+3][j+6] != " ")
						&& ((f[i][j] == f[i+1][j+2])
								&& (f[i+1][j+2] == f[i+2][j+4])
								&& (f[i+2][j+4] == f[i+3][j+6])))

					// return to main method if 4 consecutive "discs" are found with the correct color         	
					return f[i][j];  
			}
			// close inner for loop
		}
		// close outer for loop




		// similar to the method above except that the order if reversed
		// so that it starts from the rightmost column instead of the leftmost in the "major" diagonal
		// outer for loop
		for (int i=0;i<3;i++){

			// inner for loop
			for (int j=7;j<15;j+=2){

				// if statement checking the "minor" diagonals
				if((f[i][j] != " ")
						&& (f[i+1][j-2] != " ")
						&& (f[i+2][j-4] != " ")
						&& (f[i+3][j-6] != " ")
						&& ((f[i][j] == f[i+1][j-2])
								&& (f[i+1][j-2] == f[i+2][j-4])
								&& (f[i+2][j-4] == f[i+3][j-6])))
					return f[i][j];  
			}
			// close inner for loop
		}
		// close outer for loop


		// return null if no winning color was found in horizontal, vertical, major diagonal or minor diagonal
		return null;
	}
	// close checkWinner method



}
// close ConnectFour class