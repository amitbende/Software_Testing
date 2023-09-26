package ListBox;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceAllMonthList 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);
		 
		//Click Create new Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		Thread.sleep(2000);
		 
		//Step-I:Identify Listbox and store it into an object	 
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		 
		//Step-II:Create object of Select Class
		Select S1=new Select(Month);
		 
		//get text of all options  
		List<WebElement>  Z2=S1.getOptions();  	//Addresses-->Jan feb......Dec
		for(WebElement B1:Z2)  					//Addresses-->Jan feb......Dec
		{
			System.out.println(B1.getText()); 	//Jan //feb.....  //Dec
		}
	}
}
