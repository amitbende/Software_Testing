package Practice_Task_Logical;

public class Table 
{
	public static void main(String[] args) 
	{
        int number = 10;

        System.out.println("Table of " + number + ":");

        for (int i = 1; i <= 10; i++) 
        {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
