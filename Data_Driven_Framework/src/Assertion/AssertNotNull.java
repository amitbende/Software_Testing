package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull 
{
	@Test                          
	public void Test_Case1() 
	{
        String  ActualResult = null;
		Assert.assertNotNull(ActualResult);  			//Fail
	}	
	
	@Test                     
	public void Test_Case2() 
	{
        String  ActualResult="Amit";
		Assert.assertNotNull(ActualResult);  			//Pass
	}
}
