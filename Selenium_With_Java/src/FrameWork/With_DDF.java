package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF 
{
	public static void main(String args[]) throws InterruptedException, EncryptedDocumentException, IOException
	{
		//Open Browser
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-erros");
		WebDriver driver = new ChromeDriver(CO);
		
		//Window Maximize
		driver.manage().window().maximize();
		
		//browser link on site
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		//wait
		Thread.sleep(2000);
		
		//To reach upto Excelsheet
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		//open Excelsheet and go to perticuler sheet
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet9");
		
		//Enter Username
		String UN = Sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(UN);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		
		//Enter PassWord
		String PW = Sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(PW);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);
		
		//Click On login Button
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Expected Username as usual to site
		String Expected_Username = Sh.getRow(0).getCell(2).getStringCellValue();
		System.out.println(Expected_Username);
		
		//Actual Username
		String Username = driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		
		//Arr[] = [Hello[0] Velocity[1]] //Split method of string convert text to list of array.
		String Arr[] = Username.split(" ");
		
		String A1 = Arr[0];
		System.out.println(A1);      			//Hello
		
		String Actual_Username = Arr[1];
		System.out.println(Actual_Username);   	//Velocity
		
		if(Expected_Username.equals(Actual_Username))
		{
			System.out.println("Test Case Pass!!");
		}
		else
		{
			System.out.println("Test Case Fail!!");
		}
	}
}
