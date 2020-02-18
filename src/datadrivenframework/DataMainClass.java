package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataMainClass 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data1/input.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("sheet1");
	Row r = sh.getRow(3);
	Cell c = r.getCell(1);
	String val = c.getStringCellValue();
	
	System.out.println(val);
}
}
