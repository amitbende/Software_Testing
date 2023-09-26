package Lauch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Position 
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
		
		//Create Object of Point Class
		Point P1=new Point(100,200);  				//X Y
				
		//To change Position of the browser
		driver.manage().window().setPosition(P1);  //X Y	 //(1050, 700)	//Width Height
		
		//Wait
		Thread.sleep(3000);

		//Close 
		driver.quit();
	}
}
