package Constractor;

public class class2 {
	
	//Use-I: Initialization of an object
	//Default Constructor-->Provided by Compiler	
	//Test2(){}
	
	public static void main(String[] args) 
	{
		//Step-I: Create object of same class
		class2 T2=new class2();
		
		//Step-II: Call the method
		T2.multiplication();	
	}
	
	public void multiplication() 
	{
		int a=10;
		int b=20;
		
		int  mulvalue=a*b; 				//200
		
		System.out.println(mulvalue);   //200
	}
}
