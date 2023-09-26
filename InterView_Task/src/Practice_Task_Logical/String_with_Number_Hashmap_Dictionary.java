package Practice_Task_Logical;

import java.util.HashMap;
import java.util.Set;

public class String_with_Number_Hashmap_Dictionary 
{
	public static void main(String[] args) 
	{
		String org="abcbcabd";  //a=?  b=? c=?  d=?   //a(0)    d(7)
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		     
		     //i=0          0<=7                   1
		                  //1<=7                   2
		                  //2<=7                   3
		                  //3<=7                   4
		                  //4<=7                   5
		                  //5<=7                   6
		                  //6<=7                   7
		                  //7<=7                   8
		                  //8<=7
		for(int i=0;     i<=org.length()-1;       i++)
		{                     
					//d            //7
			 char charvalue=org.charAt(i);  //d
			      
			    //                //d
			 if(mp.containsKey(charvalue)) //false
			 {                  
				 mp.put(charvalue, mp.get(charvalue)+1);
			 }    
			 else 
			 {            //d
				 mp.put(charvalue, 1);
			 }    
		}
		
		Set<Character> keys = mp.keySet();  //a b c d
		           
			          //d
		for(Character key  : keys)  //a     b     c   d   
		{   
			                   //d   :   1     //d
			System.out.println(key +":"+ mp.get(key));  	//1
		}	
	}
}
