package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Table_Data 
{
    public static void main(String args[]) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // To enter URL/Open an Application
        driver.get("https://omayo.blogspot.com/");

        // wait
        Thread.sleep(2000);

        // Outer for loop for rows
        for (int i = 1; i <= 4; i++) 
        {
            // Inner For loop for Columns
            for (int j = 1; j <= 3; j++) 
            { 	
            	// Corrected the loop variable from i to j
                WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"));

                String cellText = cell.getText();
                System.out.print(cellText + " ");
            }
            System.out.println();
        }

        // Close the browser
        driver.quit();
    }
}
