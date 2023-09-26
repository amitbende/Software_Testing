package Star_Pattern;

//Output - Dimond Pattern
		//    *
		//   * *
		//  * * *
		// * * * *
		//  * * *
		//   * *
		//    *

public class Star12 
{
	public static void main(String[] args)
	{
		int space=3;
		int star=1;
		
		//For Loop For Row
		for(int i=1;i<=7;i++)
		{
			//For Loop For Column Space
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			
			//For Loop For Column Star
			for(int b=1;b<=star;b++)
			{
				System.out.print("*"+" ");	
			}
			System.out.println();
			
			//If-Else Condition For Star Spaces Increment/Decrement
			if(i<=3)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		}
	}
}
