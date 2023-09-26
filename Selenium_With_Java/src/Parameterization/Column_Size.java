package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Column_Size 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		int lastColumnIndex = WorkbookFactory.create(File).getSheet("Sheet5").getRow(0).getLastCellNum();
		
		System.out.print(lastColumnIndex);      //10
	}
}
