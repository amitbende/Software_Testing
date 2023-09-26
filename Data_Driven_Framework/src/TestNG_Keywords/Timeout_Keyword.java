package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_Keyword 
{
	@Test(timeOut=5000)                          	//Test Case / Method                             
	public void Test_Case1() throws InterruptedException
	{	
		Thread.sleep(6000);
		Reporter.log("Running Test Case 1", true);
	}
	
	@Test				                			//Test Case / Method                            
	public void Test_Case2()
	{
		Reporter.log("Running Test Case 2", true);
	}
	
	@Test(timeOut=5000)                          	//Test Case / Method                             
	public void Test_Case3() throws InterruptedException
	{	
		Thread.sleep(4000);
		Reporter.log("Running Test Case 3", true);
	}
}
