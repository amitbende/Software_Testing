package Casting;

public class Son1 extends Father1
{
	//Sub class
	//Car()   Money()   Home()
	public void Mobile()                          // method Declaration
	{
		System.out.println("Samaung A50");        //Method definition/implementation
	}
	
	//Overridden Method
	public void Car()                            // method Declaration
	{
		System.out.println("Kia Seltos");        //Method definition/implementation
	}
	
	//Overridden Method
	public void Money()                          // method Declaration
	{
		System.out.println("3 Lakhs");           //Method definition/implementation
	}
	
	//Overridden Method
	public void Home()                          // method Declaration
	{
		System.out.println("3 BHK");            //Method definition/implementation
	}
}
