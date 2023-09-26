package Arrays;

public class Test4 
{
	public static void main(String[] args) 
	{
		//Step-I: Array Declaration	
		int[] ar1=new int[3];
		
		//Step-II: Array Initialization
		ar1[0]=20;
		ar1[1]=30; 
		ar1[2]=10;
		
		//Step-III: Usage
		//i=0          //0<=2              1
		               //1<=2              2
		               //2<=2              3
		               //3<=2
		 for(int i=0;  i<=ar1.length-1;   i++) 
		 {
		    	            	   //2
			 System.out.println(ar1[i]);   //20   //30    //10
		 }		
	}
}
