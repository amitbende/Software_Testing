package Practice_Task_Logical;

import java.util.Arrays;

public class SecondHighestArray 
{
	public static void main(String[] args) 
	 {
		 int[] numbers = {5, 2, 9, 1, 5, 6};
	     Arrays.sort(numbers);
	     int secondHighest = numbers[numbers.length - 2];
	     System.out.println("Second highest number: " + secondHighest);
	 }
}
