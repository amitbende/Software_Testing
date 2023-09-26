package Constractor;

public class Class4 {
	
	//Use-I: Initialization of an object
	//Use-II: Initialization of Non-static global variable
	//Step-I: Variable Declaration
	
	int X;  									//50   //non-static global Variable
    int Y; 										//60   //non-static global Variable
     
    String Studentname; 						//AMIT //non-static global Variable
    
	//Step-II: Variable Initialization	
    Class4()   									//User Defined constructor-->Zero Parameter
    {
    	X=20;
    	Y=40;
    }
            //50    //60
    Class4(int a, int b) 						//User Defined constructor-->2 int Parameter
    {
    	X=a; 					//50
    	Y=b;  					//60
    }
                  //AMIT
    Class4(String Sname)  						//User Defined constructor-->String parameter
    {
   	 Studentname=Sname; 						//AMIT
    } 
	         
	//Step-III: Usage
	public void addition() 
	{
		int  add1=X+Y;  						//110
		System.out.println(add1); 				//110
	}
	
	public void m1() 
	{
		System.out.println(Studentname); 		//AMIT
	}
	
	public static void main(String[] args) 
	{
		//Create object of same Class
		Class4 T4=new Class4();
		T4.addition(); 							//60
		    
		//Create object of Same Class
		Class4 T5=new Class4(50,60);
		T5.addition(); 							//110
		
		//Create object of Same Class      
		Class4 T6=new Class4("AMIT");
		T6.m1();  								//AMIT	      
	}
}
