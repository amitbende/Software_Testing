package Failed_Xml_Suit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
	@Test                           //Test Method/case
	public void Test_Case3() 
	{
		Assert.fail();
		Reporter.log("Running Method Test Case 3", true);
	}
	
	@Test                          //Test Method/case
	public void Test_Case4() 
	{
		Reporter.log("Running Method Test Case 3", true);
	}
}
