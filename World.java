/* Russell Streff
 * CSCI 225
 * 
 * Problem Set #9
 * 
 * The World Class
 * 
 * Problem Statement 
 * 
Write a class called World and a class called Driver.  The Driver class is going to contain our main method.
THE WORLD CLASS
The World class will contain three private data fields.  The first private data field is a 2 dimensional char array that represents the world.  The size of the world will depend on what’s passed to the constructor.  The next private data field is a characterRow and the last private data field is characterColumn.
The constructor will accept two values, width and height.  Using width and height, set the size of the 2 dimensional array.  Then fill the array with a dash, -.  The characterRow and characterColumn data fields are both set to 0 and then place the character, ‘P’, at position characterRow and characterColumn.
So if your world were to be printed with width 9, or 9 columns, and height 4, or 4 rows, it would like something like this after creation:
P--------
---------
---------
---------
	The world class will initially contain 5 public methods.  These methods are moveUp, moveDown, moveLeft, moveRight and displayWorld.
moveUp and moveDown
The methods moveUp and moveDown will change the character’s location.  If the user is about to move out of bounds then do nothing.
Here is what happens when moveUp is called:
	Before moveUp is called		After moveUp is called
		---					-P-
		-P-					---
		---					---
Here is what happens when moveDown is called:
	Before moveDown is called		After moveDown is called
		---					---
		-P-					---
		---					-P-	 
moveLeft and moveRight
The methods moveLeft and moveRight will change the character’s location.  If the user is about to move out of bounds then do nothing.
Here is what happens when moveLeft is called:
	Before moveLeft is called		After moveLeft is called
		---					---
		-P-					P--
		---					---
Here is what happens when moveRight is called:
	Before moveRight is called		After moveRight is called
		---					---
		-P-					--P
		---					---	
displayWorld
This method simply prints the 2 dimensional array to the console.
Example using a 2 dimensional array with 4 rows and 3 columns (height of 4 and width of 3):
P--
---
---
---
THE DRIVER CLASS
The driver class will contain our main method and will do the following.
First, get a width and height from the user.  Then, create a world object passing in the width and height.  Then, start an infinite loop that begins by calling the world’s displayWorld method.  After, you will ask the user for an action.  The actions are “left”, “right”, “up”, “down”, and “exit”.  If the user types “exit” then break out of the loop.  If the user types the other 4 actions then call the world’s respective method.  For instance, if “left” is typed call the world object’s moveLeft method.  If the user types and action not part of the 5 available actions then display not a valid action.
Finally, add something extra to this project.  Be creative.
Just whatever you do don’t try to go over the top.  You only need to add one additional feature on top of what’s been give.  On the next page is an example run with the addition of falling rocks and a score when you don’t get hit.  The rocks are represented by ‘#’.
World width: 3
World height: 3
P--
---
---
ACTION > down
#--
P--
---
ACTION > right
#--
-P-
-#-
ACTION > up
#P-
-#-
-#-
ACTION > right
#-P
-#-
-##
ACTION > down
#--
-#P
-##
Character was crushed by a rock
Score: 4
*/


 

// declare the class World
public class World {

// declare the two dimensional char array world
// declare the integer variables characterRow and characterColumn
	private char[][] world;
	private int characterRow, characterColumn;

// define constructor World with parameters to be passed of integer variables width and height
	public World(int width, int height) {
		
// set the world char array size to the the width and height entered by user 		
		world = new char[width][height];

// nested for loop drawing the board
// outer for loop that starts at zero and increments to the length of the world array iterating by one
		for(int i=0; i<world.length; i++){
			
// inner for loop starts at zero and increments to the length of the element at position zero in the array
// iterating by one and placing in each iterated position a dash mark
			for(int j=0; j<world[0].length; j++){
				world[i][j] = '-';
			}
// close inner for loop			
		}
// close outer for loop		

// set the integer variable characterRow and characterColumn values to zero		
		characterRow = 0;
		characterColumn = 0;
	}
// close World constructor	

// define the class function moveUp
	public void moveUp(){

// if statement checking to see if the player is allowed to go top 
// i.e not already at the top row or the above position has no rock then the player can go up
		if(characterRow>0 && world[characterRow-1][characterColumn] !='#'){
			characterRow -= 1;
		}
// close if 		
	}
// close class moveUp
	
	
// define the class function moveDown	
	public void moveDown(){

// if statement checking to see if the player is allowed to go the bottom row 
// i.e not already at the bottom row or the below position has no rock then the player can go down
		if(characterRow<world.length-1 && world[characterRow+1][characterColumn] !='#'){
			characterRow += 1;
		}   
// close if
	}
// close class moveDown
	
	
// define class function moveLeft
	public void moveLeft(){

// if statement checking to see if the player is allowed to go left 
// i.e not already at the far left row or the left position has no rock then the player can go left
		if(characterColumn>0 && world[characterRow][characterColumn-1] !='#'){
			characterColumn -= 1;
		} 
// close if
	}
// close class moveLeft
	
	
// define class moveRight
	public void moveRight(){

// if statement checking to see if the player is allowed to go right
// i.e not already at the far right row or the right position has no rock then the player can go right
		if(characterColumn<world[0].length-1 && world[characterRow][characterColumn+1] !='#'){
			characterColumn += 1;
		} 
// close if
	}
// close class moveRight
	
	

// define class displayWorld function to print out board game
	public void displayWorld(){

// nested for loop to loop over the two dimensional char array 
// outer for loop starting at zero, incrementing to the length of the world array and iterating by one
		for(int i=0; i<world.length; i++){
			
// inner for loop starting at zero, incrementing to the length of the world array at character position zero
// iterating by one
			for(int j=0; j<world[0].length; j++){

// if/else statement checking the current position of the character matches the indexes i and j print "P"
// in the corresponding location in the array, otherwise print the current characters
				if(i==characterRow && j==characterColumn){
					System.out.print("P");
				}
// close if				
				else{
					System.out.print(world[i][j]);
				}
// close else				
			}
// close inner for loop			
			System.out.println("");
// print line for spacing			
		}
// close outer for loop		
	}
// close displayWorld class
	
	

// define class fallingRock function that creates a rock (i.e. the hash symbol)
// if the player gets "crushed" by the hash symbol return true, otherwise return false
	public boolean fallingRock(){

// declare the the integer variables row and col and set their values to random numbers
// using the length of the world char array as a multiplier
// randomly calculate on which row and column the "rock" drops using the Math.random class
// cast the values to an integer
		int row = (int)(Math.random()*world.length);
		int col = (int)(Math.random()*world[0].length);

// if/else statement checking to see if the "rock" falls at the current player's position
// the player is "crushed" then return true
		if(row == characterRow && col == characterColumn){
			return true;
		}
// close if
		else{

// if/else statement checking to see if the position in the world char array at indexes [row][col]
// does not have rock then place #
// otherwise call the class fallingRock() function to get a new location
			if(world[row][col] == '-'){
				world[row][col] = '#';
				return false;
			}
// close if
			else{
				return fallingRock();
			}
// close inner else			
		}
// close outer else		
	}
// close class fallingRock	
}
// close class World
