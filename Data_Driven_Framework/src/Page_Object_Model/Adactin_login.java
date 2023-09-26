package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_login 
{
	//private WebElement UN=driver.findelement(By.xpath("//input[@id='username']"));
    @FindBy(xpath = "//input[@id='username']")
    private WebElement UN;

    //private WebElement PSW=driver.findelement(By.id("password"));
    @FindBy(id = "password")
    private WebElement PSW;

    //private WebElement Loginbtn=driver.findelement(By.xpath("//input[@name='login']"));
    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginButton;

    public Adactin_login(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) 
    {
    	//UN.sendKeys("Velocity");
        UN.sendKeys(username);
    }

    public void enterPassword(String password)
    {
    	//PSW.sendKeys("U1YP1G");
        PSW.sendKeys(password);
    }

    public void clickLoginButton() 
    {
        loginButton.click();
    }
}
