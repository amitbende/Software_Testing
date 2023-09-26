package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Minimize 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(CO);
		
		//Open Face_book
		driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(3000);
		
		//To minimize Browser
		driver.manage().window().minimize();

		//Wait
		Thread.sleep(3000);
		
		//Close 
		driver.quit();
	}
}
