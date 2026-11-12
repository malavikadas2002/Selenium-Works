package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_Pgm {
	
	@BeforeClass (alwaysRun = true)	// 'alwaysRun = true' to run the all other methods other than test methods when grouping is done.
	public void BfClass_Mthd()
	{
		System.out.println("Before Class Method");
	}
	
	@Test (priority = 1, groups = "Smoke")	// groups = smoke, given a group name for grouping
	public void TS_mthd_one()
	{
		System.out.println("Test Method 1.....");
	}
	
	@Test (priority = 2, groups = "Sanity")
	public void TS_mthd_two()
	{
		System.out.println("Test Method 2.....");
	}
	
	@Test (priority = 3, groups = {"Regression", "Smoke"})
	public void TS_mthd_three()
	{
		System.out.println("Test Method 3........");
	}
	
	@AfterClass (alwaysRun = true)
	public void AFClass_method()
	{
		System.out.println("After Class Method.....");
	}

}
