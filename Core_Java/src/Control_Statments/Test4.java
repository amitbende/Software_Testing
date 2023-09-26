package Control_Statments;

public class Test4 {
	
	public static void main(String[] args) 
	{	
		int marks=52;
		
		//52>=65-->false
		if(marks>=65) 
		{
			System.out.println("Distinction");
		}
		//52>=60-->false  
		else if(marks>=60) 
		{
			System.out.println("First Class");
		}
		
		//52>=55-->false
		else if(marks>=55) 
		{
			System.out.println("Higher Second Class");
		}
		//52>=50-->true
		else if(marks>=50) 
		{
			System.out.println("Second Class");
		}
		
		else if(marks>=35) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
