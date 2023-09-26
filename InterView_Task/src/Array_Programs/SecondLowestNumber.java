package Array_Programs;

import java.util.Arrays;

public class SecondLowestNumber 
{
	 public static void main(String[] args) {
	        int[] arr = {1, 5, 3, 2, 7, 4, 8, 6};
	        int secondLowest = findSecondLowest(arr);
	        System.out.println("Second lowest number: " + secondLowest);
	    }

	    public static int findSecondLowest(int[] arr) {
	        Arrays.sort(arr); 								// Sort the array in ascending order
	        return arr[1]; 									// Return the element at index 1 (second lowest)
	    }
}
