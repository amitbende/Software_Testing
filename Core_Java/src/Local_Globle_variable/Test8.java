package Local_Globle_variable;

public class Test8 {
	
    static int a=10;             //static global Variable
	public static void main(String[] args) 
	{
		System.out.println(a);   //variable_name
	}
	
	public void m1() 
	{
		System.out.println(a);   //variable_name
	}
	
	public static void m2() 
	{
		System.out.println(a);    //variable_name
	}

}
