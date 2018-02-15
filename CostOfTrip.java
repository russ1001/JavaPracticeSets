/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #2 - 
 * 					
 * 
 *  5. Read in distance to drive in miles, fuel efficiency of the vehicle in miles per gallon, price per gallon of fuel and output the fuel cost to console
 * 					
 */

// import Scanner utility
import java.util.Scanner;

// declare class CostOfTrip
public class CostOfTrip {

	// declare main method
	public static void main(String[] args) {
		
		// declare variables as doubles
		double distance, fuelEfficiency, gallonPrice;
		
		// declare Scanner variable input
		Scanner input = new Scanner(System.in);
		
		// ask user for trip distance in miles
		System.out.print("Enter the trip distance in miles: ");
		
		// read in distance
		distance = input.nextDouble();
		
		// ask user for fuel efficiency of the vehicle
		System.out.print("Enter the fuel efficiency of the vehicle in miles per gallon: ");
		
		// read in fuel efficiency
		fuelEfficiency = input.nextDouble();
		
		// ask user for price per gallon of fuel
		System.out.print("Enter the price per gallon of fuel: ");
		
		// read in fuel cost 
		gallonPrice = input.nextDouble();
		
		// declare the co250 costOftrip variable and calculate 
		double costOftrip = ((distance / fuelEfficiency) * gallonPrice);
		
		System.out.println("---------------------");
	
		// output to console the cost of fuel for the trip		
		System.out.println("The distance of the trip is " + distance + " miles, the fuel efficiency of the vehicle is " + fuelEfficiency + " mpg, the price per gallon is $" + gallonPrice);
		
		// use the Math.round function to round the cost of the trip value to two decimal places
		System.out.println("So the total fuel cost for the entire trip is $" + Math.round(costOftrip * 100) / 100.0);
		
			
	}
	// end main method

}
// end CostOfTrip class
