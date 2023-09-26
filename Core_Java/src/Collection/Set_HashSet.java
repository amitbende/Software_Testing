package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		//Add information
		hs.add("Amit");
		hs.add(100);	
		hs.add('A');
		hs.add(60.25f);
		hs.add(100);  //Duplicate
		hs.add(null);
		hs.add(null); //Duplicate
		
		System.out.println(hs);
		
		//Verify HashSet is empty or not
		System.out.println(hs.isEmpty());  			//false

		//Size
		System.out.println(hs.size());				//5
		
		//verify information is present or not
		System.out.println(hs.contains("Amit")); 	//true
		
		//remove information
		hs.remove('A');
		System.out.println(hs);
		
		
		System.out.println("----For each loop----");	
		for(Object S1:hs) 							//key(5)-->null
		{
			System.out.println(S1); 				//Rahul  100  60.25 null
		}
					 
		System.out.println("----iterator Curser----");	

		Iterator itr=hs.iterator();
		while(itr.hasNext()) 						//key(6)-->    -->false
		{
			System.out.println(itr.next()); 		//Rahul 100  60.25 null
		}	
	}
}
