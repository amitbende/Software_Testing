package Practice_Task_Logical;

public class AddEvenArray 
{
	public static void main(String[] args) 
	{
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = addEvenElements(numbers);
        System.out.println("Sum of even elements: " + sum);
    }

    public static int addEvenElements(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
