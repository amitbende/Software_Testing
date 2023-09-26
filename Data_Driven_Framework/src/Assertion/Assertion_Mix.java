package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Mix 
{		
	@Test                          
	public void Test_Case1() 
	{
		String S1 = "Hi";
		
		String S2 = "Hello";
		
		String S3 = "Good Morning";
		
		Boolean S4 = true;
		
		Boolean S5 = false;
		
		Assert.assertNotEquals(S2,S1);  	//Actual(Hello)  		Expected(Hi)-->Pass
		
		Assert.assertEquals(S2,S1); 		//Actual(Hello)  		Expected(Hi)-->Fail     Stop Display Masseage After Fail
		
		Assert.assertEquals(S3,S1);  		//Actual(Good Morning)  Expected(Hi)-->Fail
		
		Assert.assertNotEquals(S1,S3); 		//Actual(Hi)  			Expected(Good Morning)--> Pass	
		
		Assert.assertTrue(S4);				//Pass
		
		Assert.assertTrue(S5);				//Fail
	}
}
