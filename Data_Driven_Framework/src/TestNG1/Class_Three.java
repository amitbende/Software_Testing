package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_Three 
{
	@Test                           		//Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Class Three Test_Case1", true);
	}
	
	@BeforeSuite
	public void beforeSuite3() 
	{
		Reporter.log("Running Before Suite anotation from class three", true);
	}
	
	@AfterSuite
	public void aftersuit3() 
	{
		Reporter.log("Running After Suite anotation from class three", true);
	}
}
