package Practice_Task_Logical;

public class Reverse_Sentance 
{
	public static void main(String[] args) 
	{
		String org="I am Playing"; 			//Playing am I
	    String S1=reversesentence(org);  	//Playing am I
	    System.out.println(S1);
	}
	
	public static String reversesentence(String Sentence) //I am Playing
	{
		                                     	//0    //1    //2
		String[] text=Sentence.split(" ");   	//I    am     Playing
		String rev=""; 						 	//Playing am I
		
		            //2				  2>=0	    	 1
									//1>=0			 0
									//0>=0			-1
									//-1>=0 False
		for(int i=text.length-1;     i>=0;     		i--) 
		{
			//0
			rev = rev + text[i]+" ";  			//Playing am I
		} 
		return rev; 							//Playing am I        		     	     		
	}
}
