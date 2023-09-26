package TestNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_Fail 
{
	@Test                         			//Test Method/case
	public void Login() 
	{
		Assert.fail();
		Reporter.log("Login To App", true);
	}
	
	@Test(dependsOnMethods= {"Login"})     	//Test Method/case
	public void Logout() 
	{
		Reporter.log("Logout from App", true);
	}
}
