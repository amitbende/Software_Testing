package Test_Suit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	@Test                           //Test Method/case
	public void Test_Case5() 
	{
		Reporter.log("Running Method Test Case 5", true);
	}
	
	@Test                          //Test Method/case
	public void Test_Case6() 
	{
		//Assert.fail();
		Reporter.log("Running Method Test Case 6", true);
	}
}
