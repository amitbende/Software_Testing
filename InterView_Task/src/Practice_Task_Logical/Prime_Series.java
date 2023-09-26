package Practice_Task_Logical;
import java.util.Scanner;

public class Prime_Series 
{
	public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = num.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        generatePrimeSeries(limit);
    }

    public static void generatePrimeSeries(int limit) {
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }

        return true; // Number is prime
    }
}

