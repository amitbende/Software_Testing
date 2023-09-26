package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sendkey 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Enter UN
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amit@gmail.com");
	
		//Wait
		Thread.sleep(2000);
	
		//Clear UN
		driver.findElement(By.xpath("//input[@name='email']")).clear();
	
		//Wait
		Thread.sleep(2000);
		 
		//Enter UN
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amit12345@gmail.com");
		
		driver.quit();	}
}
