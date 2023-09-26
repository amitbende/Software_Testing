package Disable_Test_Cases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable1 
{
	@Test                           				//Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Test Case 1", true);
	}
	
	@Test(enabled=false)                           	//Test Method/case
	public void Test_Case2() 
	{
		Reporter.log("Running Method Test Case 2", true);
	}
	
	@Test                           				//Test Method/case
	public void Test_Case3() 
	{
		Reporter.log("Running Method Test Case 3", true);
	}
	
	@Test                           				//Test Method/case
	public void Test_Case4() 
	{
		Reporter.log("Running Method Test Case 4", true);
	}
	
	@Test                           				//Test Method/case
	public void Test_Case5() 
	{
		Reporter.log("Running Method Test Case 5", true);
	}
}
