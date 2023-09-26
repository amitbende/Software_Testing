package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiByIndex 
{
	public static void main(String args[]) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();	
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		driver.get("file:///C:/Users/HP/Desktop/SDET/Test-form.html.html");
		
		//maximize browser
		driver.manage().window().maximize();
		 
		//Wait
		Thread.sleep(2000);
		 
		//Step-I:Identify Listbox and store it into an object	 
		WebElement Multiselectable=driver.findElement(By.xpath("//select[@id='multi_city']"));

		//Step-II:Create object of Select Class
		Select S1=new Select(Multiselectable);
		 
		//Step-III:Call the method 
		S1.selectByIndex(0);
		S1.selectByIndex(2);
		S1.selectByIndex(4);
		S1.selectByIndex(5);
		S1.selectByIndex(7);
	}
}
