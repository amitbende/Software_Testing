package Lauch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Open_ChromeDriver 
{
		public static void main(String[] args)
		{
			//Parameter-I: Name of the browser
			//Parameter-II:Path of the ChromeDriver.exe file
			System.setProperty("webdriver.chrome.driver", "D:\\Amit  Software Testing\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe\\");
			
			//Create object of ChromeDriver Class and provide Reference of ChromeDriver Class
			ChromeDriver driver= new ChromeDriver();	
		}
}
