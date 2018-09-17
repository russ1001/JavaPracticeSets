import java.util.*;

public class Arrays {

	public static void main(String[] args) {

		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter " + myList.length + " values: ");
		
		
		
		for(int i=0; i<myList.length; i++) {
			
			myList[i] = input.nextDouble();
			
		}
		
		input.close();

		for(int i=0; i<myList.length; i++) {
			
			while(i<myList.length) {
			System.out.print(myList[i] + " ");
			
			}
	
		}
	}
}

