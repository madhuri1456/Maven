package annotations;

import org.testng.annotations.Test;

public class DepensOn {
	
		@Test
		public void createContact()

		{

		System.out.println("cntact created");
		throw new RuntimeException();
		}

		@Test(dependsOnMethods = { "createContact" })
		public void editContact() {
		System.out.println("editContact");
		}

		@Test
		public void mergeContact() {
		System.out.println("mergeContact");
		}

		@Test(dependsOnMethods = { "createContact", "editContact" })
		public void deleteContact() {
		System.out.println("deleteContact");
		}

		}



