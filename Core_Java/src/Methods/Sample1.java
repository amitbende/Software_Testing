package Methods;

public class Sample1 {
	
	public static void main(String[] args) 
	{
		//1.Static regular method Call from same Class
			m1();                				//method_name();
		
		//2. Non-Static Regular Method call from same class
	    //Step-I:Create object Same Class   
				
			Sample1  S1=new Sample1();			//Class_name object_name=new Class_name();
  
		//Step-II:Call the method
				
			S1.m2();     						//Objectname.methodname();

		         
		//3.Static regular method Call from different/another Class  
				
			Sample2.m3();    					//Classname.methodname();
     
		         
		//4. Non-Static Regular Method call from different  class
		//Step-I:Create object different Class   
				
			Sample2  S2=new  Sample2();   		//Class_name object_name=new Class_name();
		    
		//Step-II:Call the method
				
			S2.m4();   							//Objectname.methodname();
	}
	
			//Static Regular method
			public static void m1() 
			{
				System.out.println("Method m1 is running from Same Class");
			}
			
			//Non-Static Regular Method
			public void m2() 
			{
				System.out.println("Method m2 is running form same class");
			}

}
