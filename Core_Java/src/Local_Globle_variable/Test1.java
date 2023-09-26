package Local_Globle_variable;

public class Test1 {
	
	public static void m1(int c)   			//Local Variable
	{
		int a=10;                 			//Local Variable
		System.out.println(a); 				//10
		
		int b=20;                 			//Local Variable
		System.out.println(b); 				//20
		
		int  Sum1=a+b+c;  					//10+20+30
		System.out.println(Sum1);			//60	
	}
	
	public static void main(String[] args) 
	{
		m1(30);
	}
}
