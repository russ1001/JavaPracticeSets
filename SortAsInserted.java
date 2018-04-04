import java.util.*;

public class SortAsInserted {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of strings to be inserted: ");
		int noOfStrings = Integer.parseInt(input.nextLine());
		
		String[] stringArrayFromUser = new String[noOfStrings];
		
		
		
		for(int i=0; i<noOfStrings; i++) {
		System.out.print("Enter a string: ");
		
		stringArrayFromUser[i] = input.nextLine();
		
		}
		

	

// close main method
	}
	
	
	
	public static String[] InsertStringAndSort(String userEnteredString) {
		
		
		
		
		
	}
	
	
	
	
	
	public static void PrintArray(String list) {
		
		
		System.out.println("---------------------------------");
		
		for(int i=0; i<noOfStrings; i++) {
			
			
			System.out.print("String " + (i+1) + " is: ");
			System.out.print(stringArrayFromUser[i] + "\n");
		}
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
// close class SortAsInserted
	
	
	
		
	
	
