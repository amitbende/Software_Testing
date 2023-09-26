package POM_With_DDF.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_HomePage 
{
	//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation
	
	//private WebElement UserShow=driver.findelement(By.xpath("//input[@name='username_show']"));	
	@FindBy(xpath="//input[@name='username_show']") 
	private WebElement  UserShow; 
	 
	//private WebElement LogoutBtn=driver.findelement(By.xpath("//a[text()='Logout']"));
	@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutBtn; 
		
	//2. Initialize within a constructor with access level public using PageFactory Class
	public Adactin_HomePage(WebDriver driver)   //Information
	{
		PageFactory.initElements(driver,this);
	}
		
	//3. Utilize within a method with access level public	 
	public void getUsername(String expectedUsername2) 
	{
		String S1 = UserShow.getAttribute("value");  		//Hello Velocity!
		String [] A1 = S1.split(" ");  						//Hello[0]           Velocity![1]
		String Z1 = A1[0];  								//Hello[0]  
		String ActualUsername = A1[1]; 						//Velocity![1]
		String ExpectedUsername = "Velocity!";
		
		if(ExpectedUsername.equals(ActualUsername)) 
		{
			System.out.println("Pass");
	    }
	    else 
	    {
	    	System.out.println("Fail");
	    }	     
	}
	
	public void clicklogoutbutton() 
	{
		LogoutBtn.click();
	}			
}
