package qsp;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public void commonCheez(String browser,String url)
	
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			String key="webdriver.chrome.driver";
			String value="D:\\SCSA2\\Automation\\drivers\\chromedriver.exe";
			System.setProperty(key, value);
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			String key="webdriver.gecko.driver";
			String value="D:\\SCSA2\\Automation\\drivers\\geckodriver.exe";
			System.setProperty(key, value);
			driver=new FirefoxDriver();
	}
		else
		{
			System.out.println("enter valid browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

}
