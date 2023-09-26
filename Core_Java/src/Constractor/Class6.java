package Constractor;

public class Class6 {
	
	//Calling of Constructor
	Class6()
	{
		this(10);
	}
		
	Class6(int a)  
	{
		System.out.println(a); 					//10
		System.out.println("Hi");
	}
		
	Class6(String Sname)
	{
			
	}
		
	Class6(char Sgrade)
	{
			
	}
		
	public static void main(String[] args)
	{
		Class6 C6 = new Class6();	
	}

}
