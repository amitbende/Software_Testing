package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Click Create new Account Button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Verify Radio button is selected or not
		WebElement RadioButton=driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		  
		boolean S4=RadioButton.isSelected();  //false
		System.out.println(S4);
	}	
}
