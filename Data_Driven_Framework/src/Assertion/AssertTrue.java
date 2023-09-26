package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
	@Test                          
	public void Test_Case1() 
	{
       boolean  ActualResult = true; 
       Assert.assertTrue(ActualResult);  //Pass
	}
	
	@Test                          
	public void Test_Case2() 
	{
       boolean  ActualResult = false; 
       Assert.assertTrue(ActualResult);  //fail
	}
}
