package streffTask1;

import java.util.*;
// import entire java utility using the * wildcard

// declare the class MyString1 per code assignment
public class MyString1 {

	// declare the character array chars as one of the data fields
	char[] chars;
	String string;
	
	
	
	
	//============================================================================================
	// constructor that gets a character array passed in 
	// and sets the class character array to the passed values
	// using the this. call
	// 
	public MyString1(char[] chars) {
		// set the passed character array to the MyString1 class's variable character array chars
		this.chars = new char[chars.length];
		// for loop iterating through the length of the character array chars setting the array to 
		// the MyString1 character array chars
		for(int i=0; i<chars.length; i++) {
			this.chars[i]  = chars[i];
		}
		// close for loop
	}
	// close MyString1 constructor method
	
	
	
	
	
	//==============================================================================================
	// constructor that gets a string passed in and sets the string to a character array
	// converting the string into a sequence of characters
	public MyString1(String string) {
		this(string.toCharArray());
	}
	
	
	
	
	
	//================================================================================================
	// constructor that gets an integer passed in and returns the index of 
	// the character array 
	public char charAt(int index) {
		return chars[index];
	}
	
	
	
	//================================================================================================
	// constructor that returns the length of the character array
	public int length() {
		return chars.length;
	}
	
	
	//================================================================================================
	// constructor that creates a new instance of MyString1 using two integers passed in 
	// to determine the 
	public MyString1 substring(int begin, int end) {
		char[] s = new char[end - begin];
		for(int i=begin; i<end; i++) {
			s[i-begin] = chars[i];
		}
		
		return new MyString1(s);
	}
	
	
	
	//=================================================================================================
	// constructor that returns the passed in values in lower case
	public MyString1 toLowerCase() {
		//A=65 
		//a=97
		char[] lowerCase = new char[chars.length];
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i] >= 'A' && chars[i] <= 'Z') {
				lowerCase[i] = (char)(chars[i] + 32);
			}
			else {
				lowerCase[i] = chars[i];
			}
		}
		return new MyString1(lowerCase);
	}
	
	
	
	
	
	
	//==============================================================================================
	// constructor that returns a boolean checking to see if the values passed in
	// equal to the current values of the MyString1 character array
	public boolean equals(MyString1 s) {
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) != chars[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	//==============================================================================================
	// constructor that returns the value of a specific index of the character array
	public static MyString1 valueOf(int i) {
		int length = getCount(i);
		char[] number = new char[length];
		for(int j = length-1; j >= 0; j--) {
			number[j] = (char)('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(number);
	}
	
	
	
	
	//===============================================================================================
	// constructor that returns the value of a long int
	public static MyString1 valueOf(long i) {
		int length = getCount(i);
		char[] number = new char[length];
		for(int j = length-1; j >= 0; j--) {
			number[j] = (char)('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(number);
	}
	
	
	
	
	
	
	
	
	
	
	
	


























}
// close MyString1 class
