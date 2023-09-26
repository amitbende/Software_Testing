package Practice_Task_Logical;
import java.util.Scanner;

public class Leap_Year 
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } 
            else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
