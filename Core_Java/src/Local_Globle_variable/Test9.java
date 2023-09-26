package Local_Globle_variable;

public class Test9 {
	
	int b=20;             //Non-Static global Variable
	public static void main(String[] args) 
	{
		//Step-I:Create Object of same class
		Test9 T9=new Test9();   		   //class_name object_name=new class_name();
		
		//Step-II: Call the Variable
		System.out.println(T9.b);  			//objectname.variablename;	
	}
	
	public static void m2() 
	{
	//Step-I:Create Object of same class
	Test9 T10=new Test9();	  				//class_name object_name=new class_name();
			
	//Step-II: Call the Variable
	System.out.println(T10.b); 				//objectname.variablename;
		
	}
	
	public void m1() 
	{
		System.out.println(b);   			//Variable_name
	}

}
