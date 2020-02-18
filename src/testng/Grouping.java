package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping 
{
	@BeforeGroups()
	public void beforeGroups()
	{
		Reporter.log("i execute before groups", true);
	}
	@AfterGroups()
	public void afterGroups()
	{
		Reporter.log("i execute after groups", true);
	}
	
	@Test(groups="SmokeTest")
	public void createCust()
	{
		Reporter.log("SmokeTest", true);
	}
	
	@Test(groups="IntegrationTest")
	public void editCustAndVerify()
	{
		Reporter.log("IntegrationTest", true);
	}
	
	@Test(groups="SmokeTest")
	public void createProject()
	{
		Reporter.log("SmokeTest", true);
	}
	
	@Test(groups= {"IntegrationTest","RegressionTest"})
	public void  editProjectAndVerify()
	{
		Reporter.log("IntegrationTest and RegressionTest", true);
	}
	
	@Test(groups="FunctionalTest")
	public void verifyCustNameTB()
	{
		Reporter.log("FunctionalTest", true);
	}
	
	@Test(groups="FunctionalTest")
	public void verifyCustPhoneTB()
	{
		Reporter.log("FunctionalTest", true);
	}
	
}
