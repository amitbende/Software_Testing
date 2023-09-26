package Practice_Task_Logical;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		int org=153;    //1^3 + 5^3 + 3^3 =153                                
		int sum=0; 		//153
		
		for(int i=org;     i>0;        i=i/10)
		{
			int  rem= i % 10;
			sum= sum + (rem*rem*rem);  //153
		}
		
		if(org==sum) 
		{
			System.out.println("Given no is an armstrong no");
		}
		else 
		{
			System.out.println("Given no is not an armstrong no");
		}
	}
}
