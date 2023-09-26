package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Column_Data 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		Sheet CD = WorkbookFactory.create(File).getSheet("Sheet7");
		
		int LastRowIndex = CD.getLastRowNum();
		System.out.println(LastRowIndex);        			//11
		
		for(int i=0; i<=LastRowIndex;  i++)
		{
			String Column_Data = CD.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(Column_Data + " ");
		}
	}
}
