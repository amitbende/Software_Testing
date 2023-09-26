package POM_With_DDF.copy;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Test_Class 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			
		driver.manage().window().maximize();
		 
		//wait
		Thread.sleep(2000);
		  
		//To reach upto Excelsheet
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		//open Excelsheet and go to perticuler sheet
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet9"); 
			 
		//Create Object of POM Class-I
		Adactin_LogIn Login=new Adactin_LogIn(driver);
			 
		//Enter Username
		String User=Sh.getRow(0).getCell(0).getStringCellValue();  //Velocity
		Login.enterUsername(User);
			 
		//wait
		Thread.sleep(1000);
	 
		//Enter Password
		String Pass=Sh.getRow(1).getCell(0).getStringCellValue(); //U1YP1G
		Login.enterPassword(Pass);  //U1YP1G
			 
		//wait
		Thread.sleep(1000);
			 
		//Click Login Button
		Login.clickloginbutton();
			 
		//Create Object of POM Class-II	 
		Adactin_HomePage Hompage=new Adactin_HomePage(driver);
			 
		//wait
		Thread.sleep(1000);
			 
		//Verify Username
		String ExpectedUsername=Sh.getRow(0).getCell(2).getStringCellValue();  //Velocity!
		Hompage.getUsername(ExpectedUsername); //Velocity!	 
			 
		//wait
		Thread.sleep(1000);
 
		//Click Logout Button
		Hompage.clicklogoutbutton();
 
		//wait
		Thread.sleep(2000);
		 
		driver.quit();	 
	}
}
