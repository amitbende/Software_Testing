package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_LIst 
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		//Add information
		al.add("Amit");
		al.add(100);	
		al.add('A');
		al.add(60.25f);
		al.add(100);  							//Duplicate are allowed in Arraylist 	
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		//Verify Arraylist is empty or not
		System.out.println(al.isEmpty()); 		//false
			
		//Size
		System.out.println(al.size());			//7
		
		//verify information is present or not
		System.out.println(al.contains('A'));  	//true
		
		//Add information in between Arraylist--> Right Shift Operation
		al.add(1,200);
		System.out.println(al);

		//remove information -->Left Shift Operation
		al.remove(1); 							//200
		System.out.println(al);
		
		//Update Information
		al.set(3, 90.75f);
		System.out.println(al);
		
		//to find index of data		
		System.out.println(al.indexOf("Amit")); //0
		
		//to get index by providing information
		System.out.println(al.get(2)); 			//A
		
		System.out.println("----For each loop----");
		
		for(Object S1:al)   			//0-->Amit  //1-->100  //2-->A  //3-->90.75 //4-->100  //5-->null  //6-->null
		{
			System.out.println(S1);    	//Amit  100  A 90.75  100  null  null
		}
		
		System.out.println("-----For Iterator Cursor-----");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());  //Amit  100  A  90.75  100 null  null
		}
		
		System.out.println("----listiterator Curser----");	
		
	 	ListIterator ltr = al.listIterator();
	 	
	 	while(ltr.hasNext()) 					//7-->   -->false
		{
			System.out.println(ltr.next());  	//Amit  100 A 90.75 100 null null 
		}
	}
}
