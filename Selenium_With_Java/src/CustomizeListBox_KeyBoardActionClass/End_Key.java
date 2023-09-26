package CustomizeListBox_KeyBoardActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class End_Key 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		ChromeOptions CO = new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver = new ChromeDriver(CO); 

		//To maximize Browser
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		 
		//Wait
		Thread.sleep(2000);
		 
		//Click Create new Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Step-I:Identify Listbox and store it into an object	 
		WebElement Month = driver.findElement(By.id("month"));
	   
		//Step-II:Create object of Actions Class
	    Actions act = new Actions(driver);
	  
	    //Step-III:Call the method (Left Click)  
	    act.click(Month).perform();
	   
	    //Wait
		Thread.sleep(2000);
	    
	    //To move to the Bottom
		act.sendKeys(Keys.END).perform();  			//December
	   
		for(int i=1; i<=9; i++)
		{	
			Thread.sleep(1000);
		    act.sendKeys(Keys.ARROW_UP).perform();  //March
		} 
		    
		//Select option
		act.sendKeys(Keys.ENTER).perform();  		//March
	}
}
