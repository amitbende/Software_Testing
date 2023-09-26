package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropselectByIndex 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S1 = new Select(Month);
		
		S1.selectByIndex(4);
		
		Thread.sleep(2000);
		
		driver.quit();
	}	
}
