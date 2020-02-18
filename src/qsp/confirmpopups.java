package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class confirmpopups extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	BaseClass b=new BaseClass();
	b.commonCheez("firefox", "file:///D:/SCSA2/Automation/love.html");
	driver.findElement(By.xpath("//button[.='I Love You']")).click();
	Thread.sleep(2000);
	Alert al= driver.switchTo().alert();
	System.out.println(al.getText());
	//al.accept();
	al.dismiss();
	
	
	}

}
