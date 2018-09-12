import java.util.*;

public class Circle {

	
	// declare radius
	// this is a member variable
	// any object we create has a copy of this member variable
	private double radius;
	
	
	
	// create default constructor
	public Circle() {
		radius = 0;
	}
	

	
	// use constructor and take in radius as a parameter
	public Circle(double newRadius) {
		// this refers to the particular object that we are operating on now
		this.radius = newRadius;
	}
	
	
	
	// create constructor getArea
	// returns area
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	
	// create constructor getPerimeter
	// returns perimeter
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	
	
	// set the radius
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	
	
	
	
	
	
}
