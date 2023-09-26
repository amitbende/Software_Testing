package Control_Statments;

public class If_User_pwd {
	
	public static void main(String[] args) 
	{	
		String UN="abc";
		
		String PSW="xyz";
		
		if("abc"==UN) 									//abc==abc-->true
		{	
			System.out.println("Correct UN");
			
			if("xyz"==PSW) 								//xyz==xyz-->true
			{
				System.out.println("Correct Password");
			}
			else 
			{
				System.out.println("Wrong Passwod: Login Failed");
			}		
		}
		else 
		{
			System.out.println("Wrong UN:Login Failed");
		}	
	}
}
