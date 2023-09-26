package Array_Programs;

public class AddEvenNumbers 
{
	public static void main(String[] args) 
	{
        int[] numbers = { 2, 5, 8, 11, 14, 17, 20 };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of even elements: " + sum);
    }
}
