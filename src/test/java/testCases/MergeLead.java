package testCases;



import org.testng.annotations.Test;

import wrapers.GenricWrapper;
import wrapers.ProjectSpecificWrapper;

public class MergeLead extends ProjectSpecificWrapper {
	@Test

	public void mergeLead(){
		//login();
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("//img[@src='/images/fieldlookup.gif']");
		switchToWindowUsingIndex(1);
		enterByName("id","10171");
		clickByXpath("//button[@type='button']");
		clickByLinkWithNoSnap("10171");
		switchToWindowUsingIndex(0);
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[2]");
		switchToWindowUsingIndex(1);
		enterByName("id", "10178");
		clickByXpath("//button[@type='button']");
		clickByLinkWithNoSnap("10178");
		switchToWindowUsingIndex(0);
		clickByLinkWithOutSnot("Merge");
		acceptAlert();

	}
}
