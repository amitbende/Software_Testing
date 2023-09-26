package Interface;

public class Sample2 implements Sample1
{
	//Implementation class
	
		// final public static int a=10;
		
		//abstract public void m1();
		
		//abstract public void m2();
		
		
		public void m1()                     //method Declaration
		{
	System.out.println("Hi");   //method Definition/Implementation
		}
		
		
		 public void m2()     //method Declaration
		 {
	System.out.println("Hello");//method Definition/Implementation
		 }
		
		
		 
		 public static void main(String[] args) 
		 {
			 Sample2 S2=new Sample2();
			
			 	S2.m1();
			 	S2.m2();
		}

}
