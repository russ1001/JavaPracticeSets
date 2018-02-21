
public class StringDemo {



	public static void main(String[] args) {
		
		   
		
		String s = "      Welcome to Java.            ";
		String s2 = "Michael is awesome!";
		String a = "Brice";
		String b = "bob";
		String x = "Welcome to Java.";
	
		
		System.out.println(s.length());//get length of string
		System.out.println(s.charAt(11));// get character of string at index ...
		System.out.println(s + " " + s2);// concantenate using +
		System.out.println(s.concat(s2));//concantenate using concat function
		System.out.println(s.trim());// trim white space before and after string

		
		
		if(a.equals(b)) {// equals is case sensitive
				System.out.println("a and b are the same");
		}
		else {
			
			System.out.println("a and b are not the same");
		}

		
		
		
		
		
		if(a.equalsIgnoreCase(b)) {// equals is ignoring the case
			System.out.println("a and b are the same");
		}
		

	
		
		
		
		if(a.compareTo(b) < 0) {// compares two strings and returns a boolean 0 if true negative number if false. Returns alphabetical order
			System.out.println(a + "\n" + b);
		}
		else {
			System.out.println(b + "\n" + a);
		}
		
		
		
		
		if(a.compareToIgnoreCase(b) < 0) {// compares two strings ignoring case and returns a boolean 0 if true negative number if false. Returns alphabetical order
			System.out.println(a + "\n" + b);
		}
		else {
			System.out.println(b + "\n" + a);
		}
		
		
		
		if(x.startsWith("Welcome")) {//checks the beginning of the string
			
			System.out.println("Yes start");
		}
		
		
		

		if(x.endsWith("Java.")) {//checks the end of the string
			
			System.out.println("Yes end");
		}
		
		
		
		if(x.contains("to")) {//checks the string if it contains ...
			
			System.out.println("Yes contains");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
