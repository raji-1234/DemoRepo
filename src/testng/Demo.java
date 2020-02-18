package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public void rum() {
		
		System.out.println("I am SOP SMS");
		Reporter.log("I am Reporter SMS");
		Reporter.log("I am Both Report and SMS", true);
		
	}
	

}
