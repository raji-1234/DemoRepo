package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnTest1 extends Annotations
{
	@Test
	public void run()
	{
		Reporter.log("i am run test method", true);
	}
	
	@Test
	public void bun()
	{
		Reporter.log("i am bun test method", true);
	}
}
