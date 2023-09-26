package Control_Statments;

public class Test7 {
	
	public static void main(String[] args) 
	{	
		int marks=61;
		
		//61>=65---->False 
		if(marks>=65) 
		{
			System.out.println("Distinction");
		}
		//61>=60-->true
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
