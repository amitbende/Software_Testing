package Methods;

public class Test_Object1 {
		
		//Non-Static Regular method call from same class
		public static void main(String[] args)
		{
			//step1- create object of same class
			Test_Object1 S1 = new Test_Object1();  //class_name object_name = new class_name();
			
			//step2- call the method from same class
			S1.m1();								//object_name.methodname();
		}
		
		//Non-Static Regular method
		public void m1()
		{
			System.out.println("This is M1 Non-Static Reguler method from test object1 class ");
		}
}
