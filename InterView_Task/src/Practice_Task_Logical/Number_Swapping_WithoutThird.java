package Practice_Task_Logical;

public class Number_Swapping_WithoutThird 
{
	 public static void main(String[] args) 
	 {
		 int a = 10;
		 int b = 20;
		 System.out.println("Before swapping:");
	     System.out.println("a = " + a);
	     System.out.println("b = " + b);

	     // Swap the numbers
	     a=a+b; 	//30
		 b=a-b; 	//10
		 a=a-b;		//20

	     System.out.println("After swapping:");
	     System.out.println("a = " + a);
	     System.out.println("b = " + b);
	 }
}
