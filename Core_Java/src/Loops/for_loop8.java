package Loops;

public class for_loop8 {
	
	//Print no's from 3 to 1---->3,2,1
	public static void main(String[] args) 
	{
		      //i=3       3>=1         2
		                 //2>=1        1
		                //1>=1         0
		                //0>=1
		for(int i=3;      i>=1;       i--) 				//i=i-1-->i--
		{	
			System.out.println(i);  					//3  2   1
		}
	}
}
