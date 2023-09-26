package Practice_Task_Logical;

public class Multi_Without_Multi 
{
	public static void main(String[] args) 
	{
		int num1=5;
		int num2=2;
		int sum=0; //10
		
			   	//i=1      1<=5       2
			             //2<=5       3
			             //3<=5       4
			             //4<=5       5
						 //5<=5       6
			             //6<=5
		for(int i=1;      i<=num1;   i++) 
		{
			sum= sum + num2;  	//10
		}
		System.out.println(sum);
	}
}
