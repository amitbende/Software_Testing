package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ORM_Css_Tag_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
		 //Wait
		 Thread.sleep(2000);
		 
		//Enter Username (Tagname.class[Attribute name=Attribute Value])
		driver.findElement(By.cssSelector("input.oxd-input[placeholder=Username]")).sendKeys("Admin");
		 
		//Wait
		 Thread.sleep(2000);
		 
		//Enter PSW (Tagname.class[Attribute name=Attribute Value]) 
		 driver.findElement(By.cssSelector("input.oxd-input[name=password]")).sendKeys("admin123");
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
	}
}
