package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllExcelData 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet8");
		
		int LastRowIndex = Sh.getLastRowNum();                              //4
		//System.out.println("Last Row Index:" + LastRowIndex);
		
		for(int i=0; i<=LastRowIndex;  i++)
		{
			int LastColumnIndex = Sh.getRow(i).getLastCellNum()-1;          //5-1=4
			//System.out.println("Last Column/Cell Index:" + LastColumnIndex);
			
			for(int j=0; j<=LastColumnIndex; j++)
			{
				String Excel_Data = Sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(Excel_Data + " ");
			}
			System.out.println();
		}
	}
}
