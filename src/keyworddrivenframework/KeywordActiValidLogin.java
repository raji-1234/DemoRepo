package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordActiValidLogin implements IAutoConsts {
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String browserValue=GenericKeyword.getKeyPropValue(PROPERTY_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("enter correct browser");
		}
		driver.get(GenericKeyword.getKeyPropValue(PROPERTY_PATH, "url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(GenericKeyword.getKeyPropValue(PROPERTY_PATH, "username"));

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(GenericKeyword.getKeyPropValue(PROPERTY_PATH, "password"));
		//Thread.sleep(3000);

		driver.findElement(By.id("loginButton")).click();
	}
}
