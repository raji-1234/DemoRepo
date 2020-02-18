package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

	
public class HandlingDisabled extends BaseClass {
public static void main(String[] args) throws InterruptedException
{
	BaseClass b=new BaseClass();
	b.commonCheez("chrome","D:\\SCSA2\\Automation\\Untitled1.html");
	driver.findElement(By.id("i1")).sendKeys("admin");
	Thread.sleep(3000);
	
	//through downcasting
//	RemoteWebDriver rwd=(RemoteWebDriver)driver;
//	rwd.executeScript("document.getElementById('i2').value='manager'");
	
	//through typecasting
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("document.getElementById('i2').value='manager'");
//driver.close();
	}

}
