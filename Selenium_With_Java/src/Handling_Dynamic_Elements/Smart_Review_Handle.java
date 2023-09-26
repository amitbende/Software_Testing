package Handling_Dynamic_Elements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Smart_Review_Handle 
{
	//How to handle Dynamic Element
		public static void main(String[] args) throws InterruptedException, IOException 
		{		
			ChromeOptions CO=new ChromeOptions();	
			CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
			WebDriver  driver=new ChromeDriver(CO); 
			
			driver.manage().window().maximize();
			 		 
			//To enter URL/Open an Application		 
			driver.get("https://www.flipkart.com/mobiles/~cs-81hziz7kkm/pr?sid=tyy%2C4io&collection-tab-name=iPhone+14+and+14+Plus&param=17326&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJpbmNsIG9mIG9mZmVycyJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIklwaG9uZSAxNC8xNHBsdXMiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19LCJoZXJvUGlkIjp7InNpbmdsZVZhbHVlQXR0cmlidXRlIjp7ImtleSI6Imhlcm9QaWQiLCJpbmZlcmVuY2VUeXBlIjoiUElEIiwidmFsdWUiOiJNT0JHSFdGSFVZV0dCNUYyIiwidmFsdWVUeXBlIjoiU0lOR0xFX1ZBTFVFRCJ9fX19fQ%3D%3D&fm=neo%2Fmerchandising&iid=M_a743548d-8bcb-4388-945a-5fd87ace1f9a_1.RBK8YP30BKBH&ppt=hp&ppn=homepage&ssid=uvb3wx6g1s0000001691814443222&otracker=dynamic_omu_infinite_Top%2BOffers_2_1.dealCard.OMU_INFINITE_RBK8YP30BKBH&cid=RBK8YP30BKBH");
			
			//To get Rating
			String S1=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
			System.out.println(S1);
			
			driver.quit();
		}
}
