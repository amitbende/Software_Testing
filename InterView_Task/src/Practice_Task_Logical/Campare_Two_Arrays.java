package Practice_Task_Logical;

import java.util.Arrays;

public class Campare_Two_Arrays 
{
	public static void main(String[] args)
	{
		
		int ar1[]= {10,20,30};
		
		int ar2[]= {40,50,60};
		
		int ar3[]= {40,50,60};
		
		System.out.println(Arrays.equals(ar1,ar2));		//false
		
		System.out.println(Arrays.equals(ar2, ar3)); 	//true
		
		System.out.println(Arrays.equals(ar3, ar1)); 	//false
	}
}
