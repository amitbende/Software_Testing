package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_pass 
{
	@Test                         			//Test Method/case
	public void Login() 
	{ 
		Reporter.log("Login To App", true);
	}
	
	@Test(dependsOnMethods= {"Login"})       //Test Method/case
	public void Logout() 
	{
		Reporter.log("Logout from App", true);
	}
}
