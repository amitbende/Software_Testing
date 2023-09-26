package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkList 
{
	public static void main(String[] args) 
	{
		LinkedList L1=new LinkedList();
		
		//Add information	
		L1.add("Rohit");
		L1.add(100);
		L1.add('A');
		L1.add(60.25f);
		L1.add(100);  //Duplicate
		L1.add(null);
		L1.add(null);
		
		System.out.println(L1);
		
		//Verify LinkedList is empty or not
		System.out.println(L1.isEmpty());  			//False

		
		//Size
		System.out.println(L1.size()); 				//7
		
		//verify information is present or not
		System.out.println(L1.contains('A')); 		//true
		
		//Add information in between LinkedList-->Right Shift Operation	
		L1.add(1,200);
		System.out.println(L1);
		  
		//remove information -->Left Shift Operation  
		L1.remove(1);
		System.out.println(L1);
		
		//Update Information
		L1.set(3, 70.25f);
		System.out.println(L1);
		
		//To find index of data	
		System.out.println(L1.indexOf('A')); 			//2
		
		//to get information by providing index
		System.out.println(L1.get(2)); 					//A

		
		System.out.println("----For each loop----");
		
		for(Object S3:L1) 
		{
			System.out.println(S3);
		}

		 
		System.out.println("----iterator Curser----");
		
		Iterator itr=L1.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next()); 
		}
		
			 
		System.out.println("----listiterator Curser----");
		
	    ListIterator ltr=L1.listIterator();
		
	    while(ltr.hasNext())
		{
			System.out.println(ltr.next());  
		}	
	}
}
