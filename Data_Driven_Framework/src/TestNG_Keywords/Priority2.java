package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 
{
	@Test(priority=2)                 				//Test Case / Method                             
	public void Test_Case1()
	{
		Reporter.log("Running Test Case 1", true);
	}
	
	@Test(priority=1)                 				//Test Case / Method                             
	public void Test_Case2()
	{
		Reporter.log("Running Test Case 2", true);
	}
	
	@Test                							//Priority By Default =0  //Test Case / Method                             
	public void Test_Case3()
	{
		Reporter.log("Running Test Case 3", true);
	}
}
