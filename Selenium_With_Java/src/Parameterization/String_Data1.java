package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_Data1 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		String string_data = WorkbookFactory.create(File).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(string_data);  //Arpit
	}
}
