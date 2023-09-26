package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta_Pass 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("amitkumar");
		
		Thread.sleep(2000);

		driver.quit();
	}
}
