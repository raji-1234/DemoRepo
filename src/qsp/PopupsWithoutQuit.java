package qsp;

import java.util.Set;

public class PopupsWithoutQuit  extends BaseClass{
public static void main(String[] args) throws InterruptedException
{
	BaseClass b=new BaseClass();
	b.commonCheez("chrome", "https://www.naukri.com/");
	Thread.sleep(2000);
	Set<String> allwhs = driver.getWindowHandles();
	int noofbrowsers = allwhs.size();
	System.out.println(noofbrowsers);
	for(String wh:allwhs)
	{
		driver.switchTo().window(wh).close();
		Thread.sleep(2000);
	}
}
}
