package Casting;

public class Upcasting 
{
	public static void main(String[] args) 
	{
		//Create Object of Subclass and provide reference of Superclass(Up_casting)
		Father S1=new Son();
		S1.Car();
		S1.Home();
		S1.Money();	
	}
}
