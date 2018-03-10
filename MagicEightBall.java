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

 
public class MagicEightBall {

	public static void main(String[] args) {
		
		
		inputQuestion();
		
		generateEightBallAnswers();
		
		keepGoing();
		
		
		
		
		 
	}
	
	public static String inputQuestion() {
		
		
		
		String question = "";
		
		System.out.println("Enter your question for the Magic Eight Ball: ");
		
		Scanner input = new Scanner(System.in);
		
		question = input.nextLine();
		
		
		
		return question;
		
	}
	
	
	public static void generateEightBallAnswers() {
		
		SecureRandom randomResponse = new SecureRandom();
		 
		 int answer;
		 
		 answer = randomResponse.nextInt(9) + 1;
		 
		 System.out.println("----------------------------------------------------------------------------------------------------------");
				
		 switch(answer) {
		
		 case 1: System.out.println("Magic Eight Ball says: This is a definite yes given the amount of bytes of memory that is allocated");						break;
		 case 2: System.out.println("Magic Eight Ball says: The great, wise and all knowing mouse says very true but you must use the Force Luke");				break;
		 case 3: System.out.println("Magic Eight Ball says: Of all the ASCII characters ever combined to form words, these have formed the answer POSITIVELY");	break;
		 case 4: System.out.println("Magic Eight Ball says: There is a possibility if you are able to code in C#");												break;
		 case 5: System.out.println("Magic Eight Ball says: The Python coding snake says this is a stretch so I can't seem to answer clearly");					break;
		 case 6: System.out.println("Magic Eight Ball says: Not sure...the glow from the flat screen display is clouding my vision");							break;
		 case 7: System.out.println("Magic Eight Ball says: There is no way that the operating system will allow this");										break;
		 case 8: System.out.println("Magic Eight Ball says: The compiler says, \"Absolutely not!\"");															break;
		 case 9: System.out.println("Magic Eight Ball says: This switch statement has no break...no way");														break;
		
		 }
	}
	
	
	
public static String keepGoing() {
		
		
		
		String keepGoing = "";
		
		System.out.println("Do you want continue asking the Magic Eight Ball questions Y or N?: ");
		
		Scanner input = new Scanner(System.in);
		
		keepGoing = input.nextLine();
		
		return keepGoing;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
// close class MagicEightBall
