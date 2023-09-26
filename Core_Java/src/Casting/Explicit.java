package Casting;

public class Explicit 
{
	public static void main(String[] args) 
	{
		double b=2.5;     //8 byte
		System.out.println(b);
		
		int	a=(int)b;       //4 byte
		System.out.println(a);
	}
}
