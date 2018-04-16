
// import the entire java utility using the * wildcard callout
import java.util.*;

// declare the class SortAsInserted
public class TEST { 

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
		
		Scanner in = new Scanner(System.in);
		String[] methodArray = new String[userLength];
		String a;
		String b;
		String temp="";
		int i = 0;
		
		
// WHILE		
			while(i<userLength) {
				
// LENGTH OF 1				
				if(userLength==1) {	
				System.out.println("Enter a string: ");
				a = in.next();
				methodArray[i] = a;
				printArray(methodArray);
				return; 
			}
			
// LENGTH OF 2
				if(userLength==2) {
				System.out.println("Enter a string: ");
				a = in.next();
							
				System.out.println("Enter a string: ");
				b = in.next();
				
// compare to sort for array of size 2			
			if(b.compareTo(a)<0) {
					 
					temp = a;
					a = b;
					b = temp;
					
					methodArray[i] = a;
					methodArray[i+1] = b; 
					printArray(methodArray);
					return;
			}
				methodArray[i] = a;
				methodArray[i+1] = b;
				printArray(methodArray);
				return; 
				 
			}	
// close if statement		

				
// LENGTH OF 3 OR MORE				
			

				String currentEntry = "";
				int currentIndex = 0;
				System.out.println("Enter a string: ");
				currentEntry = in.next();
				 
				while(currentIndex<userLength) {
				for(i=0; i<userLength; i++) {
					
					
					if(userLength==1) {
						methodArray[i] = currentEntry;
						printArray(methodArray);
						return;
					}
					
					for(int j=i+1; j<userLength; j++) {
						
					System.out.println("Enter a string: ");
					currentEntry = in.next();	
						
// keep on getting an error on this comparison??
					if(currentEntry.compareTo(methodArray[i])<0) {
						
						temp = methodArray[i];
						currentEntry = methodArray[i];
						methodArray[i] = temp;
						
						
					}
					
					currentEntry = methodArray[i+1];
					
				} 
					
			}

		}	

	}
// while loop within the range of the array length		
		return;
// return to main method
	
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








