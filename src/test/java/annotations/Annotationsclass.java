package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationsclass {
	@BeforeSuite
	public void test1(){
		System.out.println("These is ");

}
	@BeforeTest
	public void test2(){
		System.out.println("These is ");
}
	@BeforeMethod
	public void test3(){
		System.out.println("These is ");
		
	}
	@BeforeClass
	public void test9(){
		System.out.println("These is  ");
	}
		
		@AfterMethod
		public void test4(){
			System.out.println("These is ");
		}

		@AfterClass
		public void test5(){
			System.out.println("These is ");
		}
@AfterTest
public void test6(){
	System.out.println("These is ");
}
@AfterSuite
public void test7(){
	System.out.println("These is ");
}

@Test
public void test8(){
	System.out.println("These is ");
}
}











