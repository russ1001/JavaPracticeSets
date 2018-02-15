/* 
 * Russell Streff
 * CSCI 225
 * Problem Set #3 - Calcluate the day of the week based on entered year, month, and date
 * 
 */


// import the entire java utility class using the * wilcard callout
import java.util.*;

// declare the class ZellersCongruence
public class ZellersCongruence {

// declare the main method	
	public static void main(String[] args) {
		
// declare the Scanner variable input		
		Scanner input = new Scanner(System.in);
			
/* Zeller's congruence formula to determine the day of the week for any given year, month, date given
 * 
 * h = day of week (0: Saturday, 1: Sunday 2: Monday 3: Tuesday 4: Wednesday 5: Thursday 6: Friday
 * q = day of the month
 * m = month (3: March 4: April 5: May, ... 12: December) January and February are counted as months 13 and 14 of the previous year
 * j = century (year/100)
 * k = year of the century (year%100)
 * 
 * h = (q + ((26(m+1)/10) + k + (k/4) + (j/4) + (5*j) % 7 
 * 		
 */
		
// declare the variables m,q,y,j,k,h as integers
// declare the variable dayName as a string
		int m; // month
		int q; // day
		int y; // year
		int j; // century
		int k; // year of the century
		int h; // day of the week answer
		String dayName;
		
// prompt the user via the console to enter the year, month and day	to be calculated	
		System.out.println("Enter the year, month and day: ");
			
// get the year, month and day from the user via the Scanner variable inputs		
		y = input.nextInt();// year
		m = input.nextInt();// month
		q = input.nextInt();// day
		
// close the Scanner		
		input.close();
				
// if statement testing to see if the month is either January or February, if true add 12 to the month and subtract 1 from the year	
// according to the formula given
		if (m < 3) {
			
			m = m + 12;
			y = y - 1;
						
		}
		
// calculate the century and year of the century variables values based on the year entered		
		j = y / 100;
		k = y % 100;
		
		
// Zeller's congruence formula to determine what day of the week is calculated from the entered year, month and day		
		h = ((q + (((m + 1) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) % 7;
	
// switch statement taking the resulted calculation of the day of the week and assigning the String dayName to the corresponding answer of h		
		switch (h)
		{
		
		case 0: 	dayName = "Saturday"; 	break;
		case 1:		dayName = "Sunday";		break;
		case 2:		dayName = "Monday";		break;
		case 3:		dayName = "Tuesday";	break;
		case 4:	 	dayName = "Wednesday";	break;
		case 5: 	dayName = "Thursday";	break;
		case 6: 	dayName = "Friday";		break;
		default: 	dayName = "Error";		break;
				
		}
// close switch statement		
		
// print to console the name of the day of the week from the entered year, month and day		
		System.out.println(dayName);		
	
	}
// close main method	

}
// close class ZellersCongruence
