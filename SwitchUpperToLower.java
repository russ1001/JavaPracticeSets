/*
Russell Streff
CSCI 225
Problem Set #4

Problem statement #2 - Switch lower to upper vice versa

Take in as input a 3 character string. Any character that is upper case make lower and vice
versa. Output the new string
Input Format
A three character string. Assume only alphabetic characters will be entered. Assume only 3
character strings will be entered. 


*/


// import java utility class by using the * wildcard callout
import java.util.*;

// declare the class SwitchUpperToLower
public class SwitchUpperToLower {

// declare the main method
       public static void main(String[] args) {

// declare the Scanner variable input and take in the input data via the console   	   
    	   Scanner input = new Scanner(System.in);

// declare the variable caseSwitch and result as a Strings and assign them empty values  
// declare the variable dataLength as an integer
    	   	 String caseSwitch = ""; 
             String result = ""; 
             int dataLength;

// print to console and prompt the user to enter the three character string            
             System.out.println("Enter the three character string: ");

// set the variable caseSwitch to the input data entered by user             
             caseSwitch = input.next();
             
// print one line to console for spacing
             System.out.println(" ");
            
// close Scanner              
             input.close();

// assign the variable dataLength to the length of the variable caseSwitch which is the data entered by the user           
             dataLength = caseSwitch.length();
             
// if the dataLength variable is greater than 3 print to console an error stating the length is not correct             
             if(dataLength > 3) {
            	 
            	 System.out.println("Error: Input is not the 3 character string requested!");
            	 System.out.println("But here is your string conversion anyway...\n"); 
             }
// close if             
            
// for loop to iterate through the elements of the entered data by using integer variable i as the index and cycling through up to the length of the entered data
             for(int i = 0; i < (caseSwitch.length()); i++) {
           	 
// declare the variable currentChar as a char and assigning the user data at index i to the variable
            	 char currentChar = caseSwitch.charAt(i);
             
// if/else statement checking to see if the current character in the for loop is lower case or upper case and toggling the character respectively   
// assigning the variable result to the correct toggled case and adding the result to itself to create a new string 
             if(Character.isUpperCase(currentChar)) {
            	 
            	 char currentCharToLowerCase = Character.toLowerCase(currentChar);
            	 result = result + currentCharToLowerCase;
             }
// close if 
             
             else {
            	 
            	 char currentCharToUpperCase = Character.toUpperCase(currentChar);
            	 result = result + currentCharToUpperCase;
             }
// close else
   
           }
// close for loop
             
// print to console the new toggled string using the string variable result             
             System.out.println("The new string with the letters toggled from their original state is: " + result);
       }
// close main method
}
// close class SwitchUpperToLower
           