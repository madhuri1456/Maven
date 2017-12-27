package testCases;

import org.junit.Test;

import wrapers.GenricWrapper;
import wrapers.ProjectSpecificWrapper;

public class TC001_Login  extends ProjectSpecificWrapper {

	@Test
	public void login1(){
		invokeApp( "chrome","http://leaftaps.com/opentaps/control/main");
		enterById("username" ,"DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByClassName("decorativeSubmit");





	}
}
