package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String key="webdriver.chrome.driver";
String value="D:\\SCSA2\\Automation\\drivers\\chromedriver.exe";
System.setProperty(key, value);
ChromeDriver driver=new ChromeDriver();
driver.close();

	}

}
