package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class List_Vector 
{
	public static void main(String[] args) 
	{
		Vector V1=new Vector();
		
		//Add information
		V1.add("Amit");
		V1.add(100);
		V1.add('A');
		V1.add(60.25f);
		V1.add(100);
		V1.add(null);
		V1.add(null);
		
		System.out.println(V1);
		
		System.out.println(V1.isEmpty());//False
		
		System.out.println(V1.size());//7
		
		//verify information is present or not
		System.out.println(V1.contains('A')); //true
		
		V1.add(1,200);
		System.out.println(V1);
		
		V1.remove(1);
		System.out.println(V1);
		
		V1.set(3, 80.15f);
		System.out.println(V1);
		   
		System.out.println(V1.indexOf('A')); //2
		   
		System.out.println(V1.get(0)); //Amit
		
		  
		System.out.println("----For each loop----");  
		  
		for(Object S2:V1) 					//0->Amit 1->100 2->A 3->80.15 4->100 5->null 6->null
		{
			System.out.println(S2);			//Amit  100  A 80.15 100 null null
		}
		 
		System.out.println("----iterator Curser----");
		
		Iterator itr=V1.iterator();
		while(itr.hasNext()) 					//7-->   -->false
		{
			System.out.println(itr.next());  	//Amit 100 A 80.15 100 null null
		}

			 
		System.out.println("----listiterator Curser----");
		
		ListIterator ltr=V1.listIterator();
		while(ltr.hasNext()) 					//7-->   -->false
		{
			System.out.println(ltr.next());  	//Amit 100 A 80.15 100 null null
		}
		
		    
		System.out.println("----enumeration Curser----");
		
		Enumeration enu=V1.elements();
		while(enu.hasMoreElements()) 				//7->   ->false
		{
			System.out.println(enu.nextElement());	//Amit 100 A 80.15 100 null null
		}     
	}
}
