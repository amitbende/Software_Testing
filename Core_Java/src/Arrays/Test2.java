package Arrays;

public class Test2 
{
	public static void main(String[] args) 
	{	
		//Step-I: Array Declaration
	     String[]  Str1=new String[4];
	
	     //Step-II: Array Initialization
	     Str1[0]="Rohit";
	     Str1[1]="Virat";
	     Str1[2]="Hardik"; 
	     Str1[3]="MSD";
	
	     //Step-III: Usage
	           // i=0     0<=3              1
         				 //1<=3            2
	     				 //2<=3            3
	     				 //3<=3            4
	     				 //4<=3
	     for(int i=0;  i<=Str1.length-1;   i++) 
	     {                         //3
	    	 System.out.println(Str1[i]);           //Rohit  Virat Hardik  MSD
	     }	
	}
}
