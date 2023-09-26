package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_Two 
{
	@Test                           		//Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Class Two Test_Case1", true);
	}
	
	@BeforeTest
	public void before_Test2()
	{
		Reporter.log("Running Before Test Annotation from class Two", true);
	}
	
	@AfterTest
	public void after_Test2()
	{
		Reporter.log("Running After Test Annotation from class Two", true);
	}

}
