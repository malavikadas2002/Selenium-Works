package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm 
{
	@BeforeClass
	public void BfClass_mthd()
	{
		System.out.println("Before Class Method");
	}
	
	@Test(priority = 1, invocationCount = 3)	//invocationCount = 3, the test method execute 3 times	
	public void Mthd_X()
	{
		System.out.println("Method X");
	}
	
	@Test (priority = 2, enabled = false)	//enabled = false, it helps to stop the working of the method
	public void Mthd_A() 
	{
		System.out.println("Method A");
	}
	
	@Test(priority = 3)	
	public void Mthd_F()
	{
		System.out.println("Method F");
	}
	
	@AfterClass
	public void AFClassMthd()
	{
		System.out.println("After Class Method");
	}

}
