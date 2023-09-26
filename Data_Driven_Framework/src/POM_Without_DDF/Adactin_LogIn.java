package POM_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_LogIn 
{
	//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation.
	
	//private WebElement UN=driver.findelement(By.xpath("//input[@id='username']"));
	@FindBy(xpath="//input[@id='username']")	
	private WebElement UN;	
	
	
	//private WebElement PSW=driver.findelement(By.id("password"));
	@FindBy(id="password")	private WebElement PSW;	  
	 
	//private WebElement Loginbtn=driver.findelement(By.xpath("//input[@name='login']"));
	@FindBy(xpath="//input[@name='login']") private WebElement Loginbtn; 
	 
	//2. Initialize within a constructor with access level public using PageFactory Class
	public Adactin_LogIn(WebDriver driver)  			//13 methods
    {
		PageFactory.initElements(driver,this);
    }
	 
	//3. Utilize within a method with access level public
	public void enterUsername() 
	 {
		UN.sendKeys("Velocity");
	 }
	 
	 public void enterPassword() 
	 {
		PSW.sendKeys("U1YP1G");
	 }
	 
	 public void clickloginbutton() 
	 {
		Loginbtn.click();
	 } 	 
}