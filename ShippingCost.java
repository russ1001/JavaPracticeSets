/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Caluclate the shipping cost of a package
 * 
 */


// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class ShippingCost
public class ShippingCost {

// declare the main method	
	public static void main(String[] args) {
	
// declare the Scanner variable input and use the System.in to get the data		
	Scanner input = new Scanner(System.in);
	
// declare the variable weight as a double
// declare costPerPound and shippingCost as doubles and initialize their values to zero	
	double weight;
	double costPerPound = 0; 
	double shippingCost = 0;
	
	
// prompt the user to enter the weight of the package
	System.out.println("Please enter the weight of ther package in pounds from 0 lbs. - 20 lbs., i.e. 3.75: ");
	
// assign the weight variable to the next double entered from the console	
	weight = input.nextDouble();
	
// close Scanner object
	input.close();
	
// the cost of shipping is based on the below table 	
	/* $3.5 if 0<weight<=1
	/  $5.5 if 1<weight<=3
	/  $8.5 if 3<weight<=10
	/  $10.5 if 10<weight<=20
	 * I have placed an Error if 20<weight
	*/
	
	
//  nested if / else statements checking the weight of the package

// weight greater than zero pounds and less than or equal to one pound
	if (weight > 0 && weight <= 1) {

// set the double costPerPound to 3.5		
		costPerPound = 3.5;
		
// calculate shippingCost value
		shippingCost = weight * costPerPound;
		
	}
	else {

// weight greater than one pound and less than or equal to three pounds
		if (weight > 1 && weight <= 3) {
			
// set the double costPerPound to 5.5			
			costPerPound = 5.5;
			
// calculate shippingCost value
			shippingCost = weight * costPerPound;
		}
		
		else {
		
// weight greater than three pounds and less than or equal to ten pounds
			if (weight > 3 && weight <= 10) {
				
// set the double costPerPound to 8.5
				costPerPound = 8.5;
				
// calculate shippingCost value
				shippingCost = weight * costPerPound;
				
			}
			
// weight greater than 10 pounds and less than or equal to twenty pounds			
			else {
				
				if (weight > 10 && weight <= 20) {
					
// set the double costPerPound to 10.5			
					costPerPound = 10.5;
					
// calculate shippingCost value
					shippingCost = weight * costPerPound;
				}
			}
		}
	}
	
// close the first set of if / else statement checks
	
// error check to see if the weight is greater than twenty pounds or if the user entered a negative weight by mistake
	if (weight > 20 || weight < 0) {
		
// print to console an error telling the user that the weight is out of the given range
		System.out.println("Error: The weight that you entered is out of the given range that we are able to ship");
	}
		
		else {
		
// print to console the shipping cost per pound, weight entered and total shipping cost of package using the class Math.round to round the total amount to 2 decimal places			
			System.out.println("The shipping cost per pound for a package that weighs " + weight + " pounds is $" + costPerPound + " and the total shipping cost is $" + Math.round(shippingCost * 100) / 100.0);
			
			
		}
// close last if / else check	
	}
// close main method
}
// close class ShippingCost


