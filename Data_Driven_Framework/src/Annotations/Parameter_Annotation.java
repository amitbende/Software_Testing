package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotation 
{
	@Parameters("URL")
	@Test
	public void browser(String URL)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.quit();
	}
}
