package Practice_Task_Logical;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		String org_name = "AMIT";
		String rev_name = "";
		
		for(int i=org_name.length()-1;  i>=0;  i--) 
		{
			rev_name = rev_name + org_name.charAt(i);
		}
		System.out.println(rev_name);
	}
}
