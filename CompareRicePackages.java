/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Compare package prices
 * 
 */

// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class CompareRicePackages
public class CompareRicePackages {

// declare the main method	
	public static void main(String[] args) {

// declare the Scanner variable input and set it to take in data from the console
		Scanner input = new Scanner(System.in);
		
// declare the variables w1, p1, w2, p2, price as doubles
// w1 = weight of 1st package
// p1 = price of 1st package
// w2 = weight of 2nd package
// p2 = price of 2nd package
// cost1 and cost2 are variables to be calculated after both weights and prices are entered
		double w1, p1, w2, p2;
		double cost1, cost2;
						
// prompt the user to enter the weight and price of each package to be compared	
// take in the four values for both packages via the console input	
		System.out.println("Please enter the weight of the 1st package to be price compared: ");
		w1 = input.nextDouble(); 
		
		System.out.println("Please enter the price of the 1st package to be price compared: ");
		p1 = input.nextDouble();
		
		System.out.println("Please enter the weight of the 2nd package to be price compared: ");
		w2 = input.nextDouble();
		
		System.out.println("Please enter the price of the 2nd package to be price compared: ");
		p2 = input.nextDouble();
		
// create space between the entered data and the answer
		System.out.println("---------------------------------------------------------");
		
// close Scanner		
		input.close();
		
// calculate the cost per pound of both packages
		cost1 = p1 / w1;
		cost2 = p2 / w2;
		
// nested if/else statement to check which cost for the packages is less expensive
// cost1 more expensive		
		if(cost1 < cost2) {

// print to console answer			
			System.out.println("Package 1 is less expensive than package 2");
			
		}
// close if
			else {
				
// cost1 less expensive				
				if (cost1 > cost2) {
					
// print to console answer					
					System.out.println("Package 2 is less expensive than package 1");
					
				}
// close if				
					else {
					
// cost1 and cost2 same cost						
						if(cost1 == cost2) {
							
// print to console answer							
							System.out.println("Package 1 is the same cost as package 2");
						}
// close if						
					}
// close else					
				}
// close else	

// print to console the cost per pound of each package using Math.round to round to two decimal places		
			System.out.println("The cost per pound of the 1st package is $" + Math.round(cost1 * 100) / 100.0 + " and the cost per pound of the 2nd package is $" + Math.round(cost2 * 100) / 100.0);
		
		}
// close main method	
}
// close class CompareRicePackages
