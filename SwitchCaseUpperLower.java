// import java utility class by using the * wildcard callout

import java.util.*;

 

public class SwitchCaseUpperLower {

 

       public static void main(String[] args) {

      

             Scanner input = new Scanner(System.in);

             

             String caseSwitch = ""; 
             int dataLength = 0;
             char convertC;
             String result = "";
             
             

            

            

             System.out.println("Enter the three character string: ");

             caseSwitch = input.next();
             
             input.close();

             dataLength = caseSwitch.length();

            

             for(int i = 0; i < (caseSwitch.length()); i++) {

             char currentChar = caseSwitch.charAt(i);
             
             if(Character.isUpperCase(currentChar)) {
            	 
            	 char currentCharToLowerCase = Character.toLowerCase(currentChar);
            	 result = result + currentCharToLowerCase;
            	 
             }
             else {
            	 
            	 char currentCharToUpperCase = Character.toUpperCase(currentChar);
            	 result = result + currentCharToUpperCase;
             }
            
             

             }
             System.out.println(result);
       }
}

            

            
    
         