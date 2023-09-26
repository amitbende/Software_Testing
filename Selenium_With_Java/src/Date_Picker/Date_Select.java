package Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Select 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		
		Thread.sleep(2000);
		
		//Click Close button
		driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")).click();
		
		//Click CheckIn Date Calendar
		driver.findElement(By.xpath("//button[@class='d47738b911 e246f833f7 fe211c0731']")).click();
		
		//Step-I: Declare 2 Variable-->(1) Month and Year (2)Date	
		String Expected_MonthYear = "August 2023"; 
	    String Expected_Date = "28";
	    
	    while(true)
	    {
	    	String Actual_Month_Year = driver.findElement(By.xpath("//h3[@class='e1eebb6a1e ee7ec6b631']")).getText();
	    	System.out.println(Actual_Month_Year);
	    	
	    	if(Expected_MonthYear.equals(Actual_Month_Year))
	    	{
	    		break;
	    	}
	    	else 
	    	{
	        	//To click next Arrow
	    		driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 f671049264 deab83296e f4552b6561 dc72a8413c f073249358']")).click();
	    	}
	    }
	    
	    //Get all the dates
	    List<WebElement>   Alldates=driver.findElements(By.xpath("(//table[@class='eb03f3f27f'])[1]//tr/td"));
	    
	    for(WebElement date:Alldates)  				//33 
	    {
	    	String  ActualDate=date.getText();		//28
	    	//System.out.println(ActualDate);
	    	
	    	if(Expected_Date.equals(ActualDate)) 	//true
	    	{
	    		date.click();
	    		break;
	    	}
	    }
	    //driver.quit();
	}
}
