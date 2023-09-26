package AutoSuggestions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_SearchBar 
{
    public static void main(String args[]) throws InterruptedException 
    { 
        // Create a new ChromeDriver instance.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window.
        driver.manage().window().maximize();

        // Navigate to Google's homepage.
        driver.get("https://www.google.com/");

        // Wait for 2 seconds (you should use explicit waits instead).
        Thread.sleep(2000);

        // Find the search input field by its class name and send the search query.
        driver.findElement(By.name("q")).sendKeys("apple");

        // Wait for a moment (you should use explicit waits instead).
        Thread.sleep(2000);

        // Find the suggestion list elements using an appropriate XPath.
        List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));

        // Wait for a moment (you should use explicit waits instead).
        Thread.sleep(2000);

        for (WebElement suggestion : suggestionList) {
            String suggestionText = suggestion.getText();
            System.out.println(suggestionText);

            if (suggestionText.equalsIgnoreCase("apple watch")) {
                suggestion.click();
                break;
            }
        }

        // Wait for a moment (you should use explicit waits instead).
        //Thread.sleep(5000);

        // Close the browser window and quit the driver.
        //driver.quit();
    }
}
