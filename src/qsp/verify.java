package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="D:\\SCSA2\\Automation\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//enter thr url
		//driver.get("http://desktop-f10tqdq:8080/login.do");
		driver.get("http://desktop-f10tqdq:8080/login.do");
		String loginTitle=driver.getTitle();
		System.out.println(loginTitle);
		if(loginTitle.equals("actiTIME - Login"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");	
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
				//driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		//input[@name='pwd']
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		String homeTitle=driver.getTitle();
		System.out.println(homeTitle);
		if(homeTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");	
		}
	}
	
	

}
