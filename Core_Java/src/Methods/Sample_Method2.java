package Methods;

public class Sample_Method2 {
	
	public static void main(String[] args)
	{
		addition(10,20);
		
		Sample_Method2 S2 = new Sample_Method2();
		S2.addition(30, 40, 50);
	}
	
	//Static Regular Method
	public static void addition(int x, int y)
	{
		int Sum2 = x + y;
		System.out.println("Addition of X and Y is:" + Sum2);
	}
	
	//Non-Static Regular Method
	public void addition(int x, int y, int z)
	{
		int Sum3 = x + y + z;
		System.out.println("Addition of X, Y and Z is:" + Sum3);
	}
}
