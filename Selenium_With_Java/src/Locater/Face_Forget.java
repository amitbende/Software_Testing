package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Face_Forget 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Click Forgotten Password link
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		Thread.sleep(2000);
	}
}
