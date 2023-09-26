package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_HomePage 
{
	//private WebElement Show_Username=driver.findelement(By.xpath("//input[@name='username_show']"));
    @FindBy(xpath = "//input[@name='username_show']")
    private WebElement Show_Username;

    //private WebElement LogoutBtn=driver.findelement(By.xpath("//a[text()='Logout']"));
    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    public Adactin_HomePage(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }

    public String getDisplayedUsername() 
    {
    	String ExpectedUsername="Velocity!";
    	
        //return Show_Username.getAttribute("value");
    	String Arr = Show_Username.getAttribute("value");  	//Hello Velocity!
		String[] A1 = Arr.split(" ");  						//Hello[0]           Velocity![1]
		String Z1 = A1[0];  								//Hello[0]  
	    String Actual_Username = A1[1]; 					//Velocity![1]
	    
	    if(ExpectedUsername.equals(Actual_Username))
		{
			System.out.println("Test Case Pass!!");
		}
		else
		{
			System.out.println("Test Case Fail!!");
		}
		
	    return Actual_Username;
    }

    public void clickLogoutButton() 
    {
        logoutButton.click();
    }
}
