package qsp;

import java.util.Set;

public class SwitchParticularBrowsernClose  extends BaseClass{
public static void main(String[] args) throws InterruptedException
{
	BaseClass b=new BaseClass();
	b.commonCheez("chrome", "https://www.naukri.com/");
	Thread.sleep(2000);
	Set<String> allwhs = driver.getWindowHandles();
	//int noofbrowsers = allwhs.size();
	//System.out.println(noofbrowsers);
	for(String wh:allwhs)
	{
		String title=driver.switchTo().window(wh).getTitle();
		if(title.contains("Reliance"))
		{
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			break;
		}
		
	}
}
}

