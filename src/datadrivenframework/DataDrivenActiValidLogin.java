package datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import qsp.BaseClass;

public class DataDrivenActiValidLogin extends BaseClass {
	public static void main(String[] args) throws Throwable
	{
		String excelpath="./data1/input.xlsx";
		BaseClass b=new BaseClass();
		b.commonCheez("chrome", "http://desktop-f10tqdq:8080/login.do");

		GenericDataDriven gd=new GenericDataDriven();

		int rowCount=gd.getRowCount(excelpath, "Sheet2");
		for(int i=1;i<=rowCount;i++)
		{
			String username=gd.getCellData(excelpath, "sheet2",i,0);
			String password=gd.getCellData(excelpath, "sheet2",i,1);
			System.out.println(username +"  "+ password);
			driver.findElement(By.name("username")).sendKeys(username);
		//	driver.clear();
	
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			String errormsg=driver.findElement(By.className("errormsg")).getText();
			if(errormsg.contains("invalid"))
			{
				gd.setCellData(excelpath, "sheet2", i, 2, "pass");
			}
			else
			{
				gd.setCellData(excelpath, "sheet2", i, 2, "fail");
			}
		}
	}
}
