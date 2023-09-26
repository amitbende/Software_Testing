package Methods;

public class Test6 {
	
	//2. Non-Static Regular Method call from different  class
	public static void main(String[] args) 
	{
		//Step-I:Create object of different Class
		Test7  S6=new Test7();             		//Classname objectname=new Classname();
		
		
		//Step-II:Call the Method
		     S6.m6();                           //Objectname.methodname();
		     S6.m7(); 
		     S6.m8(); 
		     S6.m9(); 
	}
}
