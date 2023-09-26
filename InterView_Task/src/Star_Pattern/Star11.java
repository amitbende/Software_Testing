package Star_Pattern;

//Output - Left Pascal Paterrn
			//* * * * *
			//  * * * *
			//    * * *
			//      * *
			//        *
			//      * *
			//    * * *
			//  * * * *
			//* * * * *

public class Star11 
{
	public static void main(String[] args)
	{
		int star=5;
		int space=0;
		
		//For Loop For Row
		for(int i=1;i<=9;i++)
		{
			//For Loop For Column Space
			for(int a=1;a<=space;a++)
			{
				System.out.print(" ");
			}
			
			//For Loop For Column Star
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			//If-Else Condition For Star Spaces Increment/Decrement
			if(i<=4)
			{
				space++;
				star--;
			}
			else
			{
				space--;
				star++;
			}
		}
	}
}
