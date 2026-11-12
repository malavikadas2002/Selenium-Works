package pom_test_package;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_base_package.Base_class;
import pom_page_package.Login_page;

public class Login_test extends Base_class 	//here we inheriting base class to get the information from the base class
{
	Login_page obj;
	
	@BeforeMethod
	public void objectmthd()
	{
		obj = new Login_page(driver);
	}
	
	@Test
	public void logintest_mthd()
	{
		obj.setvalues();
		obj.loginmthd();
				
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titleverification_mthd());
	}
	

}
