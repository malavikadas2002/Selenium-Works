package testNGpackage;

import org.testng.annotations.Test;

public class DependsOnMethods_pgm 
{
	@Test
	public void reg()
	{
		System.out.println("Registration Method");
	}
	
	@Test (dependsOnMethods = "reg")	//dependsOnMethods- it only allows the execution of this method depends on the reg method
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test (dependsOnMethods = {"reg","login"})
	public void home()
	{
		System.out.println("Home Method");	
	}

}
