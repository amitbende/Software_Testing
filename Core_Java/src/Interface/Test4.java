package Interface;

public class Test4 implements Test3
{
   //Implementation Class

	
	//void m1(); ---> Test1
	
	//void m1(); ---->Test2  
	
	
	public void m1() 
	{
		System.out.println("Hi");                      
	}
	
	
	public static void main(String[] args) 
	{
		Test4 T4=new Test4();
		
	     	T4.m1();
		
	}
	
	
	
}
