package POM_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Test_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			
		driver.manage().window().maximize();
		 
		//wait
		Thread.sleep(2000);
		  
		//Create Object of POM Class-I
		Adactin_LogIn Login=new Adactin_LogIn(driver);
		 
		//Enter Username
		Login.enterUsername();
		 
		//wait
		Thread.sleep(1000);
		 
		//Enter Password
		Login.enterPassword();
		 
		//wait
		Thread.sleep(1000);
		 
		//Click Login Button
		Login.clickloginbutton();
		  
		//Create Object of POM Class-II
		Adactin_HomePage Hompage=new  Adactin_HomePage(driver);
		 
		//wait
		Thread.sleep(1000);
		 
		//Verify Username
		Hompage.getUsername();
		
		//wait
		Thread.sleep(1000);
		 
		//Click Logout Button
		Hompage.clicklogoutbutton();
 
		//wait
		Thread.sleep(2000);
		 
		driver.quit();	 
	}
}
