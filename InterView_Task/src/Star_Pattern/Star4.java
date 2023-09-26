package Star_Pattern;


//Output -  //*
			//**
			//***
			//****

public class Star4 
{
	public static void main(String[] args)
	{
		int star=1;
		
		//For loop for Rows
		for(int i=1; i<=4; i++)
		{
			//For Loop For Column
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			star++;
		}
	}
}


