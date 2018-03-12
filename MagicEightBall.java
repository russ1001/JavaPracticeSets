/*Problem Statement – Magic Eight Ball
 * 
 * 
 * WRITING METHODS
 * 
 * 
You will be writing a program that simulates the magic 8 ball.  
You will prompt the user to enter a question and the software will produce a reply.
Replies will be randomly selected from a series of replies coded in the software.
You must use: 1. A random number generator. 
2. The switch statement for the replies. 
3. A while(true) loop so that the user is prompted for more questions.  
Do-While is fine, too. 4. Passing parameters between main and other methods. 
5. At least 3 methods: main, an input method, and an output method (the method to produce the replies)

There is no correlation between the user's question and program's response.

Make sure your responses have a “Computer Science” flavor.  
For instance, if I were to make a Magic 8 Ball for statisticians one of my responses might be “That is not statistically significant.”  
Basically, create some geek-type responses like “Out of memory, please try again later” 
or “My vast database of human intelligence indicates the answer is...no.”  
Also, the minimum number of responses are as follows: 3 positive responses 3 neutral responses 3 negative responses
but you can have more for each if you would like.

Get creative and have fun with this one.

Input Format
A string of the user's question.  

Output Format
A string of the computer's response.
 * 
 * 
 * */



// import full java utility using the * wildcard callout
import java.util.*;

// import full java security class so SecureRandom can be used for a random number generator
import java.security.*;

// declare class MagicEightBall 
public class MagicEightBall {

	public static void main(String[] args) {
		
// declare the variable askAgain as a boolean and initialize it's value to true		
		boolean askAgain = true;
		
// while loop as long as the askAgain boolean is true		
		while(askAgain) {
		
// call the method inputQuestion			
		inputQuestion();
			
		}
// close while			
} 
// close main method		
	
	
	
		
// declare the method inputQuestion	
	public static void inputQuestion() {
		
// declare the variable question as a string and initialize it's value as null
		String question = "";
		
// print to console and prompt user to enter their question		
		System.out.println("Enter your question for the Magic Eight Ball: ");
	
// declare the Scanner variable input and set it's value to the console input		
		Scanner input = new Scanner(System.in);
		
// set the Scanner question variable to the next entered data from console		
		question = input.nextLine();
		
// call the generateEightBallAnswers method		
		generateEightBallAnswers();
		
// declare the variables keepGoing and nextQuestion as strings		
		String keepGoing, nextQuestion;
		
// declare the variable askAgain as boolean and set it's value to true		
		boolean askAgain = true;
		
// while loop will run as long as askAgain boolean is true		
		while(askAgain) {
			
// print to console and prompt the user to see if they want to continue to ask questions			
			System.out.println("Do you want continue asking the Magic Eight Ball questions Y or N?: ");
			
// set the keepGoing variable to the next entered data from the console and trim any white space
			keepGoing = input.nextLine().trim();
			
// if statement checking the value of the entered data from console assigned to keepGoing
// if the string inputted is equal to the character string 'Y' then continue else get out of if part of statement 
			if(keepGoing.equalsIgnoreCase("Y")) {
				
// print to console and ask what the next question is from the user
				System.out.println("What is your next question for the Magic Eight Ball? ");
				
// once again set the nextQuestion variable's value to the next entered data from console				
				nextQuestion = input.nextLine();
				
// call the generateEightBallAnswers method again				
				generateEightBallAnswers();
				
			}
// close if			
			
// else if statement checking to see if the inputted variable keepGoing is equal to the character 'N' 
// if it is equal to 'N' then print to console message and exit program			
			else if(keepGoing.equalsIgnoreCase("N")) {
				
// print to console message as the user does not wish to continue to ask questions				
				System.out.println("Thank you for playing Magic Eight Ball...goodbye.");
				
// exit program				
				System.exit(1);
			}
// close else if 			

// else statement with default error message of invalid data when either Y or N was not entered via the console			
			else {
				
// print to console error message with invalid data				
				System.out.println("Invalid data: You did not respond either Y or N. Goodbye...");
				
// exit program				
				System.exit(1);
			}
// close else			
		}
// close while		
	}
// close method inputQuestion
	
	
	
// declare the method generateEightBallAnswers	
	public static void generateEightBallAnswers() {
		
// declare a new SecureRandom variable named randomResponse using the SecureRandom class		
		SecureRandom randomResponse = new SecureRandom();
		 
// declare the variable answer as an integer		
		 int answer;
		 
// set the variable answer's value to a random integer generated by the SecureRandom class
// start at index one and set the upper limit to 9 so that there will be no zeros generated
// and that the range of integers will be from 1-9 corresponding to the number of random Eight Ball answers listed		 
		 answer = randomResponse.nextInt(9) + 1;
		 
// print a dashed line for spacing		 
		 System.out.println("----------------------------------------------------------------------------------------------------------");
		
// switch statement listing the nine options of random answers that will be used for the Magic Eight Ball answers		 
		 switch(answer) {
		
// cases 1-9 with each case printing to console a different random response	based on the random integer generated by the SecureRandom class variable randomResponse	 
		 case 1: System.out.println("Magic Eight Ball says: This is a definite yes given the amount of bytes of memory that is allocated");						break;
		 case 2: System.out.println("Magic Eight Ball says: The great, wise and all knowing mouse says very true but you must use the Force Luke");				break;
		 case 3: System.out.println("Magic Eight Ball says: Of all the ASCII characters ever combined to form words, these have formed the answer POSITIVELY");	break;
		 case 4: System.out.println("Magic Eight Ball says: There is a possibility if you are able to code in C#");												break;
		 case 5: System.out.println("Magic Eight Ball says: The Python coding snake says this is a stretch so I can't seem to answer clearly");					break;
		 case 6: System.out.println("Magic Eight Ball says: Not sure...the glow from the flat screen display is clouding my vision");							break;
		 case 7: System.out.println("Magic Eight Ball says: There is no way that the operating system will allow this");										break;
		 case 8: System.out.println("Magic Eight Ball says: The compiler says, \"Absolutely not!\"");															break;
		 case 9: System.out.println("Magic Eight Ball says: This switch statement has no break...no way");														break;
// no default is needed because the random integers generated will always be within the 1-9 range				 
		 }
// close switch statement		 
	}
// close generateEightBallAnswers method	
}
// close class MagicEightBall
