package Star_Pattern;

//Output - pyramid star pattern
		//    	*
		//    * * * 			
		//	* * * * *
		//* * * * * * *


public class Star8 
{
	public static void main(String[] args)
	{
		int space=3;
		int star=1;
		
		//For Loop For Row
		for(int i=1;i<=4;i++)
		{
			//For Loop For Column Space
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			
			//For Loop For Column Star
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space--;
			star=star+2;
		}
	}
}
