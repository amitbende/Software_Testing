package Practice_Task_Logical;

import java.util.Arrays;

public class ArraySort 
{
	public static void main(String[] args) 
	{
		// Define an array of integers
		int[] numbers = {5, 2, 9, 1, 5, 6};

		// Sort the array in ascending order
		Arrays.sort(numbers);

		// Print the sorted array
		System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
	}
}

