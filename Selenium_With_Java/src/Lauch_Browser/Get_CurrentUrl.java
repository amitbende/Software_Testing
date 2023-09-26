package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_CurrentUrl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver  driver=new ChromeDriver(CO); 
		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		 
		//Wait
		Thread.sleep(2000);
		
		//To get current URL of the web_page
		String S2=driver.getCurrentUrl();  				//https://www.facebook.com/
	
		System.out.println(S2);
	}
}
