package qsp;

import org.openqa.selenium.By;

public class HiddenDivisionPopups extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b=new BaseClass();
		b.commonCheez("chrome", "https://www.cleartrip.com/");
driver.findElement(By.id("DepartDate")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//a[.='25']/ancestor::td [@data-month='10']")).click();
	}

}
