package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations 
{
	@BeforeSuite
	public void a()
	{
		Reporter.log("BeforeSuite", true);
	}
	@AfterSuite
	public void b()
	{
		Reporter.log("AfterSuite", true);
	}
	@BeforeTest
	public void c()
	{
		Reporter.log("BeforeTest", true);
	}
	@AfterTest
	public void d()
	{
		Reporter.log("AfterTest", true);
	}
	@BeforeClass
	public void e()
	{
		Reporter.log("BeforeClass", true);
	}
	@AfterClass
	public void f()
	{
		Reporter.log("AfterClass", true);
	}
	@BeforeMethod
	public void g()
	{
		Reporter.log("BeforeMethod", true);
	}
	@AfterMethod
	public void h()
	{
		Reporter.log("AfterMethod", true);
	}
}
