import java.util.*;


public class ComputerPI {

	public static void main(String[] args) {
		
		System.out.println("i\t\tm(i)");
		// change what i<= value to higher number for higher precision of PI
		for (int i=10; i<=100000; i+=10) {
			
			System.out.println(i + "\t\t" + m(i) );
		}
		
	}
	



public static double m(int n) {
	
	double pi = 0;
	double term;
	
	for(int i=1; i<=n; i+=2) {
		
		term = 4.0 * (1.0 / (2 * i - 1 ) -1.0 / (2 * i + 1));
		pi += term;
	}
	
	return pi;
}
















}




