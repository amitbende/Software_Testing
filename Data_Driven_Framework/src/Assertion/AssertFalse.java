package Assertion;

import org.testng.annotations.Test;
import graphql.Assert;

public class AssertFalse 
{
	@Test
	public void Test_Case1()
	{
		Boolean ActualResult = true;
		Assert.assertFalse(ActualResult);			//Fail
	}
	
	@Test
	public void Test_Case2()
	{
		Boolean ActualResult = false;
		Assert.assertFalse(ActualResult);			//Pass
	}
}
