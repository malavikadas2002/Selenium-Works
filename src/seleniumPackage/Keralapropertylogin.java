package seleniumPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropertylogin {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver =new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();	//to maximize the window 
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("The title of the web page is "+actualtitle);
	}
	
	@Test
	public void textverification()
	{
		String sourcecode = driver.getPageSource();
		if (sourcecode.contains("User Login"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	
	@AfterEach
	public void close()
	{
		driver.quit();
	}
	

}
