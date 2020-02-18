package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo11 {
	@Test(priority=1, invocationCount=10)
public void moon()
{
	Reporter.log("admin", true);
}
	
	@Test(priority=2, enabled=true)
	public void run()
	{
		Reporter.log("I am run() of Demo11 class", true);
	}
	
	@Test(priority=2, enabled=true)
	public void bun()
	{
		Reporter.log("I am bun() of Demo11 class", true);
	}
	@Test(priority=3)
	public void gun()
	{
		Reporter.log("I am gun() of Demo11 class", true);
	}
	
}
