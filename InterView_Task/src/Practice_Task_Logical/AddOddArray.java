package Practice_Task_Logical;

public class AddOddArray 
{
	public static void main(String[] args) 
	{
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = addOddElements(numbers);
        System.out.println("Sum of odd elements: " + sum);
    }

    public static int addOddElements(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}

