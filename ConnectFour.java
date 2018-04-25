/*	Russell Streff
 * 	CSCI 225 
 * 	Problem Set #8
 * 
 * Lab and  Project for Chapter 8


Connect  Four is a two-player board  game  in which the  players alternately drop colored disks into a seven-column,
six-row vertically suspended grid, as shown  below.
The objective of the  game  is to connect four same-colored disks in a row, a column, or a diagonal before  your opponent can do likewise.
The program prompts two players to drop a red or yellow disk alternately.  
Whenever a disk is dropped, the  program redisplays the  board on the console and determines the  status of the game  (win, lose, or continue).   Here is a sample run:



|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
------------------
Drop a red  disk  at  column (0-6): 0       Enter



|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|R	|	|	|	|	|	|	|
 
------------------


Drop a yellow disk  at  column (0-6): 3       Enter



|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|	|	|	|	|	|	|	|
|R	|	|	|Y	|	|	|	|
------------------


. . .
. . .
. . .


Drop a yellow disk  at  column (0-6): 6       Enter
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |R | | | |
| | | |Y |R |Y | |
| | |R |Y |Y |Y |Y |
|R |Y |R |Y |R |R |R |
------------------
The   yellow player wins.

 * 
 */



// import entire java utility using the * wildcard callout
import java.util.*;

// declare the class ConnectFour
public class ConnectFour {

// declare the main method	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		char [][] table = new char[7][15];
		
		boolean whosTurn = true;
		int counter = 0;
		
		makePattern(table);
		
			
		while(whosTurn) {

			if(counter%2==0) insertRedDisc(table);
			else insertYellowDisc(table);
			counter++;
			printPattern(table); 
			
			if(checkWin(table) != true && checkWin(table) != false) {
				
				if(checkWin(table)=='R')
					System.out.println("Red player won!");
				else if(checkWin(b)=='Y')
					System.out.println("Yellow player won!");
				whosTurn = false;
				
			}


		}

		
		
	}
// close main method
	
	

	
	public static char[][] makePattern(char[][] t){
		
		
		for(int i=0; i<t.length; i++) {
			
			for(int j=0; j<t[i].length; j++) { 
				
				if(j%2==0) t[i][j]='|';
				else t[i][j] = ' ';
				
				if(i==6) t[i][j] = '-';
				}
		
		}
		
		return t; 
		
	}

	
	
	public static void printPattern(char[][] table) {

		System.out.println();
		
		for(int i=0; i<table.length; i++) {

			for(int j=0; j<table[i].length; j++) {

				System.out.print(table[i][j]);
			}
			System.out.println();
			
		}

	}
	
	
	public static void insertRedDisc(char[][] table) {
		
		System.out.println("Please enter which column to drop your disc 0-6: ");
		Scanner input = new Scanner(System.in);
		
		int redDisc = 0;
		redDisc = 2*input.nextInt()+1;
		for(int i=5; i>=0; i--) {
			
			if(table[i][redDisc]==' ') {
				
				table[i][redDisc] = 'R';
				break;
			}
		}

	}
	
	
	public static void insertYellowDisc(char[][] table) {

		System.out.println("Please enter which column to drop your disc 0-6: ");
		Scanner input = new Scanner(System.in);

		int yellowDisc = 0;
		yellowDisc = 2*input.nextInt()+1;
		for(int i=5; i>=0; i--) {

			if(table[i][yellowDisc]==' ') {

				table[i][yellowDisc] = 'R';
				break;
			}
		}

	}
	
	// Method copied and pasted from homework by professor
	// Method to check for a winner. Receives 2-D array as parameter. Returns boolean value.
    public static boolean checkWin(char[][] b)
    {
        // Create four boolean variables, one for each set of rows. Initialize all of them to false.
        boolean foundRow = false;
        boolean foundCol = false;
        boolean foundMjrD = false;
        boolean foundMinD = false;
        
        // Check to see if four consecutive cells in a row match.
        // check rows
        for (int r = 0; r <= 5; r++)
        {
            for (int c = 0; c <= 3; c++)
            {
                if (b[r][c] == b[r][c + 1] && b[r][c] == b[r][c + 2] && b[r][c] == b[r][c + 3] && b[r][c] != ' ')
                {
                    foundRow = true;
                    break;
                }
            }
        }
        
        // Check to see if four columns in the same row match
        // check columns
        for (int r = 0 ; r <= 2; r++)
        {
            for (int c = 0; c <= 6; c++)
            {
                if (b[r][c] == b[r + 1][c] && b[r][c] == b[r + 2][c] && b[r][c] == b[r + 3][c] && b[r][c] != ' ')
                {
                    foundCol = true;
                    break;
                }
            }
        }
        
        // Check to see if four diagonals match (top left to bottom right)
        // check major diagonal
        for (int r = 0; r <= 2; r++)
        {
            for (int c = 0; c <= 3; c++)
            {
                if (b[r][c] == b[r + 1][c + 1] && b[r][c] == b[r + 2][c + 2] && b[r][c] == b[r + 3][c + 3] && b[r][c] != ' ')
                {
                    foundMjrD = true;
                    break;
                }
            }
        }
        
        // Check to see if four diagonals in the other direction match (top right to bottom left)
        // check minor diagonal
        for (int r = 0; r <= 2; r++)
        {
            for (int c = 3; c <= 6; c++)
            {
                if (b[r][c] == b[r + 1][c - 1] && b[r][c] == b[r + 2][c - 2] && b[r][c] == b[r + 3][c - 3] && b[r][c] != ' ')
                {
                    foundMinD = true;
                    break;
                }
            }
        }
        
        // If ONE of the booleans is true, we have a winner.
        // checks boolean for a true
        if (foundRow || foundCol || foundMjrD || foundMinD)
            return true;
        else
            return false;
    } // end checkWin method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
// close ConnectFour class

















