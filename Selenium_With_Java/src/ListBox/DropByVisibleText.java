package ListBox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropByVisibleText 
{
	//How to handle listbox
	public static void main(String[] args) throws InterruptedException, IOException 
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
		 
		//Wait
		Thread.sleep(2000);
		 
		//Step-I:Identify Listbox and store it into an object	 
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step-II:Create object of Select Class
		Select S1=new Select(Month);
		 
		//Step-III:Call the method 
		S1.selectByVisibleText("May"); 			//may 
	}
}
