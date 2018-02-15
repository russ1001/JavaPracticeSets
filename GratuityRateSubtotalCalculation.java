/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #2 - 
 * 					
 * 
 *  2. Read in the sub-total and gratuity rate for a meal and output to the console the gratuity and total bill for the meal.
 * 					
 */

// import Scanner utility
import java.util.Scanner;

// declare the class GratuityRateSubtotalCalculation
public class GratuityRateSubtotalCalculation {

	// declare the method main
	public static void main(String[] args) {

		// declare the variables as doubles
		double mealSubtotal, gratuityRate;
		
		// declare the Scanner variable input
		Scanner input = new Scanner(System.in);
		
		// ask the user for the sub-total of the meal 
		System.out.print("Enter the subtotal of your meal in dollars and cents: ");
		
		// read in the sub-total
		mealSubtotal = input.nextDouble();
		
		// ask the user for the gratuity rate
		System.out.print("Enter the gratuity rate that you want the server to receive, i.e. 20.5 for 20.5%: ");
		
		// read in the gratuity rate
		gratuityRate = input.nextDouble();
		
		// declare variables as doubles
		double gratuityTotal, mealTotal;
		
		// calculate gratuity 
		gratuityTotal = mealSubtotal * (gratuityRate / 100);
		
		// calculate meal total
		mealTotal = mealSubtotal + gratuityTotal;
		
		System.out.println("-------------------------------------------------------------");
		
		// output to console the meal sub-total, gratuity rate, gratuity and total price for the meal
		System.out.println("The subtotal of your meal is $" + mealSubtotal + ", the gratuity rate that you want your server to receive is " + gratuityRate + "%");
		System.out.println("which is $" + Math.round(gratuityTotal * 100) / 100.0 + "...so your total bill is $" + Math.round(mealTotal * 100) / 100.0);
		
			
	}
	
	// end class GratuityRateSubtotalCalculation

}

// end main method

