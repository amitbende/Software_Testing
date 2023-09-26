package Scrolling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Horizontal_Scrolling 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
				 
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.manage().window().maximize();
		 
		//identfy element upto we have to scroll
		WebElement	S1=driver.findElement(By.xpath("//a[text()='VBScript']")); 
	
		Thread.sleep(5000);
       
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",S1); 
	}
}
