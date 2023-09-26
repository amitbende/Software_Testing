package Annotations;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 
{
	@Test(dataProvider="User")
	public void Userlogin(String UN, String PSW, String Gad) 
	{
		Reporter.log("CustomerName:"+UN+" "+"Password:"+PSW+" "+"Gadget:"+Gad);
	}
	
	@DataProvider
	public Object[][] User()
	{
		Object[][] UserData = new Object[4][3];
		
		UserData[0][0]="Amit";
		UserData[0][1]="Amit95";
		UserData[0][2]="SmartPhone";
		
		UserData[1][0]="Arpit";
		UserData[1][1]="Arpit97";
		UserData[1][2]="MacOs";
		
		UserData[2][0]="Gauri";
		UserData[2][1]="689524";
		UserData[2][2]="Iphone";
		
		UserData[3][0]="Niketan";
		UserData[3][1]="Nick94";
		UserData[3][2]="Ipad";
		
		return UserData;
	}
}
