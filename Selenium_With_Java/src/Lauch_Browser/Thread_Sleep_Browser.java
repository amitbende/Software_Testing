package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Thread_Sleep_Browser 
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

		//To close all the Tabs of the Browser/Close Browser
		driver.quit();
	}
}
