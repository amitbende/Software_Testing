package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_Data 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		 boolean  boolean_data=WorkbookFactory.create(File).getSheet("Sheet4").getRow(3).getCell(0).getBooleanCellValue(); 
		 
		 System.out.println(boolean_data);   //true
	}
}
