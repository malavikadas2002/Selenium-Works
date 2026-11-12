package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeTest
	public void BeforeTestmthd()
	{
		System.out.println("Before Test Method");
	}
	
	@BeforeClass
	public void BeforeClassmethod()
	{
		System.out.println("Before Class Method");
	}
	
	@BeforeMethod
	public void Method()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Testmethod_A()
	{
		System.out.println("Test Method A");
	}
	
	@Test
	public void Testmethod_X()
	{
		System.out.println("Test Method X");
	}
	
	@Test
	public void Testmethod_C()
	{
		System.out.println("Test Method C");
	}
	
	@AfterMethod
	public void Af_Method()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterClassMthd()
	{
		System.out.println("After Class Method");
	}
	
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("After Test Method");
	}
	
}
