package Web_Table;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column_Size 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application
		driver.get("https://omayo.blogspot.com/");
				 
		//wait
		Thread.sleep(2000);
		
		//To find Column size
		List<WebElement> AllcolumnAddresses=driver.findElements(By.xpath("//table[@id='table1']//tr[1]/th"));	
		    
		int  S2=AllcolumnAddresses.size();   //3 
		System.out.println(S2);
	}
}
