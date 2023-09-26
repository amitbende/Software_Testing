package Handling_Multiple_Elements;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiple_Elements 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);
		 
		//To get Text of All the Links	 
		List<WebElement> Alllinks=driver.findElements(By.xpath("//a"));  	//46 Addresses
		 	 
		for(WebElement link:Alllinks)  										//46 Addresses
		{
		   String  T1=link.getText();  
		   System.out.println(T1);
		} 
	}
}
