package Inheritance;

public class Single_Son extends single_Father
{
	//Sub-Class/Child Class
	//Car() Money() Home()
	public void Mobile()
	{
		System.out.println("Samsung A50");
	}
	
	public static void main(String[] args) 
	{
		//Create Object Of Son Class
		Single_Son S1=new Single_Son();
        
        S1.Car();
        S1.Money();
        S1.Home();
        S1.Mobile();		
	}
}
