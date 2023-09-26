package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Face_Pass 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[(@id='email')]")).sendKeys("Amit_Bende");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[(@id='pass')]")).sendKeys("amit");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(2000);
	}
}
