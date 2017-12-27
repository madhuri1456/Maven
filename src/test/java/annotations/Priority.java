package annotations;

import org.testng.annotations.Test;
public class Priority{

	
	@Test(priority=1)
	public void ds1(){
	System.out.println("print first");

	}

	@Test(priority=2)
	public void ds2(){
	System.out.println("print first");

	}

	@Test(priority=2)
	public void ds3(){
	System.out.println("print first");

	}

	@Test
	public void ds4(){
	System.out.println("print first");

	}



}

