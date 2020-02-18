package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericDataDriven {
	public String getCellData(String path,String sheet,int r,int c) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String cellval = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		return cellval;
		
	}
	
	public int getRowCount(String path,String Sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(Sheet).getLastRowNum();
		return rc;
		
	}
public void setCellData(String path,String sheet,int r,int c,String data) throws Throwable
{
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	wb.close();
}
}



