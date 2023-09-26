package Arrays;

public class Test9 
{
	public static void main(String[] args)
    {		
		//Multi_dimensional Array		
	    	   //0    1     2
		//0     10    20    30
		//1     40    50    60
	
		//Step-I: Array Declaration	
	    int[][]  M1=new  int[2][3];
	
		//Step-II: Array Initialization
	    M1[0][0]=10;
	    M1[0][1]=20;
	    M1[0][2]=30;
	    M1[1][0]=40;
	    M1[1][1]=50;
	    M1[1][2]=60; 
	    
		//Step-III: Usage
	    //For loop for Rows(Outer For loop)
	    		//i=0    0<=1       1
	                    //1<=1      2
	                    //2<=1
	    for(int i=0;    i<=1;      i++) 
	    {
	    	//For loop for Columns(Inner For loop)
	             //a=0       0<=2       1
	    	                //1<=2      2
	    	                //2<=2      3
	    	                //3<=2
	    	for(int a=0;     a<=2;      a++)
	    	{ 		              //1  2
	    		System.out.print(M1[i][a] + " ");    		//for row and column write print insted of println	    		                                 
	    	}
	    	System.out.println();	
	    }
    }	
}
