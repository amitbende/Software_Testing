package Practice_Task_Logical;

public class Palindrome_String 
{
    public static void main(String args[]) 
    {
        String org = "madam";		//m(4)  a(3)  d(2)  a(1)  m(0)----->length(5)

        String rev = "";

        for (int i=org.length()-1;  i>= 0;  i--) 
        {						  //0
            rev = rev + org.charAt(i);
        }

        if (org.equals(rev)) 
        {
            System.out.println("Given String is Palindrome");
        } 
        else 
        {
            System.out.println("Given String is not Palindrome");
        }
    }
}
