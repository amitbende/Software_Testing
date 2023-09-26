package Star_Pattern;

//Output- 	//* * * *
		  	//  * * *
			//    * *
			//      *

public class Star7 
{
	public static void main(String[] args)
	{
		int space=0;
		int star=4;
		
		//For Loop For Row
		for(int i=1;i<=4;i++)
		{
			//For Loop For COlumn Spaace
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
			
			space++;
			star--;
		}
	}
}
