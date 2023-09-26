package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Method_Url 
{
	public static void main(String[] args) 
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remnote-allow-origins=*", "ignore-certificate-errors");
		
		//Create object of ChromeDriver Class and provide Reference of WebDriver Class
		WebDriver driver = new ChromeDriver(CO);
		
		//To enter into web URL
		driver.get("https://www.youtube.com/");
	}
}
