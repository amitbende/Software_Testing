package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Face_Css_Class 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO= new ChromeOptions();
		CO.addArguments("--remote-allow-Origins", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//User_Name Using #input.css
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("AmitBende");
		
		//User_Name Using #.css
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("Amit@1996");
	}
}
