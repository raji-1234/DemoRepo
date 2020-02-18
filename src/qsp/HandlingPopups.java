package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingPopups extends BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.commonCheez("chrome","https://www.monsterindia.com/");
		 driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		 WebElement btn = driver.findElement(By.id("file-upload"));
		
		 btn.sendKeys("C:\\Users\\sachi\\Desktop\\RCC\\abc.docx");
		 
	}

}
