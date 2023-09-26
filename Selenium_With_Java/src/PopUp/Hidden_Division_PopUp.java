package PopUp;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_Division_PopUp 
{
	//Hidden Division Pop-up
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver  driver=new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.flipkart.com/");
		 
		//Wait
		Thread.sleep(2000);
		 
		//Enter Email
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc123@gmail.com");
		 
		//Wait
		Thread.sleep(2000);
		 
		//Click Request OTP Button
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click(); 
	}
}
