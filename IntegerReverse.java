import java.util.*;


public class IntegerReverse {

	public static void main(String[] args) {
		
		System.out.print("Enter an integer: ");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		System.out.println();
		System.out.println("The integer reversed is: ");
		
		reverse(number);
		
		input.close();
		 
	}
	
	
	public static void reverse(int number) {
		
		while(number != 0) {
			
			
			int remainder = number % 10;
			System.out.print(remainder);
			number = number/10;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
