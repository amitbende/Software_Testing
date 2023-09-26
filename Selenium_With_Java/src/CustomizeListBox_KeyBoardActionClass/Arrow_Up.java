package CustomizeListBox_KeyBoardActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Arrow_Up 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "Ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Step-I:Identify Listbox and store it into an object	 
		WebElement Month = driver.findElement(By.id("month"));
			  
		//Step-II:Create object of Actions Class
	    Actions act = new Actions(driver);
	  
	    //Step-III:Call the method (Left Click)  
	    act.click(Month).perform();
	    
	    //Wait
		Thread.sleep(2000);
	    
		//To move upward   
		act.sendKeys(Keys.ARROW_UP).perform(); 	//Jul
		act.sendKeys(Keys.ARROW_UP).perform();  //Jun
		act.sendKeys(Keys.ARROW_UP).perform(); 	//May 
		act.sendKeys(Keys.ARROW_UP).perform(); 	//April
	   
		//Wait
		Thread.sleep(2000);
		 
		//Select Option
		act.sendKeys(Keys.ENTER).perform(); 	//April
	}
}
