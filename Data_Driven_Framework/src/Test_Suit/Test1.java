package Test_Suit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test                           //Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Test Case 1", true);
	}
	
	@Test                          //Test Method/case
	public void Test_Case2() 
	{
		Reporter.log("Running Method Test Case 2", true);
	}
}
