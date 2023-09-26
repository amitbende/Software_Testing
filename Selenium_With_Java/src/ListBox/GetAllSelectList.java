package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectList 
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
		S1.selectByIndex(3);
		S1.selectByIndex(5);
		S1.selectByIndex(6);
		S1.selectByIndex(7);
		
		//Wait
		Thread.sleep(2000);
		

		//To get Text of All selected options
		List<WebElement>  Z1=S1.getAllSelectedOptions(); 	//Addresses-->PUNE KOLKATA MUMBAI INDORE HYDRABAD BANGLORE
				
		for(WebElement Y1:Z1)  								//Addresses-->PUNE KOLKATA MUMBAI INDORE HYDRABAD BANGLORE
		{
			System.out.println(Y1.getText());  				//PUNE KOLKATA MUMBAI INDORE HYDRABAD BANGLORE
		}

	}
}
