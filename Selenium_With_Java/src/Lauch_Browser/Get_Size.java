package Lauch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Size 
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
		
		//To get size of the browser
		Dimension S1=driver.manage().window().getSize();  //(1050, 700)
		System.out.println(S1); 						  //(1050, 700)	//Width Height
		
		//Wait
		Thread.sleep(3000);

		//Close 
		driver.quit();
	}
}
