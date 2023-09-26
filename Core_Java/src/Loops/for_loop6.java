package Loops;

public class for_loop6 {
	
	//Print odd no's from 7 to 1---->7,5,3,1
	public static void main(String[] args) 
	{
		      //i=7      7>=1       i=5
		                //5>=1      i=3
		                //3>=1      i=1
		                //1>=1      i=-1
		                //-1>=1
		for(int i=7;     i>=1;      i=i-2) 
		{
			System.out.println(i);                   //7  5  3  1
		}
	}
}
