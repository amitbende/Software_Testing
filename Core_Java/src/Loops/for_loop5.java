package Loops;

public class for_loop5 {
	
	//Print odd no's from 1 to 7---->1,3,5,7
	public static void main(String[] args) 
	{
		      //i=1   1<=7     i=3 
		             //3<=7    i=5
		             //5<=7    i=7
		             //7<=7    i=9
		             //9<=7
		for(int i=1;   i<=7;   i=i+2) 
		{
			System.out.println(i);                  //1   3   5   7
		}
	}
}
