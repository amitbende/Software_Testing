package Handling_Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_Handle 
{
	public static void main(String args[])
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		 driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
		 
		 driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[1]")).click();
//		 driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
		 driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
		 
	}
}
