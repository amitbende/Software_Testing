package Groupping_Test_Classes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 
{
	@Test(groups="Login")                           	//Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Login Test_Case 1", true);
	}
	
	@Test(groups="Login")                             	//Test Method/case
	public void Test_Case2() 
	{
		Reporter.log("Running Method Login Test_Case 2", true);
	}
	
	@Test(groups="Registration")                       	//Test Method/case
	public void Test_Case3() 
	{
		Reporter.log("Running Method Registration Test_Case 3", true);
	}
	
	@Test(groups="Registration")                      	//Test Method/case
	public void Test_Case4() 
	{
		Reporter.log("Running Method Registration Test_Case 4", true);
	}
			
	@Test(groups="Search Hotel")                         //Test Method/case
	public void Test_Case5() 
	{
		Reporter.log("Running Method Search Hotel Test_Case 5", true);
	}
	
	@Test(groups="Change Password")                   	//Test Method/case
	public void Test_Case6() 
	{
		Reporter.log("Running Method Change Password Test_Case 6", true);
	}	
			
	@Test(groups="Change Password")                   	//Test Method/case
	public void Test_Case7() 
	{
		Reporter.log("Running Method Change Password Test_Case 7", true);
	}
}
