package Lauch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multi_Browser 
{
	public static void main(String[] args)
	{
		ChromeOptions CO = new ChromeOptions();
		
		CO.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		
		WebDriver driver1 = new ChromeDriver(CO);
		driver1.get("https://www.youtube.com/");
		
		WebDriver driver2 = new ChromeDriver(CO);
		driver2.get("https://www.instagram.com/");
		
		WebDriver driver3 = new ChromeDriver(CO);
		driver3.get("https://pandey1523chulbul.atlassian.net/jira/software/projects/VF/boards/1/backlog");
		
		driver1.close();
		driver2.close();
		driver3.close();
	}
}
