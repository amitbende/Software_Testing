package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annoations2 
{
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("Open Browser", true);
	}
		
	@BeforeMethod
	public void LoginToAPP() 
	{
		Reporter.log("Login TO App", true);
	}
	
	@Test                          //Test Method/case
	public void SearchHotel() 
	{
		Reporter.log("Running Method TC1: Search Hotel", true);
	}
	
	@Test                          //Test Method/case
	public void ChangePassword() 
	{
		Reporter.log("Running Method TC2: Change Password", true);
	}

	
	@AfterMethod
	public void LogoutFromApp() 
	{
		Reporter.log("Logout from App", true);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("Close Browser", true);
	}
}
