package PopUp;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Dismiss 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//maximize browser
		driver.manage().window().maximize();
		 
		Thread.sleep(2000);
		 
		//Enter customerID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("amit");
		 
		Thread.sleep(2000);
		 
		//Click Submit Button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		Thread.sleep(2000);
		 
		//Switch to Alert pop-up	 
		Alert alt=driver.switchTo().alert();
		 
		Thread.sleep(2000);
		 
		//Click cancle button
		alt.dismiss();
	}
}
