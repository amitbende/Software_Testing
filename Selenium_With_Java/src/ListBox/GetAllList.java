package ListBox;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetAllList 
{
	public static void main(String[] args) throws InterruptedException, IOException 
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
		    
		//Step-III: Call the method
		List<WebElement> Z2 = S1.getOptions();   //Addresses-->PUNE NAGPUR KOLKATA MUMBAI DELHI INDORE HYDRABAD BANGLORE
		for(WebElement A1:Z2)    				 //Addresses-->PUNE NAGPUR KOLKATA MUMBAI DELHI INDORE HYDRABAD BANGLORE
		{
			// System.out.println(A1.getText()); //PUNE NAGPUR KOLKATA MUMBAI DELHI INDORE HYDRABAD BANGLORE
			String Y1=A1.getText(); 			 //PUNE NAGPUR KOLKATA MUMBAI DELHI INDORE HYDRABAD BANGLORE
			System.out.println(Y1); 			 //PUNE NAGPUR KOLKATA MUMBAI DELHI INDORE HYDRABAD BANGLORE
		}	  
	}
}
