package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Face_Type_Text 
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
		 
		 //Click Create new Account Button
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		 //Enter FirstNAme
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Amit");	 
	}
}
