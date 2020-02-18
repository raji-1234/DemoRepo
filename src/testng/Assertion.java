package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-f10tqdq:8080/login.do");
		String loginTitle=driver.getTitle();
		//Assert.assertEquals(loginTitle, "actiTIME - Login");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(loginTitle, "actiTIME - Logi");
		sa.assertAll();
		driver.findElement(By.name("username")).sendKeys("admin");
	}
}
