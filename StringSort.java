	/*
	 * Russell Streff
	 * CSCI 225
	 * Problem Set #4 
	 * 
	 * Problem statement #7 - String Sort
	 * 
	 * 
	 * 
	 * Write a program that prompts the user to enter the names of three cartoon characters one at a
	time. Display the names of the characters in descending order. (Only use what we have learned
	up to this point. No ARRAYS)
	Input Format
	Three strings.
	Output Format
	The strings on a newline each in descending order. 
	 * 
	 * 
	 * */





// import the entire java utility using the * wildcard callout
	import java.util.*;
	
// declare the class StringSort
		public class StringSort {

// declare the main method	
			public static void main(String[] args) {
			
// declare the Scanner variable input and set it's value to the input from the console		
			Scanner input = new Scanner(System.in);
			
// declare three String variables name toonOne, toonTwo, toonThree
			String toonOne, toonTwo, toonThree; 
			
// declare three boolean variables one, two, three to be used to check the alphabetical order (descending order) of the strings entered		
			boolean one, two, three, four, five, six;

// prompt the use to enter three names of cartoon characters
			System.out.println("Please enter the first cartoon character's name: ");
			
// set the string variable toonOne to the next input from console and trim excess white space
			toonOne = input.nextLine().trim();
			
// prompt the use to enter three names of cartoon characters
			System.out.println("Please enter the second cartoon character's name: ");
					
// set the string variable toonTwo to the next input from console and trim excess white space
			toonTwo = input.nextLine().trim();
			
// prompt the use to enter three names of cartoon characters
			System.out.println("Please enter the third cartoon character's name: ");
					
// set the string variable toonThree to the next input from console and trim excess white space
			toonThree = input.nextLine().trim();	
			
// close Scanner 
			input.close();
		
// declare three string variables lastOne, lastTwo, lastThree that will be used to get the last word in the strings that are entered by user
			String lastOne, lastTwo, lastThree;
			
// declare three string variables firstOne, firstTwo, firstThree that will be used to get the first word in the strings that are entered by user
			String firstOne, firstTwo, firstThree;
			
// set each string variable of the last names to the corresponding entered string by user
// and assign it's value to the last word in each string entered by using the .lastIndexOf a space as reference
// + 1 gets the last word by using the last space as reference and then using index 1 which would be the next string after the last space
			lastOne = toonOne.substring(toonOne.lastIndexOf(" ") + 1);
			lastTwo = toonTwo.substring(toonTwo.lastIndexOf(" ") + 1);
			lastThree = toonThree.substring(toonThree.lastIndexOf(" ") + 1);
			
// set each string variable of the first names to the corresponding entered string by user
// and assign it's value to the first word in each string entered by using .split finding the space starting at index 0	with limit 2		
			firstOne = toonOne.split(" ", 2)[0];
			firstTwo = toonTwo.split(" ", 2)[0];
			firstThree = toonThree.split(" ", 2)[0];
			
// print one line to create space between the data input and the output	to console		
			System.out.println("_________________________________________");
			
// searching the last word in the string entered			
// set the boolean variables one, two, three by comparing the corresponding strings to each other i.e. lastOne compared to lastTwo, etc...
// each comparison will return a boolean value 0 if true if when compared the comparison is greater than zero i.e. true
// each comparison using .compareTo takes into account that a capital letter is put before the same lower case letter 
			one = lastOne.compareTo(lastTwo)>0;
			two = lastTwo.compareTo(lastThree)>0;
			three = lastOne.compareTo(lastThree)>0; 
		
// searching the first word in the string entered		
// set the boolean variables four, five, six by comparing the corresponding strings to each other i.e. firstOne compared to firstTwo etc...
// each comparison will return a boolean value 0 if true if when compared the comparison is greater than zero i.e. true
// each comparison using .compareTo takes into account that a capital letter is put before the same lower case letter
			four = firstOne.compareTo(firstTwo)>0;
			five = firstTwo.compareTo(firstThree)>0;
			six = firstOne.compareTo(firstThree)>0;
			
// series of if/else statements checking to see if the last name of all three entered names are the same i.e. one = two or two = three or one = three
// if so, then check the alphabetical order (descending order) of the first names and sort them before printing the first and last names in descending order
// print to console the appropriate first, second and third names entered in 
// if first last name entered equals the second last name entered
			if(one == two) {
				
// if the second last name entered equals the third last name entered				
				if(two == three) {
				
// if either of the first conditions are true then sort the first names and then print to console the corresponding sorted last and first names	
// all of the if statements use the boolean values of the comparisons as indicators to determine the sorted list					
					if(four == false && five == false && six == false) {
						
						System.out.println(toonOne + ", " + toonTwo + ", " + toonThree);
					}
// close if			
					
					if(four == false && five == true && six == false) {
						
						System.out.println(toonOne + ", " + toonThree + ", " + toonTwo);
					}
// close if	
					
					if(four == true && five == false && six == false) {
						
						System.out.println(toonTwo + ", " + toonOne + ", " + toonThree);
					}
// close if	
					
					if(four == false && five == true && six == true) {
						
						System.out.println(toonThree + ", " + toonOne + ", " + toonTwo);
					}
// close if	
					
					if(four == true && five == false && six == true) {
						
						System.out.println(toonTwo + ", " + toonThree + ", " + toonOne);
					}
// close if			
					
					if(four == true && five == true && six == true) {
						
						System.out.println(toonThree + ", " + toonTwo + ", " + toonOne);
					}
// close if	
					
					
					
					if(four == false && five == false && six == false) {
						
						System.out.println(firstOne + ", " + firstTwo + ", " + firstThree);
					}
// close if					
					
				}
// close if test of last names two and three being the same				
			}
// close if	test of last names one and two being the same

			
// series of else/if statements sorting the last names in descending order when the three entered last name are different
// print to console the appropriate first, second and third names entered in in descending order
			else {
				
				if(one == false && two == false && three == false) {
					
					System.out.println(toonOne + ", " + toonTwo + ", " + toonThree);
				}
//close if			
				
				if(one == false && two == true && three == false) {
					
					System.out.println(toonOne + ", " + toonThree + ", " + toonTwo);
				}
//close if	
				
				if(one == true && two == false && three == false) {
					
					System.out.println(toonTwo + ", " + toonOne + ", " + toonThree);
				}
//close if	
				
				if(one == false && two == true && three == true) {
					
					System.out.println(toonThree + ", " + toonOne + ", " + toonTwo);
				}
//close if	
				
				if(one == true && two == false && three == true) {
					
					System.out.println(toonTwo + ", " + toonThree + ", " + toonOne);
				}
//close if			
				
				if(one == true && two == true && three == true) {
					
					System.out.println(toonThree + ", " + toonTwo + ", " + toonOne);
				}
//close if	
			}  
//close else			
			
		}
	// close main method	
		
	}
	// close class StringSort

