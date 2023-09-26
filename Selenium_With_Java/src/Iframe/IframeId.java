package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeId 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(Options);
		
		//maximize window
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Switch mainn page to iFrame(String Frameid)
		driver.switchTo().frame("iframeResult");
		
		//wait
		Thread.sleep(2000);
		
		//Click "Click me to display Date and Time" Button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Switch to main Page
		driver.switchTo().defaultContent();
		
		//Click Home Icon link
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//close browser
		driver.quit();
	}
}
