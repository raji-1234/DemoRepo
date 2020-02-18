package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataParameterisation 
{
	@DataProvider(name="DataBank1")
	public Object[][] Credentials1()
	{
		Object[][] obj1=new Object[2][2];
		obj1[0][0]="admin1";
		obj1[0][1]="manager1";
		obj1[1][0]="admin2";
		obj1[1][1]="manager2";
		return obj1;
		
	}
	@DataProvider(name="DataBank2")
	public Object[][] Credentials2()
	{
		Object[][] obj2=new Object[2][2];
		obj2[0][0]="admin007";
		obj2[0][1]="manager007";
		obj2[1][0]="admin700";
		obj2[1][1]="manager700";
		return obj2;
		
	}
	@Test(dataProvider="DataBank1")
	public void getCredentials(String un, String pwd)
	{
		Reporter.log(un+""+pwd, true);
	}
}
