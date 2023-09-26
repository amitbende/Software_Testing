package String_Class;

public class String_Methods_Inbuilt 
{
	public static void main(String[] args) 
	{
		String S1="amit";
		String S2="";
		String S3="ABCD";
		String S4="AMIT";
		String S5="nagpur";
		String S6="abcabab";
		String S7="bende";
		String S8="Manual Classes";
		
		//To get Size/Capacity
		System.out.println(S1.length());  					//4
		
		//to verify S1,S2 are empty or not
		System.out.println(S1.isEmpty());					//false
		System.out.println(S2.isEmpty());					//true
		
		//To convert to upper_case
		System.out.println(S1.toUpperCase());				//AMIT
		
		//To convert to Lower_case
		System.out.println(S3.toLowerCase());				//abcd
		
		//To compare S1 and S4
		System.out.println(S1.equals(S4)); 					//False
		
		//To compare S1 and S4
		System.out.println(S1.equalsIgnoreCase(S4));  		//true
		
		//To compare S1 and S5
		System.out.println(S1.contains(S5));				 //false
			
		//To get character by providing index
		System.out.println(S1.charAt(0));  					//a
			
		//To verify String S1 starts with "am" 
		System.out.println(S1.startsWith("am"));			//true
		
		//To verify String S1 ends with "it"
		System.out.println(S1.endsWith("it")); 				//true
		
		//To get index of character
		System.out.println(S1.indexOf('a'));				//0
		
		//To get last index of character
		System.out.println(S6.lastIndexOf('a'));			//5
		
		//To get substring
		System.out.println(S1.substring(1, 3)); 			 //mi
		
		//To get substring
		System.out.println(S1.substring(3));				//t
		
		//To concat S1 and S7
		System.out.println(S1+S7);							//amitbende
		    //OR
		System.out.println(S1.concat(S7));					//amitbende
		
		//To replace
		System.out.println(S8.replace("Manual", "Automation"));  //Automation Classes
	}
}
