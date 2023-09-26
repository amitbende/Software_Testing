package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Num_String 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		String Num_String = WorkbookFactory.create(File).getSheet("Sheet6").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Num_String);
	}
}
