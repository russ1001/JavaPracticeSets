import java.util.*;

public class Module2CodeAssignment {

public static void main(String[] args) {

	// declare and assign the Scanner variable input and set its assignment to the System.in 
	// and the input from console
	Scanner input = new Scanner(System.in);
	// prompt user to enter row and column size
	System.out.println("Enter the row and column size of the array (these values must be of integer type): ");
	// declare and assign the row and column values to the next inputted values from console
	int row = input.nextInt();
	int column = input.nextInt();
	// declare a two-D array named data and assign its size using the row and column data entered by user
	double data[][] = new double[row][column];
	// prompt user to enter array values via console
	System.out.println("Enter your array values: ");
	// nested for loop assigning each entered value to the next element location in the 2-D array
	for(int i=0; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {

			data[i][j] = input.nextDouble();
		}
		// close inner for loop
	}
	// close outer for loop

	// close Scanner input
	input.close();

	System.out.println();
	// print one line for spacing purposes

	// print out entered array using nested for loop
	System.out.println("The entered two-dimensional array is:");
	System.out.println("=====================================");
	for(int i=0; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {

			System.out.print(data[i][j] + "\t");
		}
		System.out.println();
	}
	// close outer for loop


	// create a new instance of the Location class and pass the entered
	// 2-D array data to it
	Location location = Location.locateLargest(data); 

	// print out results that the Location class passed back to main method
	// displaying the maxValue and the location in the array
	System.out.println("\nThe number of the largest value in the array is " + location.maxValue
			+ " and it is located at [" + location.row + ", " + location.column + "] in the array.");

}
// close main method

// declare the Location class
static class Location {
	// declare the data fields for the Location class as public
	public int row;
	public int column;
	public double maxValue;

	// default constructor of the Location class
	public Location() {

	}

	// constructor of the Location class initializing the row, column and maxValue
	// with the arguments passed from the calling method using the this. function
	public Location(int row, int column, double maxValue) {

		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	// declare the method locateLargest within the Location class
	// with a two-dimensional array being passed in from the calling method
	// public so that it will be visible from classes in other packages
	// static so that it may be shared among all instances of the class 
	public static Location locateLargest(double[][] data) {

		// declare and initialize the int variables row & column to zero
		// declare and initialize the double variable maxValue to the 
		// two-dimensional array element at [row][column]
		int row = 0;
		int column = 0;
		double maxValue = data[row][column];

		// nested for loop that iterates through each element of the two-D array 
		// testing for the maximum value and when finding it assigns that max value 
		// to the corresponding element location in the array
		// if it the current element is not greater than the maxValue 
		// row and column are incremented accordingly leaving maxValue the same
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {

				if(maxValue < data[i][j]) {

					maxValue = data[i][j];
					row = i;
					column = j;
				}
				// close if statement
			}
			// close inner for loop
		} 
		// close outer for loop

		// return a new instance of the Location class to the calling method
		return new Location(row, column, maxValue);
	}
	// close the method locateLargest 

}
//close class Location
}
//close streffTask1 class