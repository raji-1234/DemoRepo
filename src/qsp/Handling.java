package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handling extends BaseClass
{
	public static void main(String[] args) throws InterruptedException
	{
		BaseClass b=new BaseClass();
		b.commonCheez("chrome","D:\\SCSA2\\Automation\\hotel.html");
	
		 WebElement ddaddr=driver.findElement(By.id("taj"));
		 Select sel=new Select(ddaddr);
		 List<WebElement> allOptions = sel.getOptions();
		 Set<String>s=new HashSet<>();
		//Set<String>s=new LinkedHashSet<>();
		 //Set<String>s=new TreeSet<>();
		 for(int i=0;i<allOptions.size();i++)
		 {
			String text = allOptions .get(i).getText();
		//System.out.println(text);
			s.add(text);
		 }
		 for(String str:s)
		 {
			System.out.println(str);
		 }
	
	}
}
