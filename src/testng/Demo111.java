package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo111 {
	@Test(priority=3)
public void moon()
{
	Reporter.log("admin", true);
}
	
	@Test
	public void run()
	{
		Reporter.log("I am run() of Demo111 class", true);
	}
	
	@Test
	public void bun()
	{
		Reporter.log("I am bun() of Demo111 class", true);
	}
	@Test(priority=1)
	public void gun()
	{
		Reporter.log("I am gun() of Demo111 class", true);
	}
	
}
//priority=1, invocationCount=10