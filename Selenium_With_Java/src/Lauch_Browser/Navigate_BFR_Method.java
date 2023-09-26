package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate_BFR_Method 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(CO);
		
		//To enter URL/Open an Application	
		driver.navigate().to("https://www.youtube.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//To enter URL/Open an Application	
		driver.navigate().to("https://kite.zerodha.com/");
		
		//Wait
		Thread.sleep(2000);
				
		//To move Backward
		driver.navigate().back();    			//Facebook
		
		//Wait
		Thread.sleep(2000);
		
		//To move forward
		driver.navigate().forward();  			//Kite zerodha
		
		//Wait
		Thread.sleep(2000);
		
		//To refresh web_page
		driver.navigate().refresh();

		//To close all the Tabs of the Browser/Close Browser
		driver.quit();
	}
}
