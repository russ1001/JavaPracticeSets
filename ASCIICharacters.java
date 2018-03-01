/*Russell Streff
CSCI 225
Problem Set #5 - 

				Problem Statement #2 - ASCII Characters

Write a program that prints the ASCII characters from ! to ~ using a single for loop.  Display 10 characters per line.
The ASCII table can be found in Appendix B or http://www.asciitable.com. 

Input Format 
Not Applicable. 

Output Format 
The ASCII characters from ! to ~ printing only 10 per line. 

*/

// declare the ASCIICharacters class
public class ASCIICharacters {

// declare the main method	
	public static void main(String[] args) {
		
// declare the variable asciiFullSet as a String and set it's value to the ASCII characters from ! - ~ (33-126)	
		String asciiFullSet = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\r\n" + "";

// declare the variable counter as an integer and set it's value to 0		
		int counter = 0;

// print a label to console explaining the output		
		System.out.println("List of ASCII characters");
// print a dashed line to console for spacing		
		System.out.println("-------------------------");
		
// for loop declaring the counter variable i as an integer and settig it's value to 0
// i will iterate through the loop as long as it is less than or equal to the asciiFullSet length -1
// i will increment by 1 each loop
		for(int i = 0; i<=asciiFullSet.length()-1; i++) {

// print to console the ascii characters in order from 33-126 with one space after each character			
			System.out.print(asciiFullSet.charAt(i) + " ");	
	
// increment the counter by 1			
			counter++;
			
// if statement checking to see if the counter modulus 10 is equal to 0 (multiple of ten)
// print a new line to make sure the ascii characters only print 10 per line
			if((counter % 10) == 0 )
				
// print to console one line
				System.out.println();
			
		}
// close for loop				
	}
// close main method		
}
// close class ASCIICharacters
	
