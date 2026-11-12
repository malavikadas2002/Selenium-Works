package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hard_Asseertion_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();;
	}
	
	@Test(priority = 1)
	public void titleverification()
	{
		String actual_title = driver.getTitle();
		//System.out.println("Actual title = "+actual_title);
		
		String expected_title = "Rediffmail Free Unlimited";
		Assert.assertEquals(expected_title, actual_title);
		System.out.println("Title verification Success");	// this line will execute only when the title matches.
	}
	
	@Test(priority = 2)
	public void urlverification()
	{
		String actual_url = driver.getCurrentUrl();	// to get the current url
		//System.out.println("Actual url = "+actual_url);
		
		String expected_url = "https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(expected_url, actual_url);
		System.out.println("Url verification completed");
	}

}
