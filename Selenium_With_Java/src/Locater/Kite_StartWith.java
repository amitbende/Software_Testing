package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kite_StartWith 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://kite.zerodha.com/");
		 
		//Wait
		Thread.sleep(2000);
		 
		//Click Forgot user ID or password Link
		driver.findElement(By.xpath("//a[starts-with(@class,'text-light ')]")).click();	 
	}
}
