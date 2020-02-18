package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingScrollDown extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

BaseClass b=new BaseClass();
b.commonCheez("chrome","https://www.seleniumhq.org/download/");
WebElement dart = driver.findElement(By.xpath("//a[.='Dart']"));
int xAxis=dart.getLocation().getX();
int yAxis=dart.getLocation().getY();
System.out.println("xAxis is:" +xAxis);
System.out.println("yAxis is:" +yAxis);

JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy("+ xAxis +","+ yAxis +")");
Thread.sleep(2000);
WebElement codoid = driver.findElement(By.xpath("//a[.='Codoid']"));
codoid.click();
	}

}
