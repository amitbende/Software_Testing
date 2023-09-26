package File_Upload_Download;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Upload 
{
	public static void main(String args[]) throws AWTException, InterruptedException
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(CO); 
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
			
		driver.manage().window().maximize();
		 	
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		 
		//Click "Select Pdf file"
		driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
		
		//Step-I: Copy PDF file(Ctrl + C)/Copy to Clipboard
		StringSelection S1=new StringSelection("C:\\Users\\HP\\Desktop\\SDET\\Automation Testing\\Java\\Logical Programs.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S1, null);
		
		//Step-II: Press "Control" Key + Press "V" key
		Robot R1=new Robot();
		R1.delay(2000);
		
		// Press "Ctrl" Key + Press "V" key
	    R1.keyPress(KeyEvent.VK_CONTROL);
	    R1.keyPress(KeyEvent.VK_V);
	    
	    //Release "Control" Key and "V" key
	    R1.keyRelease(KeyEvent.VK_CONTROL);
	    R1.keyRelease(KeyEvent.VK_V);
	     
	    //Step-III: Press "ENTER" key
	    R1.keyPress(KeyEvent.VK_ENTER);
	    R1.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//button[@id='processTask']")).click();
	    
	    Thread.sleep(3000);
	    
	    //driver.quit();
	}
}
