package methoddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-f10tqdq:8080/login.do");
		WebElement untb=driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		untb.sendKeys("admin");
	}
}
