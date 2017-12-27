package createcontact;

import org.testng.annotations.Test;

import wrapers.ProjectSpecificWrapper;

public class Contact extends ProjectSpecificWrapper  {
	
	@Test
	public void  createContact() throws Exception {
		//login();
	clickByLink("Contacts");
	clickByLink("Create Contact");
	enterById("firstNameField", "Gopinath");
	enterById("lastNameField", "Jayakumar");
	clickByName("submitButton");
	}	
	

}

