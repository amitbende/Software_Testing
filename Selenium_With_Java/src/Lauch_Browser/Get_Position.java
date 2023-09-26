package Lauch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Position 
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
		
		//To get position of the browser
		Point S2=driver.manage().window().getPosition();  //(10, 10)
		System.out.println(S2);							  //(10, 10)

		//Wait
		Thread.sleep(3000);

		//Close 
		driver.quit();
	}
}
