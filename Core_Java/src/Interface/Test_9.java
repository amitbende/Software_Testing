package Interface;

public class Test_9 implements Version_9
{
	//Implementation Class
	
	//m1()   m2()
	
	public void m1() 
	{
Version_9.super.m1();    //interfacename.super.methodname();
		
	}
	
	public void m2() 
	{
Version_9.super.m2();  //interfacename.super.methodname();
	}
	
	
	public static void main(String[] args) 
	{
		Test_9 T9=new Test_9();
		   T9.m1();
		   
		   T9.m2();
		
	}
	
	

}

