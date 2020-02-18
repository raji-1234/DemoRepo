package methoddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiMainValidLogin 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-f10tqdq:8080/login.do");
		ActiPOM ap=new ActiPOM(driver);
		//driver.navigate().refresh();
		Thread.sleep(2000);
		ap.setUntb("admin");
		ap.setPwtb("manager");
		ap.clickloginbtn();
		Thread.sleep(2000);
		ap.getUntb().clear();
		ap.countAllLinks();
		ap.login("admin", "manager");
	}

}
