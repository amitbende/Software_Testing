package FramesWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF_New 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Velocity");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("U1YP1G");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Thread.sleep(2000);
		
		//Step-V: Test Case: Verify Username	
		String ExpectedUsername="Velocity!";

		String UN =driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		System.out.println(UN);
		
		String Arr[] = UN.split(" ");   //Arr[] = [Hello[0] Velocity[1]] //Split method of string convert text to list of array
		
		String A1 = Arr[0];
		System.out.println(A1);
		
		String Actual_Username = Arr[1];
		System.out.println(Actual_Username);
		
		if(ExpectedUsername.equals(Actual_Username))
		{
			System.out.println("Test Case Pass!!");
		}
		else
		{
			System.out.println("Test Case Fail!!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
