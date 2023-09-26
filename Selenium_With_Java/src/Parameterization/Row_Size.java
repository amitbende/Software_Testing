package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Size 
{
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\HP\\Desktop\\SDET\\Parameterization\\Demo.xlsx");
		
		int RowSize=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum()+1;  //10
		
		System.out.println(RowSize);      //10
	}
}
