package Star_Pattern;

//Output - 	right Pascal's triangle
			// *
			// * *
			// * * *
			// * * * *            
			// * * *
			// * *
			// *

public class Star10 
{
	public static void main(String[] args)
	{
		int star=1;
		
		//For Loop For Row
		for(int i=1; i<=7; i++)
		{
			//For Lopp For Column
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			//If-Else Condition For Star Spaces Increment/Decrement
			if(i<=3)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}
}
