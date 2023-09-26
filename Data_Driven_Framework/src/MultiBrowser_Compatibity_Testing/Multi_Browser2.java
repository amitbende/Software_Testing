package MultiBrowser_Compatibity_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser2 
{
	@Parameters("browserName")
	@Test
	public void Test_Case1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;

		if(browserName.equals("Chrome")) 		//true  //false
		{
			ChromeOptions CO=new ChromeOptions();
			CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
			driver=new ChromeDriver(CO); 
		}
		else if(browserName.equals("firefox"))	//true //false
		{
			driver=new FirefoxDriver();
		
		} 
		else if(browserName.equals("Edge")) 	//true
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		//To enter URL/Open an Application
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");

		// Step-II:Enter Username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
	 
		// Step-III: Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("U1YP1G"); 
	 
		// Step-IV: Click Login Button
		driver.findElement(By.xpath("//input[@name='login']")).click(); 
	 
		//wait
		Thread.sleep(2000); 

		//Step-V: Test Case: Verify Username	
		String ExpectedUsername="Velocity!";
	
		//Get Actual Username 
		String  S1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value");  //Hello Velocity!
		
		System.out.println(S1);

		String  A1[]=S1.split(" ");  //Hello[0]               // Velocity![1]
		String  Z1=A1[0];  //Hello
        String ActualUsername=A1[1];  // Velocity!

        //System.out.println(Z1); 
        //System.out.println(ActualUsername);
                  
        	// Velocity!           // Velocity!
        if(ExpectedUsername.equals(ActualUsername)) //true  //false
        {
        	System.out.println("Pass");
        }             
        else 
        {
        	System.out.println("Fail");
        } 
        Thread.sleep(1000);   
        driver.quit();	        
	}
}
