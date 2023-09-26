package Star_Pattern;

//Output - 	//*****
			//****
			//***
			//**
			//*

public class Star5 
{
	public static void main(String[] args)
	{
		int Star=5;
		
		//For Lopp for Row 
		for(int i=1;i<=5;i++)
		{
			//For Loop For Column
			for(int a=1;a<=Star;a++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			Star--;
		}
	}
}

