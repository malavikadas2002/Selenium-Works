package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeTest
	public void browsersetup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			System.out.println("Chrome Browser");
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			System.out.println("Edge Browser");
		}
		
		else
		{
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser");
		}
	}
	
	@Test
	public void mthd1() throws Exception
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Method 1");
	}
	
//	@AfterTest
//	public void closingmthd()
//	{
//		driver.quit();
//	}
}
