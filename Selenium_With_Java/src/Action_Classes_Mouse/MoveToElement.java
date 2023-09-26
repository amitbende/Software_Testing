package Action_Classes_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("https://demo.automationtesting.in/Frames.html");
				 
		//wait
		Thread.sleep(2000);
		 
		//Step-I:Identify element and store it into an object 
		WebElement S1=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	
		//Step-II:Create object of Actions Class
	    Actions act=new Actions(driver);
	              
	    //Step-III:Call the method(Move Curser)       
	    act.moveToElement(S1).perform(); 

	    //wait
		Thread.sleep(2000);
		
		//Click Windows Option
		driver.findElement(By.xpath("//a[text()='Windows']")).click();		 
	}
}
