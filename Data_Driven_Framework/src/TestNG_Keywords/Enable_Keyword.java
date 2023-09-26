package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Keyword 
{
	@Test			                				//Test Case / Method                             
	public void Test_Case1()
	{
		Reporter.log("Running Test Case 1", true);
	}
	
	@Test(enabled=false)                 			//Test Case / Method      //Disabled                       
	public void Test_Case2()
	{
		Reporter.log("Running Test Case 2", true);
	}
	
	@Test(enabled=true)                 			//Test Case / Method                             
	public void Test_Case3()
	{
		Reporter.log("Running Test Case 3", true);
	}
}
