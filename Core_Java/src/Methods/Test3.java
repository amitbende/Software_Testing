package Methods;

public class Test3 {
	
	public static void main(String[] args) 
	{
		//step1- create object of same class
		Test3 S3 = new Test3();  //class_name object_name = new class_name();
		
		//step2- call the method from same class
		S3.m2();								//object_name.methodname();
		
		S3.m3();
		
		S3.m4();
	}
	

	//Non-Static Regular method
	public void m2()
	{
		System.out.println("This is M2 Non-Static Reguler method from test object1 class ");
	}
	

	//Non-Static Regular method
	public void m3()
	{
		System.out.println("This is M3 Non-Static Reguler method from test object1 class ");
	}
	

	//Non-Static Regular method
	public void m4()
	{
		System.out.println("This is M4 Non-Static Reguler method from test object1 class ");
	}
}
