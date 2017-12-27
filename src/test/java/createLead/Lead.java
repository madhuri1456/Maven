package createLead;

import org.testng.annotations.Test;

import wrapers.GenricWrapper;
import wrapers.ProjectSpecificWrapper;

public class Lead extends ProjectSpecificWrapper{
	

	
	
	
	@Test(  invocationCount=1,invocationTimeOut=200000)
	public void createLead() throws Exception{
	//login();
	clickByLink("Leads");
	clickByLink("Create Lead");
	enterById("createLeadForm_companyName","Qeagle");
	enterById("createLeadForm_firstName", "Gopinath");
	enterById("createLeadForm_lastName", "Jayakumar");	
	enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
	enterById("createLeadForm_primaryPhoneNumber", "9597704568");
	clickByName("submitButton");

}
}
