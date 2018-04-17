
// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class SortAsInserted
public class SortAsInserted { 

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input and set it to the entered data from keyboard		
		Scanner input = new Scanner(System.in);
		 
// print to console and prompt user to enter the number of strings to be sorted		
		System.out.println("Please enter the number of strings to be sorted: ");
		
// declare the integer variable length and set it's value to the next inputted value from the user 		
		int length = input.nextInt();
		
		if(length<1) {  
			
			System.out.println("Error: You entered a non-positive number");
			System.exit(1); 
		}
	
// call the sortArray method and pass the size of the array entered by the user		
		sortArray(length);
	
		System.out.println("\nAll done, back to main method");
		} 
// close main method		
	
	
	
	
	
	
	
	
	
	
	
// sort array method named sortArray
	public static void sortArray(int userLength){
		
	
		
		String[] list = new String[userLength];
		Scanner input = new Scanner(System.in);
		String temp = "";
		String key1 = "";
		String key2 ="";
		int i = 0;
		
		
		System.out.println("Enter a string: ");
		String element = input.next(); 
		list[i] = element;
		
		if(userLength==1) {
			
			printArray(list);
			return; 
		}
		 
		
		for(i=0; i<userLength-1; i++) {
			
			System.out.println("Enter a string: ");
			element = input.next(); 
			list[i+1] = element;
			
			
			int minIndex = i;
			
			for(int j=i+1; j<userLength; j++) {
				
				key1 = list[i]; 
				key2 = list[i+1]; 
				
				if(key2.compareTo(key1)<0) {
					
					minIndex = j;
			}
			
				
		} 
			temp = list[i];
			list[i] = list[i+1];
			list[i+1] = temp;
			
		
		}
		
		System.out.println("Done");
		printArray(list);

}
// close sortArray method	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


// print array method named printArray	
	public static void printArray(String[] x){
		
// for loop to print out array using the length of the string array passed to the method as the upper range limit
// the string array is passed from the sortArray method		
			for(int i=0; i<x.length; i++) {
		
// if statement checking the count of i in relation to the length of the string array
// if the increment integer i is equals to the length of the string array minus one 
// then print out the value of the string array at index i
// else print out the value of the string array at index i with a comma after the value
				if(i==x.length-1) {
				System.out.print(x[i]);
				}
				else 
					System.out.print(x[i] + ", ");
			}
// close for loop			
		
		}
// close printArray method	
}	
// close class SortAsInserted








