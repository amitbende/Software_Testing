package Practice_Task_Logical;

public class Addition_Number 
{
	public static void main(String[] args) 
	{
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}
