package Methods;

public class Test4 {
	
		//2. Non-Static Regular Method call from different  class
		public static void main(String[] args) 
		{
			//Step-I:Create object of different Class
			Test5  S4=new Test5();             		//Classname objectname=new Classname();
			
			
			//Step-II:Call the Method
			     S4.m5();                           //Objectname.methodname();
		}

}
