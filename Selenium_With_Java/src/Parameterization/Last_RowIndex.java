package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Last_RowIndex 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		int  LastRowIndex=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum();  //9
		System.out.println(LastRowIndex); 
		
		//int  FirstRowIndex=WorkbookFactory.create(File).getSheet("Sheet4").getFirstRowNum();  //0
		//System.out.println(FirstRowIndex);      //0
	}
}
