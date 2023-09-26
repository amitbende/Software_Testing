package Loops;

public class while2 {
	
	//Print even no's from 2 to 10---->2,4,6,8,10
	public static void main(String[] args) 
	{     
		//i=2
		int i=2;                    	//Starting condition
		  	//2<=10
		    //4<=10
		    //6<=10
		    //8<=10
		    //10<=10
		    //12<=10
		while(i<=10)                    //end condition
		{
			System.out.println(i);    	//2 4 6 8 10
			//i=12
			i=i+2;       				//Increment/ Decrement	
		}	
	}
}
