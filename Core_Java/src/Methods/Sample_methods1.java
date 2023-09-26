package Methods;

public class Sample_methods1 
{
	public static void main(String[] args)
	{
		//method_name();
		addition();
		addition();
		addition(20, 30);
		addition(40,50,60);
		addition(70,80,90);
	}
	
	//static regular method without parameters
	public static void addition()
	{
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		System.out.println("Addition of a and b is:" + sum);
	}
	
	//static regular method with 2 parameter
	public static void addition(int c, int d) 
	{
		int sum1 = c + d;
		System.out.println("Addition of a And b is:"+ sum1);
	}
	
	//static regular method with 3 parameter
	public static void addition(int e, int f, int g) 
	{
		int sum2 = e + f + g;
		System.out.println("Addition of a And b is:"+ sum2);
	}
	
}
