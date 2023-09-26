package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority5 
{
	@Test(priority=2)                 				//Test Case / Method                             
	public void Test_Case1()
	{
		Reporter.log("Running Test Case 1", true);
	}
	
	@Test(priority=1)                 				//Test Case / Method                             
	public void Test_Case2()
	{
		Reporter.log("Running Test Case 2", true);
	}
	
	@Test(priority=1)               				//Test Case / Method                             
	public void Test_Case3()
	{
		Reporter.log("Running Test Case 3", true);
	}
	
	@Test                							//Test Case / Method                             
	public void Test_Case4()
	{
		Reporter.log("Running Test Case 4", true);
	}
	
	@Test(priority=-1)                				//Test Case / Method                             
	public void Test_Case5()
	{
		Reporter.log("Running Test Case 5", true);
	}
}
