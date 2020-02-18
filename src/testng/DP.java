package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DP 
{
@Test(dataProviderClass=DataParameterisation.class,dataProvider="DataBank2")
public void getCredentials(String un,String pwd)
{
	Reporter.log(un+""+pwd, true);
}
}
