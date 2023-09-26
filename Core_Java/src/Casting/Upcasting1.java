package Casting;

public class Upcasting1 
{
	public static void main(String[] args) 
	{
		//Create Object of Subclass and provide reference of Superclass(Up_casting)
		Father1 S1=new Son1();
		S1.Car();
		S1.Home();
		S1.Money();
	}
}
