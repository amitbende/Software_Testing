package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Column_Data 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application
		driver.get("https://omayo.blogspot.com/");
				 
		//wait
		Thread.sleep(2000);
		
		// Take for loop for Row
		for(int i=1;      i<=4;     i++) 
		{
			WebElement A2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]")); 

			String Text=A2.getText();  	//Kishore  //Manish  //Praveen  //Dheepthi 
	        System.out.println(Text); 	// Kishore  //Manish  //Praveen  //Dheepthi
		}
	}
}
