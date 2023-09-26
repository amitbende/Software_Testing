package Star_Pattern;

//OutPut-  	//		*
			//	  * *
			//	* * *
			//* * * *

public class Star6 
{
	public static void main(String[] args)
	{
		int space=3;
		int star=1;
		
		//For Loop For Row
		for(int i=1;i<=4;i++)
		{
			//For Loop For Space 
			for(int a=1;a<=space;a++)
			{
				System.out.print(" ");
			}
			
			//For Loop For Column
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space--;
			star++;
		}
	}
}
