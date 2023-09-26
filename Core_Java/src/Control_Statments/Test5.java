package Control_Statments;

public class Test5 {
	
	public static void main(String[] args) 
	{	
		int marks=14;
		
		//14>=65-->false
		if(marks>=65) 
		{
			System.out.println("Distinction");
		}
		//14>=60-->false
		else if(marks>=60) 
		{
			System.out.println("First Class");
		}
		//14>=55-->false
		else if(marks>=55) 
		{
			System.out.println("Higher Second Class");
		}
		//14>=50-->false
		else if(marks>=50) 
		{
			System.out.println("Second Class");
		}
		//14>=35-->false
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
