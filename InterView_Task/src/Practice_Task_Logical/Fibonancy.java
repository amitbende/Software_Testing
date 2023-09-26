package Practice_Task_Logical;

public class Fibonancy 
{
	 // 0  1  1  2  3  5  8.......
	 public static void main(String[] args) 
	 {
		int a=0;  //5
		int b=1;  //8		
		int c;
		
	          //i=1     1<=5          2
	                 	//2<=5        3
	                 	//3<=5        4
	                 	//4<=5        5
	                 	//5<=5        6
	                 	//6<=5
		for(int i=1;     i<=10;      i++) 
		{
			c=a+b;  				//8
			System.out.println(c);  //8
		
			a=b;  					//5
			b=c;  					//8
		}
	 }
}
