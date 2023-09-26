package Practice_Task_Logical;

import java.util.Arrays;

public class SecondLowestNumber 
{
	public static void main(String[] args) 
	 {
		 int[] numbers = {5, 2, 9, 1, 5, 6};
	     Arrays.sort(numbers);
	     int secondLowest = numbers[1];
	     System.out.println("Second Lowset number: " + secondLowest);
	 }
}
