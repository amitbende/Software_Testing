package Lauch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Size 
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
		
		//Create object of Dimension Class
		Dimension D1 = new Dimension(500,750); 	//Width Height
				
		//To set size of the browser
		driver.manage().window().setSize(D1);	//Width Height
		
		//Wait
		Thread.sleep(3000);

		//Close 
		driver.quit();
	}
}
