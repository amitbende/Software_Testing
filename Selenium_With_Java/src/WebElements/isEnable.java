package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isEnable 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Verify Login Button is enabled or not
		WebElement Button=driver.findElement(By.xpath("//button[text()='Login ']"));
		 
		boolean  S2=Button.isEnabled();  //true  
		System.out.println(S2);
		
		driver.quit();
	}
}
