package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Face_FnLn 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.facebook.com/");
		 
		 //maximize
		 driver.manage().window().maximize();
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Click Create new Account Button
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		 //Wait
		 Thread.sleep(2000);
	 
		 //Enter Surname
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Amit");	
		 
		 //Wait
		 Thread.sleep(2000);
	 
		 //Enter Surname
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bende");	
		 
		 //Mobile or Email
		 driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9021598612");
		 
		//Wait
		 Thread.sleep(2000);
		 
		 //New_Password
		 driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("amitk");	
		 
		 //wait
		 Thread.sleep(2000);
		 
		 // Select day
		 Select dayDropdown = new Select(driver.findElement(By.id("day")));
		 // Select day by value
		 dayDropdown.selectByValue("22");
		 
		 // Select month
		 Select monthDropdown = new Select(driver.findElement(By.id("month")));
		 // Select month by visible text
		 monthDropdown.selectByVisibleText("Jully");
		 
		 // Select year
		 Select yearDropdown = new Select(driver.findElement(By.id("year")));
		 // Select year by index
		 yearDropdown.selectByIndex(30);
		 
		 //To get value in console 
		 String selectedDay = dayDropdown.getFirstSelectedOption().getText();
		 String selectedMonth = monthDropdown.getFirstSelectedOption().getText();
		 String selectedYear = yearDropdown.getFirstSelectedOption().getText();

		 System.out.println("Selected Birthdate: " + selectedMonth + " " + selectedDay + ", " + selectedYear);
	}
}
