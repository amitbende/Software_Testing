package Local_Globle_variable;

public class Test5 {
	
	//Non-static Global variable call from same class
    int c=30;    									//Non-Static/Instance Global variable
	public static void main(String[] args) 
	{
		//Step-I:Create object of same class
		 Test5  S1=new  Test5();       				//class_name object_name=new class_name();
		
		//Step-II:Call the variable
		 System.out.println(S1.c);               	//objectname.variablename
	}
}
