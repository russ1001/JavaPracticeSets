import java.util.*;

public class ArrayExampleCode {

	public static void main(String[] args) {
		
		
		 
		// create array
		int num[] = new int[5];
		
		// load array
		for(int i=0; i<=4; i++) {
			
			num[i] = i + 1;
		}
		
		int targetValue = 3;
		int count = 0;
		
		int sum = 0;
		
		for(int j=0;j<5;j++) {
			
			
			// print array count of iterations
			System.out.print("--> count " + num[j] + " ");
			
		// count and print sum	
			sum += num[j];
			
			System.out.println(" * sum " + sum + " * ");
			
						
			
		}
		
		// count occurrences
			for (int k=0; k<5;k++) {
				
				
				if(num[k] == targetValue)
					
					count++;
			}
			
			System.out.println("Occurrences: " + count);
			
		
			// determine presence or absence
			
			int y=4;
			boolean found=false;
			for(int index=0;index<5;index++) {
				
				
				
				if(num[index] == y) {
					
					
					found = true;
					break;
					
				}
			}
			
			if(found==true)
				System.out.println("Found");
				else
					System.out.println("Not found");
			
			
		
		String[] myArray = {"Cat", "Dog", "Panda", "Moose", "Elk", "Alaska"};
		
		for(String s: myArray) {
			
			System.out.print(s + " ");
		}
		
		
			
			
			
			
		

	}
// close main method
	
	
	
	
	
	
	
	
	
	

}
