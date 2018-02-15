/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Computer triangle perimeter
 * 
 */

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class ComputeTrianglePerimeter
public class ComputeTrianglePerimeter {

// declare the main method	
	public static void main(String[] args) {
		
// declare the input Scanner variable using System.in to take in the value
		Scanner input = new Scanner(System.in);
		
// declare the variables edge1, edge2, edge3 and perimeter as doubles and initialize their values to zero
		double edge1 = 0;
		double edge2 = 0;
		double edge3 = 0;
		double perimeter = 0;
		
// ask the user to enter the three lengths of the triangle via the console
		System.out.println("Please enter the three lengths of the triangle to be calculated. ");
		System.out.println("Note - The sum of every pair of two edges must be greater than the remaining edge:");
		
// take in the three lengths of the triangle from the console		
		edge1 = input.nextDouble();
		edge2 = input.nextDouble();
		edge3 = input.nextDouble();
		
// close Scanner
		input.close();		

// calculate the perimeter as the sum of the three edges of the triangle entered by the user 		
		perimeter = edge1 + edge2 + edge3;

// nested if / else statement to check if all the values of the entered data are valid
		
// check edge1 + edge 2 against edge3 and if true print to console an error message, if not go to the next if statement check		
		if ((edge1 + edge2) <= edge3) {
			
			System.out.println("Error 1: The values for the three sides of the triangle that you entered are invalid!");
		}
		
		else {
			
// check edge2 + edge3 against edge1 and if true print to console an error message, if not go to the next if statement check		
			if((edge2 + edge3) <= edge1) {
				
				System.out.println("Error2: The values for the three sides of the triangle that you entered are invalid!");
			}
			
			else {
				
// check edge1 + edge3 against edge2 and if true print to console an error message, if not go to the next if statement check  				
				if((edge1 + edge3) <= edge2) {
										
					System.out.println("Error3: The values for the three sides of the triangle that you entered are invalid!");
				}
				
// all sides of the triangle inputted by the user are valid lengths specified
// print to console the lengths of each edge inputted and the perimeter				
				else {
					
					System.out.println("The data you entered is valid...");
					System.out.println("A triangle with sides that have lengths of " + edge1 + ", " + edge2 + " and " + edge3 + " has a perimeter of " + perimeter );
				}
// close if/else				
			}
// close if/else			
		}	
// close if/else		
	}
// close the main method
}
// close the class ComputeTrianglePerimeter
				
			
			
			
		
		

		
	


