package Constractor;

public class class1 {
	
	//Question: Why do we need constructor?
	//Ans:Initialisation Of an object
	
	String Cricketer; 							//Amit  //Arpit  //Ankit             
	int Runs;           						//100  //50      //60      
	
	class1(String C1,int R1)
	{
		this.Cricketer=C1;  					
		this.Runs=R1;         				
		  
		System.out.println(C1); 				
		System.out.println(R1);  				
	}
		
	public static void main(String[] args) 
	{	
		class1 C1=new class1("AMIT",100); 		//Classname objectname=new Classname();
				
		class1 C2=new class1("Arpit",50);   	//Classname objectname=new Classname();
				
		class1 C3=new class1("Ankit", 60);  	//Classname objectname=new Classname();
	}
}
