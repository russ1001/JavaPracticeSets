import java.util.*;

public class SelectionSort {
	
	// requires two loops nested

	public static void selectionSort(double[] list) {


		for(int i=0; i<list.length; i++) {

			double currentMin = list[i];
			int currentMinIndex = i;

			for(int j=i+1; j<list.length; j++) {

				if(currentMin > list[j]) {

					currentMin = list[j];
					currentMinIndex = j;

				}
			}

			if(currentMinIndex != i) {

				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	public static void main(String[] args) {

		double[] numbers = new double[5];
		for(int i=0; i<numbers.length; i++) {

			numbers[i] = Math.random() * 100;

			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		selectionSort(numbers);

		for(int i=0; i<numbers.length; i++) {


			System.out.print(numbers[i] + " ");
		}

	}
}

