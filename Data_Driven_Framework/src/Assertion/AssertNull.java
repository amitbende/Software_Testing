package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull 
{
	@Test                          
	public void Test_Case1() 
	{
        String  ActualResult = null;
		Assert.assertNull(ActualResult);  			//Pass
	}	
	
	@Test                     
	public void Test_Case2() 
	{
        String  ActualResult="Amit";
		Assert.assertNull(ActualResult);  			//Fail
	}
}
