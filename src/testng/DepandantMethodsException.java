package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DepandantMethodsException 
{
	@Test
	public void register1()
	{
		Assert.fail();
		Reporter.log("Successfully registered1", true);

	}

	@Test
	public void register2()
	{
		//Assert.fail();
		Reporter.log("Successfully registered2", true);

	}

	@Test(dependsOnMethods= "register2")
	public void delete()
	{
		//Assert.fail();
		Reporter.log("Successfully deleted", true);

	}
}
