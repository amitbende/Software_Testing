package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation 
{
	@Test(dataProvider="UserName")                      
	public void Login(String UN, String PSW) 
	{
            System.out.println("UserName:"+UN+" "+"Password:"+PSW);
	}
	
	@DataProvider
	public Object[][] UserName() 
	{	
		Object[][] data=new Object[3][2];
		
		data[0][0]="Amit";
		data[0][1]="90215";
		
		data[1][0]="Arpit";
		data[1][1]="Ar1997";
		
		data[2][0]="Gauri";
		data[2][1]="G2006";
		
		return data;
	}
}
