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














// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class Driver that will test out the World class
public class Driver {

// declare the main method	
	public static void main(String[] args) {

// declare the Scanner variable input and set it's value to the next input from user via the console	
		Scanner input = new Scanner(System.in);

// prompt the user to enter the width via the console		
		System.out.print("Enter width: ");
		
// declare the integer variable width and set it's value to the next input from the user via the console		
		int width = input.nextInt();
		
// prompt the user to enter the height via the console 
		System.out.print("Enter height: ");
		
// declare the integer variable height and set it's value to the next input from the user via the console
		int height = input.nextInt();

// create the world object using the width and height entered by user
		World world = new World(width, height);

// declare the integer variable score and set it's value to zero 
// this will be used to calculate the score
		int score = 0;

// while loop to display the playing board while true 
// and prompting the user to enter an action i.e. left, right, up, down
		loop: while(true){

// call the class displayWorld			
			world.displayWorld();

// print to console the message and prompt user to enter info			
			System.out.println("\nEnter an Action (left/ right/ up/ down/ exit):");
			
// set the String variable action to the next entered data from the console by user			
			String action = input.next();

// switch statement checking to see what the user typed into the console 
// then whatever is typed that class function is called out
// i.e. checking for left, right, up, down
// any data entered other that left,right,up,down,exit results in a error message
			switch(action){
			case "left":
				world.moveLeft();
				break;
			case "right":
				world.moveRight();
				break;
			case "up":
				world.moveUp();
				break;
			case "down":
				world.moveDown();
				break;
			case "exit":
				break loop;
			default:
				System.out.println("Not a valid Action");
				continue;

			}
// close switch statement			

// if/else statement checking to see if the player got "crushed" by a "rock"
// if true print to console the message that they were crushed by a rock
// and then print out their score
			if(world.fallingRock()){ // rue player got crushed.
				System.out.println("Character was crushed by a rock.");
				System.out.println("Score: "+score);
				break loop;
			}
// close if			
			else{
// if the player is not "crushed" then increment the score by one
				score += 1;
			}
// close else			
		}
// close while loop		
	}
// close main method	
}
// close class Driver
