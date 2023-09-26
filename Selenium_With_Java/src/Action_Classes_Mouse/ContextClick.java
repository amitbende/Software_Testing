package Action_Classes_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("https://www.flipkart.com/");
				 
		//wait
		Thread.sleep(2000);
		 
		driver.manage().window().maximize();
		 
		//Close Hidden division pop-up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		//Step-I:Identify element and store it into an object 
		WebElement S2=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		 
		//Step-II:Create object of Actions Class
	    Actions act=new Actions(driver);
		  
	    //wait
		Thread.sleep(2000);
	        
		//Step-III:Call the method(Right Click) 
	    act.contextClick(S2).perform(); 	 
	}
}
