package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_New_Selenium 
{
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        //driver.quit();
    }
}
