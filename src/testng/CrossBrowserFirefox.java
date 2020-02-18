package testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserFirefox
{
	@Parameters("browser")
	@Test
	public void runFirefox(String browser)
	{
		Reporter.log(browser, true);
	}
}
    


