
public class FanClass {

	public static void main(String[] args) {
		// create a Fan1 object called fan1 using default constructor
		// calling the created class called Fan1
		Fan1 fan1 = new Fan1();
		fan1.setSpeed(Fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		System.out.println();
		
		// creating second Fan1 object called fan2		
		Fan1 fan2 = new Fan1();
		fan2.setSpeed(Fan1.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
		
		
	}
}



// create class called Fan1
class Fan1{
	// static constants to keep track of what slow, medium and fast are
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	// member variables for Fan1
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "white";
	
	// default constructor
	public Fan1() {
		
	}

	// getters and setters 
	// all the member variables
	// we may want to do special processing to make sure the input is valid
	// variables are private so it allows the user to access them safely
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// create toString method
	public String toString() {
		return "speed " + speed + "\n" + "color " + color + "\n" + "radius " + radius + "\n" + ((on) ? "fan is on " : "fan is off ");
				
	}
	
	
	
	
	
	
	
	
	
	
	
}