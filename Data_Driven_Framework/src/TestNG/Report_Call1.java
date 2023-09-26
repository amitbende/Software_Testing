package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report_Call1 
{
	@Test
	public void Test_Class1()
	{
		Reporter.log("Running Test_Class_1", true);
	}
	
	@Test
	public void Test_Class2()
	{
		Reporter.log("Running Test_Class_2", true);
	}
	
	@Test
	public void Test_Class3()
	{
		Reporter.log("Running Test_Class_3", false);
	}
	
	@Test
	public void Test_Class4()
	{
		Reporter.log("Running Test_Class_4");
	}
	
	@Test
	public void Test_Class5()
	{
		System.out.println("Running Test_Class_5");
	}
}
