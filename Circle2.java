
public class Circle2 {

	// instance variable which means that each object gets its own copy of this variable
	// so each object can have its own value for radius
	double radius;
	
	// counts number of objects that we have
	// this belongs to the Class 
	static int numberOfObjects = 0;
	
	
	// default constructor
	Circle2(){
		
		radius = 1.0;
		numberOfObjects++;
	}
	
	
	// constructor that takes a parameter
	// instance variable
	Circle2(double newRadius){
		
		radius = newRadius;
		numberOfObjects++;
	}
	
	
	
	
	// methods that make the Class useful
	// returns int
	static int getNumberOfObjects() {
		
		return numberOfObjects;
		
	}
	
	
	// method that calculates area
	// this is an instance method
	double getArea() {
		
		return radius*radius*Math.PI;
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Number of objects: " + Circle2.getNumberOfObjects());
		
		System.out.println("Creating an object...");
		
		Circle2 c1 = new Circle2();
		
		System.out.println("Number of objects: " + Circle2.getNumberOfObjects());
		
		
		
		System.out.println("Creating another object...");
		
		Circle2 c2 = new Circle2(14.3);
		
		
		// static method Circle2 the class name dot method name
		System.out.println("Number of objects: " + Circle2.getNumberOfObjects());
		
		// instance method so it uses variable name dot method name
		System.out.println("The area of c1 is: " + c1.getArea());
		System.out.println("The area of c2 is: " + c2.getArea());
		
	}
	
	
	
}
