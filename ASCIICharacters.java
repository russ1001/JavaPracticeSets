

// declare the ASCIICharacters class
public class ASCIICharacters {

// declare the main method	
	public static void main(String[] args) {
		
		
		char asciiChar;
		String asciiFullSet = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\r\n" + 
				"";
		
		int counter = 0;
		
		System.out.println("List of ASCII characters");
		System.out.println("-------------------------");
		
		
		for(int i = 0; i<=asciiFullSet.length()-1; i++) {
		
			System.out.print(asciiFullSet.charAt(i) + " ");	
			
			counter++;
			
			if((counter % 10) == 0 )
				
				System.out.println();
			
			
		}
				
				
				
				
		
			
		}
		
	}
	
