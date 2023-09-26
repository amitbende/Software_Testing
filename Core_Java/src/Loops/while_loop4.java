package Loops;

public class while_loop4 {
	
	//Print no's from 1 to 5---->1,2,3,4,5
	public static void main(String[] args) 
	{
		//i=1
		int i=1;    					//Starting Condition
		do 
		{
			System.out.println(i); 		//1   2   3  4  5
			//i=6
			i=i+1;        				//Increment/ Decrement
		}  
		while(i<=5);   					//6<=5         //end condition
	}
}
