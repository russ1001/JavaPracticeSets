// import the entire java utility class using the * wildcard callout
import java.util.*;

// declare the class CardinalDirection
public class CardinalDirection {

// declare the main method
	public static void main(String[] args) {
	
// declare the Scanner variable input and set it to take in user data from the console		
		Scanner input = new Scanner(System.in);
		
		String direction = "";
		String result = "";
		int num;
		
		
		System.out.println("Enter a cardinal direction: ");
		
		direction = input.next();
		
		input.close();
		
		num = direction.length();
		
		if(num > 5) {
			
			System.out.println("\nERROR: Invalid direction! You entered " + direction + " which is not a cardinal direction.");
			
		
			}
			
		
			for(int i = 0; i < num; i++) {
				
				char currentChar = direction.charAt(i);
				
				if(Character.isLowerCase(currentChar) || Character.isUpperCase(currentChar)) {
					
					char changeChar = Character.toUpperCase(currentChar);
					result = result + changeChar;
				}
				
				else {
					
					if (result == "NORTH") {
						
						System.out.println("^");		}
						
						else 
							if(result == "SOUTH"){
							
								System.out.println("v");
						}
						
							else 
								if(result == "EAST") {
									
									System.out.println(">");
								}
								else 
									if(result == "WEST") {
										
										System.out.println("<");
									}

					
				}
				
				
				
				
			}
		
		
		System.out.println(result);

	

	
	

	}

}
