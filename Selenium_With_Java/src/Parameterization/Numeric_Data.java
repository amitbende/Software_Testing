package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric_Data 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		double numeric_data = WorkbookFactory.create(File).getSheet("Sheet3").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(numeric_data);
	}
}
