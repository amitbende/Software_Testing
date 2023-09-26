package Array_Programs;

import java.util.Arrays;

public class SecondHighestNumber 
{
	 public static void main(String args[])
	{
		int array[] = {10, 20, 25, 63, 96, 57};
   		int size = array.length;
   		Arrays.sort(array);
   		System.out.println("sorted Array :"+Arrays.toString(array));
   		int res = array[size-2];
   		System.out.println("second largest element is :"+res);
	}
}
