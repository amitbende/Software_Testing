package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Flip_SectionScreen 
{
	public static void main(String args[]) throws IOException
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(CO);
		
		driver.get("https://www.flipkart.com/search?q=iphone%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		driver.manage().window().maximize();
		
		WebElement S1=driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
		
		File Source = S1.getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
		File Destination = new File("D:\\Amit  Software Testing\\AutoMation ScreenShots\\Iphone14.jpg");
		
		FileHandler.copy(Source, Destination);
		
		driver.quit();
	}		
}
