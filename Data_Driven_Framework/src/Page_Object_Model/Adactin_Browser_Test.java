package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Browser_Test 
{
    public static void main(String args[]) 
    {
        // Create ChromeOptions instance for configuring ChromeDriver
        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(CO);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the specified URL
        driver.get("http://adactinhotelapp.com/HotelAppBuild2/");

        // Initialize the page objects for login page
        Adactin_login loginPage = new Adactin_login(driver);
        
        // Perform login using the page object
        loginPage.enterUsername("velocity");
        loginPage.enterPassword("U1YP1G");
        loginPage.clickLoginButton();
        
        // Initialize the page objects for home page
        Adactin_HomePage homePage = new Adactin_HomePage(driver);
        
        //Step-V: Test Case: Verify Username	
        //String ExpectedUsername="Hello Velocity!";

        // Perform actions on the home page using the homePage object
        String Actual_Username = homePage.getDisplayedUsername();
        System.out.println("Actual Username: " + Actual_Username);

        homePage.clickLogoutButton();

        // Close the browser
        //driver.quit();
    }
}
