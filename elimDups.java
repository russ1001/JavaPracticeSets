import java.util.*;
public class elimDups
{
    // main calls the other methods in the class
    public static void main(String[] args)
    {
	// always create your array here in main
        int[] num = new int[10];
        getData(num);
        System.out.println("Original data: ");
        printArray(num);
        eliminateDuplicates(num);
    }    


    // loads data into the array as the user enters it.
    public static void getData(int[] n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers, one each time you are prompted.");
        for (int i = 0; i < n.length; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            n[i] = input.nextInt();
        }
    } // end getNum method
    

    // prints each of the data items stored in the array on one line.
    public static void printArray(int[] nu)
    {
        for (int x = 0; x < nu.length; x++)
        {
            System.out.print(nu[x] + " ");
        }
        System.out.println();
    } // end printArray method
    


    // Finds the duplicates and doesn't print them.
    public static void eliminateDuplicates(int[] nm)
    {
        boolean flag = false;  // will indicate if a duplicate is found
        int value = 999;
        int index = 0;
        
        System.out.print("The distinct numbers are: ");

	// This loop goes through each cell in the array
        for (int x = 0; x <= 9; x++)
        {
            value = nm[x];     // gets the data from the current cell in the array
            flag = false;      // re-sets the flag variable

            // This loop goes through the array from cell 0 to the current cell
            // in the outer loop.
            for (int y = 0; y < x; y++)
            {
                if (value == nm[y])   // check for duplicate value
                {
                    flag = true;      // flips flag to show duplicate was found
                    break;            // breaks out of inner loop since dup was found
                } // end if
            } // end for y loop

            if (flag == false)  // if flag is still false, dup was never found
            {   
                System.out.print(value + " ");  // print value since it's not a dup
            } // end if
    
        } // end for x loop
    } // end elimnateDuplicates method
} // end elimDups class