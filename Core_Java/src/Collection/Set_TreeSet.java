package Collection;

import java.util.TreeSet;

public class Set_TreeSet 
{
	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		
		//Add information
		tr.add(100);
		tr.add(200);
		tr.add(400);
		tr.add(300);
		tr.add(600);
		tr.add(500);
		tr.add(500);  		//duplicate
		//tr.add(null); 	//not allowed
		
		System.out.println(tr);
		
		//Verify TreeSet is empty or not
		System.out.println(tr.isEmpty());  			//false
		
		//Size
		System.out.println(tr.size());				//6
		
		//verify information is present or not
		System.out.println(tr.contains(200)); 		//true
		
		//remove information
		tr.remove(600);
		System.out.println(tr);
		
		//print first information
		System.out.println(tr.first()); 			//100
		
		//print last information
		System.out.println(tr.last()); 				//500
		
		
		//remove first information	
		tr.pollFirst();
		System.out.println(tr);  //100
		
		//remove last information	
		tr.pollLast();
		System.out.println(tr);  //500	
	}
}
