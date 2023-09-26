package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class flip_ScreenShot 
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
		File Destination = new File("D:\\TESTING\\AutoMation ScreenShots\\Screen3.jpg");
		
		FileHandler.copy(Source, Destination);
		
		driver.quit();
	}
}
