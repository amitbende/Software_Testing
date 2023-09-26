package Practice_Task_Logical;

public class Reverse_Number 
{
	 public static void main(String[] args) 
	 {
		int org=1234;  		//4321
		int rev=0;  		//4321
		
		for(int i=org;        i>0;         i=i/10) 
		{
			int rem  = i % 10;
			rev = rev*10  + rem;   //4321
		}
		System.out.println(rev);
	 }
}
