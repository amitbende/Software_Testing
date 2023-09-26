package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Info1 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application
		driver.get("https://omayo.blogspot.com/");
				 
		//wait
		Thread.sleep(2000);
		
		//Fetch "Pune" 
		WebElement S3=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]/td[3]")); 
			     
		String  text=S3.getText();  //Pune  
		System.out.println(text);
	}
}
