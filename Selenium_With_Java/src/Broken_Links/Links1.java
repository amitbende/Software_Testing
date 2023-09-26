package Broken_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Links1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("http://www.deadlinkcity.com/");
				 
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		//Identify all links
		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
		 
		for(WebElement Link:AllLinks) //Errorcode 402
		{
			String Url=Link.getAttribute("href"); //"error-page.asp?e=402"
			
			System.out.println("----------------------------------------------------");	
			System.out.println(Url);
			
			if(Url==null || Url.isEmpty()) //true  //false
			{
				System.out.println("URL is empty");
				continue;
			}

			try 
			{
				//make connection between Url and server
				HttpURLConnection S1=(HttpURLConnection)(new URL(Url).openConnection());
				
				//sent request to the server
				S1.connect();
				
				//Check Response code
				if(S1.getResponseCode()>=400) 
				{
					System.out.println(Url+" is broken");
				}
				else 
				{
					System.out.println(Url+" is valid");
				}
			} 
			catch (IOException e) 
			{
				
			}
			catch (ClassCastException X) 
			{
				
			}
		 }
	}
}
