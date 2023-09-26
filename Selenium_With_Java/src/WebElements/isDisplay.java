package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDisplay 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Verify Facebook Logo is displayed or not
		WebElement Logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		 
		boolean   S3=Logo.isDisplayed();  //true
        System.out.println(S3);
	}
}
