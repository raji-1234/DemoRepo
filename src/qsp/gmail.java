package qsp;

import org.openqa.selenium.By;

public class gmail extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		BaseClass b=new BaseClass();
		b.commonCheez("firefox", "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("rajeshwari.404");
		//driver.findElement(By.id("profileIdentifier")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("2blcsraju$");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		//driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		
		
	}
	

}
