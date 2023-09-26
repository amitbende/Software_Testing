package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main_Method_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application
		driver.get("https://www.facebook.com/");		 
	}
}
