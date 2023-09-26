package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta_login 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("mr.meet_bean");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("amitkumar");
		
		 // Find and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait for the login process to complete (you can customize the wait time)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify if the login was successful
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.instagram.com/")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
            //driver.quit();
            //return;
        }
		
		//driver.quit();
	}
}
