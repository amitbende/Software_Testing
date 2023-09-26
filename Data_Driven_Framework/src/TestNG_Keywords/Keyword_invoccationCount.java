package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_invoccationCount 
{
	@Test(invocationCount=5)                     	//Test Case / Method                             
	public void Test_Case1()
	{
		Reporter.log("Running Test Case 1", true);
	}
}
