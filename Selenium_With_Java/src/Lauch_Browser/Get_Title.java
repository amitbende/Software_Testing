package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Title 
{
	public static void main(String[] args) 
	{
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		//To get Title
		String S1=driver.getTitle(); 
		
		System.out.println(S1);	
	}
}
