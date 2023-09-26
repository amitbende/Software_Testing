package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel1 
{
	@Test                         				//Test Method/case
	public void OpenFacebook() 
	{
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 
		//To Maximize Window
		driver.manage().window().maximize();
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		 
		driver.quit();
		
		System.out.println("Success1");
	}
}
