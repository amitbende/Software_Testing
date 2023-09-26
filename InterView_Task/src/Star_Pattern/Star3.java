package Star_Pattern;

//Output -		//1 2 3 4
			//1   * * * *
			//2   * * * *
			//3   * * * *


public class Star3 
{
	public static void main(String[] args)
	{
		//For loop for rows=3
		for(int i=1; i<=3; i++)
		{
			//For loop for column=4
			for(int j=1; j<=4; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}



