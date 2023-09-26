package Arrays;

public class Test6 
{
	public static void main(String[] args) 
	{
		//Step-I: Array Declaration	
	    char[]	ar2=new char[5];
		
		//Step-II: Array Initialization
	    ar2[0]='A';
	    ar2[1]='B';
	    ar2[2]='C';
	    ar2[3]='d';
	    ar2[4]='E';
		
		//Step-III: Usage
			  //i=0      //0<=4              1
		                 //1<=4              2
		                 //2<=4              3
		                 //3<=4              4
		                 //4<=4              5
	                     //5<=4
	     for(int i=0;    i<=ar2.length-1;   i++) 
	     {                      
	    	                     //4
		   System.out.println(ar2[i]);            //A  B  C  d E
	     }
	}
}
