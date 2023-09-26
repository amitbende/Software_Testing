package CustomizeListBox_KeyBoardActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Home_Key 
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
	    
	    //To move to the Top
	    act.sendKeys(Keys.HOME).perform();  		  //January
	    
	    //Wait
		Thread.sleep(2000);
	    
	    for(int i=1; i<=5; i++)
	    {
	    	Thread.sleep(2000);
	    	act.sendKeys(Keys.ARROW_DOWN).perform();  //Jun
	    }
	    
	    //Select option
	    act.sendKeys(Keys.ENTER).perform();  		  //Jun
	}
}
