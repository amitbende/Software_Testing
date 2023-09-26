package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		//Add information
		lhs.add("Amit");
		lhs.add(100);
		lhs.add('A');
		lhs.add(60.25f);
		lhs.add(100);  			//Duplicate
		lhs.add(null);
		lhs.add(null); 			//Duplicate
		
		System.out.println(lhs);
		
		//Verify LinkedHashSet is empty or not
		System.out.println(lhs.isEmpty());  	//false
		
		//Size
		System.out.println(lhs.size());			//5
		
		//verify information is present or not
		System.out.println(lhs.contains('A')); 	//true
		
		
		//remove information
		lhs.remove('A');
		System.out.println(lhs);
		
		
		System.out.println("----For each loop----");
		
		for(Object S1:lhs) 					//key(5)-->null
		{
			System.out.println(S1); 		//Amit 100 A 60.25 null
		}
		 
		System.out.println("----iterator Curser----");	
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) 				//key(6)-->  -->false
		{
			System.out.println(itr.next()); //Amit  100  60.25  null
		}						
	}
}
