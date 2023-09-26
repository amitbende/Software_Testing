package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Open_WebDriver 
{
	public static void main(String[] args)
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		
		//Create object of ChromeDriver Class and provide Reference of WebDriver Class
		WebDriver driver = new ChromeDriver();       //Up_Casting
	}
}
