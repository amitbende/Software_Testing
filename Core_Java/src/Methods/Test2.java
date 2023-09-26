package Methods;

public class Test2 {
	
		public static void main(String[] args) 
		{
			//step1- create object of same class
			Test2 S2 = new Test2();  //class_name object_name = new class_name();
			
			//step2- call the method from same class
			S2.m2();								//object_name.methodname();
			
			S2.m3();
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
}
