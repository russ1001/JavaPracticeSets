/* Bubble sort is an algorithm that compares adjacent items and swaps those out of order
 * not an efficient sort method
 * 
 * compare the 0 and 1st items cells
 * swap if out of order
 * 
 * compare 1st and 2nd items cells
 * swap if out of order
 * 
 * continue
 * 
 * use temp to swap
 *  
 *  
 *  Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes

Stable: Yes

Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements)
in almost-sorted arrays and fix it with just linear complexity (2n). 
For example, it is used in a polygon filling algorithm, 
where bounding lines are sorted by their x coordinate at a specific scan line 
(a line parallel to x axis) and with incrementing y their order changes 
(two elements are swapped) only at intersections of two lines 
 * 
 */



public class BubbleSort {

	void bubbleSort(int arr[])
    {
        
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	
	
	
	
	public static void main(String[] args) {
		
		BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted array");
        
        for(int i=0;i<arr.length; i++) {
        	
        	System.out.print(arr[i] + " ");
        }
        
        
        ob.bubbleSort(arr);
        System.out.println("\nSorted array");
        ob.printArray(arr);
		
		
	}
	
}
