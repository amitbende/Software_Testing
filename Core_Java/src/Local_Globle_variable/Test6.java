package Local_Globle_variable;

public class Test6 {
	
	//Non-static global variable call from diff_rent/another class
	public static void main(String[] args) 
	{
		//Step-I:Create Object of Different Class
		Test7  S2=new  Test7();   					//Class_name Object_name=new Class_name();
				
		//Step-II:Call the variable 
		System.out.println(S2.d); 					//objectname.variablename
	}				
}
