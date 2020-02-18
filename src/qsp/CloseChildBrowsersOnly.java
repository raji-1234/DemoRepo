package qsp;



import java.util.Set;
public class CloseChildBrowsersOnly extends BaseClass{
public static void main(String[] args) throws InterruptedException
{
	BaseClass b=new BaseClass();
	b.commonCheez("chrome", "https://www.naukri.com/");
	Thread.sleep(2000);
	String parentTitle =driver.getTitle();
	Set<String> allwhs = driver.getWindowHandles();
	//int noofbrowsers = allwhs.size();
	//System.out.println(noofbrowsers);
	for(String wh:allwhs)
	{
		String title = driver.switchTo().window(wh).getTitle();
if(!title.equals(parentTitle))
{
	driver.close();
}
	}
}
}
