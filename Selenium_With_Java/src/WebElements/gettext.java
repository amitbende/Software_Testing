package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gettext 
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
		 
		//To get text
		WebElement link=driver.findElement(By.xpath("//a[@class='_8esh']"));
		
		String S1=link.getText(); //Create a Page
		
		System.out.println(S1); 
	}
}
