package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals 
{
	@Test                          						
	public void Test_Case1() 
	{
      String ExpectedResult="Forgotten password?";
      String ActualResult="Forgotten password?";
      
      Assert.assertEquals(ActualResult,ExpectedResult);  	//Actual  Expected-->Pass
	}

	@Test                          
	public void Test_Case2() 
	{
      String ExpectedResult="Forgotten password";	
      String ActualResult="Forgotten password?";
      
      Assert.assertEquals(ActualResult,ExpectedResult);  	//Actual  Expected-->Fail
	}
}
