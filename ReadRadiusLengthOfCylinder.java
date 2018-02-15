/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #2 - 
 * 					
 * 
 *  1. Read in the radius and length of a cylinder and output to the console the area and volume.
 * 					
 */

// import Scanner utility 
import java.util.Scanner;

// declare the class ReadRadiusLengthOfCylinder
public class ReadRadiusLengthOfCylinder {

	// declare the method main
	public static void main(String[] args) {
		
		// declare the variables as doubles
		// assign pi a value of 3.14159
		double radius, length, area, volume;
		double pi = 3.14159;
		
		// declare Scanner input variable named input
		Scanner input = new Scanner(System.in);
		
		// ask for user to enter radius via console
		System.out.print("Enter the radius of a cylinder in inches: ");
		
		// take in radius
		radius = input.nextFloat();
		
		// ask for user to enter length via console
		System.out.print("Enter the length of a cylinder in inches: ");
		
		// take in length
		length = input.nextFloat();

		// set the variable area to radius * radius * pi
		area = radius * radius * pi;
		
		// output to console the area of the cylinder and  utilizing the Math.round function of the Math class to round to two decimal places (hope this is an ok way to do this)
		System.out.print("The area of a cylinder with a radius of " + Math.round(radius * 100.0) / 100.0 + " and length of " + Math.round(length * 100.0) / 100.0 + " = " + Math.round(area * 100.00) / 100.00 + " sq.in.");
		
		
		// output to console the volume of the cylinder and utilizing the Math.round function of the Math class to round to two decimal places 
		volume = area * length;
		System.out.println("\nThe volume of a cylinder with a radius of " + Math.round(radius * 100.0) / 100.0 + " and length of " + Math.round(length * 100.0) / 100.0 + " = " + Math.round(volume * 100.00) / 100.00 + " cu.in.");
			
		

	}

	// end main method
}

// end ReadRadiusLengthOfCylinder class