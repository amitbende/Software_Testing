package String_Class;

public class Test4 
{
	public static void main(String[] args) 
	{
		//String objects are immutable in nature/can’t be changed
		String S1=new String("Velocity");
		
		S1.concat("Classes");  									//VelocityClasses
		
		System.out.println(S1);									//Velocity
	}
}
