package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Face_CSS_ID 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO= new ChromeOptions();
		CO.addArguments("--remote-allow-Origins", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//User_Name using #input#ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("AmitBende");
		
		//Pass_Word using #ID
		driver.findElement(By.cssSelector("#pass")).sendKeys("Amit@1996");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
