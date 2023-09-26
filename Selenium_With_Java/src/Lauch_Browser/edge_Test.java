package Lauch_Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class edge_Test 
{
    public static void main(String[] args) 
    {
        // Set the path to the Microsoft Edge driver executable
        System.setProperty("webdriver.edge.driver", "D:\\TESTING\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        
        // Create an instance of EdgeOptions
        EdgeOptions options = new EdgeOptions();
        
        // Optionally, you can add additional options
        // options.addArguments("--headless"); // Run in headless mode
        
        // Create a new instance of the EdgeDriver
        WebDriver driver = new EdgeDriver(options);
        
        // Open a URL in Microsoft Edge
        driver.get("https://www.example.com");
        
        // Close the browser
        driver.quit();
    }
}
