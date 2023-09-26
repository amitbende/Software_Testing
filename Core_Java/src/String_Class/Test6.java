package String_Class;

public class Test6 
{
	public static void main(String[] args) 
	{	
		String S1=new String("velocity");       
		String S2=new String("velocity");       
		
		//== Operator is used for reference comparison
		System.out.println(S1==S2);  								//false
		
		//.equals() method is used for Content comparison
		System.out.println(S1.equals(S2));  						//true
	}
}
