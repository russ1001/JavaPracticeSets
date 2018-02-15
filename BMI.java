/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #2 - 
 * 					
 * 
 *  4. Read in height in inches and weight in pounds, calculate BMI (Body Mass Index) and output to console
 * 					
 */



// import Scanner utility
import java.util.Scanner;

// declare class BMI
public class BMI {

	// declare main method
	public static void main(String[] args) {
		
		// declare the Scanner variable input
		Scanner input = new Scanner (System.in);
		
		// declare variable as doubles
		double weight, height, bmi;
		
		// ask user for weight
		System.out.print("Enter your weight in pounds: ");
		
		// read in weight
		weight = input.nextDouble();
		
		// ask user for height
		System.out.print("Enter your height in inches: ");
		
		// read in height
		height = input.nextDouble();
		
		/* bmi formula in English units is:
		 * (weight in inches / (height in inches * height in inches)) * 703.07
		 * 
		 * if Metric:
		 * weight in kg / (height in m * height in m)
		 * 
		 */
		
		
		// declaring the round variable to use the Math.round function so that there are only 2 decimal places printing to the console
		double round;
		
		// calculate bmi
		bmi = ((weight) / (height * height)) * 703.07;
		
		// assigning round to bmi * 100.0 / 100.0 using the decimal .0 to let java know that we are passing a double
		round = Math.round(bmi * 100.0) / 100.0;
		
		// if statements checking the bmi value in relation to ranges listed. Output to console the bmi and where that value is on the bmi scale
		if (bmi < 18.5)
			System.out.println("Your BMI is " + round + " and you are underweight...eat more!");
		if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Your BMI is " + round + " and you are normal weight...keep on doing more of the same!");
		if (bmi >= 25 && bmi <= 29.9)
			System.out.println("Your BMI is " + round + " and you are overweight...you should keep an eye on your diet!");
		if (bmi >= 30 && bmi <=34.9)
			System.out.println("Your BMI is " + round + " and you are obese...you should see a doctor for help!");
		
		
		
		
		}
	
	// end bmi class

	}

// end main method

