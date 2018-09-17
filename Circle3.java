
public class Circle3 {

	// Hide the instance variables of an object form other objects
	// 		-Data field encapsulation
	// Provide methods for accessing and changing the properties of a class
	//		-In the methods we can make sure the data is valid or do extra processing
	
	
	// only be seen by objects of this class
	private double radius = 1;
	
	// same
	private static int numberOfObjects = 0;
	
	// increments the number of objects, it's only purpose
	// default constructor with no parameters
	public Circle3() {
		
		numberOfObjects++;
		
	}
	
	
	// another constructor
	public Circle3(double newRadius) {
		
		radius = newRadius;
		numberOfObjects++;
		
	}
	
	
	// public method to get the radius
	// but we don't want anyone to directly change the radius
	public double getRadius() {
		
		return radius;
	}
	
	
	
	// doesn't return anything
	// 
	public void setRadius(double newRadius) {
		
		// ternary operator
		// checking to make sure it is a positive radius
		// if not set to zero
		radius = (newRadius>=0) ? newRadius : 0;
		 
	}
	
	
	
	// 
	public static int getNumberOfObjects()
	{
		
		return numberOfObjects;
		
	}
	
	
	
	
	// 
	public double getArea() {
		
		return radius*radius*Math.PI;
		
	}
	
	
	
	
	

}
