package Control_Statments;

public class Test3 {
	
	public static void main(String[] args) 
	{	
		   int marks=68;
		
		   //68>=65---->true
		if(marks>=65) 
		{
			System.out.println("Distinction");
		}
		else if(marks>=60) 
		{
			System.out.println("First Class");
		}
		else if(marks>=55) 
		{
			System.out.println("Higher Second Class");
		}
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
