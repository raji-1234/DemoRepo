package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnTest2 extends Annotations
{
	@Test
	public void gun()
	{
		Reporter.log("i am gun test method", true);
	}
	
}
