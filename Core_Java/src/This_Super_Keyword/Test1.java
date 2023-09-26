package This_Super_Keyword;

public class Test1 extends Test2
{
	//Sub Class/ Child Class
	//int a=40;
		
	int a=20;
	int b=30;

	public void m1() 
	{
		int a=10;
		
		System.out.println(a);  			//10
		
		System.out.println(a);  			//10
		
		System.out.println(this.a);  		//20   //this.variablename
				
		System.out.println(b);  			//30
				
		System.out.println(this.b);  		//30    //this.variablename
				
		System.out.println(this.a); 		//20
				
		System.out.println(super.a);  		//40   //super.variablename
				
	}
	
	public static void main(String[] args) 
	{
		Test1 T1=new Test1();
		T1.m1();	
	}
}
