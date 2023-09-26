package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Data
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		Sheet RD = WorkbookFactory.create(File).getSheet("Sheet7");
		
		int LastCellIndex = RD.getRow(0).getLastCellNum()-1;
		System.out.println(LastCellIndex); 					//15-1=14
		
		for(int i=0; i<=LastCellIndex;  i++)
		{
			String Row_Data = RD.getRow(0).getCell(i).getStringCellValue();
			System.out.print(Row_Data + " ");
		}
	}
}
