package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class qspider extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b=new BaseClass();
		b.commonCheez("chrome","https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ddadd = driver.findElement(By.name("q"));
	ddadd.sendKeys("qspider");
	Thread.sleep(3000);
	
	List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='sbl1']"));
	System.out.println(allOptions.size());
	for(int i=0;i<allOptions.size();i++)
	{
		String text = allOptions.get(i).getText();
		System.out.println(text);
		if(text.contains("btm"))
		{
			System.out.println(text);
			allOptions.get(i).click();
			break;
}
	}
		
	
	}
	

}
