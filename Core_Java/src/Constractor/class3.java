package Constractor;

public class class3 {
	
	//Use-I: Initialization of an object
	//Use-II: Initialization of Non-static global variable
	//Step-I: Variable Declaration
	
	int a; 									//10         //Non-static global Variable 
	int b;  								//20         //Non-static global Variable
	
	//Step-II: Variable Initialization	
	 class3()                  				//User Defined constructor
     {
    	 a=10;
    	 b=20;
     }    

	//Step-III: Usage
	public void addition() 
	{
		 int Sum1=a+b; 						//30
		 System.out.println(Sum1); 			//30	
	}
	      
	public static void main(String[] args) 
	{
		//Create object of same class
		class3 T3=new class3();
		   
		//Call the method  
		T3.addition();	
	}     
}
