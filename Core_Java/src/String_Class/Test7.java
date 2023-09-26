package String_Class;

public class Test7 
{
	public static void main(String[] args) 
	{	
		StringBuffer S3=new StringBuffer("velocity");	
		StringBuffer S4=new StringBuffer("velocity");
		
		//== Operator is used for reference comparison
		System.out.println(S3==S4);									//false
		
		//.equals() method is used for Reference comparison
		System.out.println(S3.equals(S4)); 							//false	
	}
}
