package Practice_Task_Logical;
//import java.util.Scanner;

public class Prime_Number 
{
	public static void main(String[] args)
	{
        //Scanner num = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int number = num.nextInt();
        
		int number = 7;
        int count = 0;
        
        for(int i=number;  i<number;    i++)
        {
        	  //1==0
        	if(number % i==0) 
        	{
        		count++;
        		break;
        	}

        }

        //0==1
        if(count==1) 
	    {
	    	System.out.println(number + "Given number is not a prime number");
	    }
	    else 
	    {
	    	System.out.println(number + "Given number is a prime number");
	    }  	
	}
}
