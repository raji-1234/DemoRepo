package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void bun()
	{
		Reporter.log("i am bun() of Demo1 class", true);
	}

}
