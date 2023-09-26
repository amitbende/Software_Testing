package Practice_Task_Logical;

public class White_spaces 
{
	public static void main(String args[])
	{
		String org = "ab c d ef";
		int Count = 0;
			    //i=0       //0<=9                    1
			                //1<=9                    2
			                //2<=9                    3
			                //3<=9                    4
			                //4<=9                    5
			                //5<=9                    6
			                //6<=9					  7
							//7<=9					  8
							//8<=9					  9
							//9<=9                    10
							//10<=9  (false)
		for(int i=0;     i<=org.length()-1;      	i++) 
		{
			char  Charvalue = org.charAt(i);  
		     if(Charvalue==' ')
		     {
		    	 Count++;
		     }
		}
		System.out.println("White Spaces:"+Count);
	}
}
