package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class_One
{
	@Test                           		//Test Method/case
	public void Test_Case1() 
	{
		Reporter.log("Running Method Class One Test_Case1", true);
	}
}
