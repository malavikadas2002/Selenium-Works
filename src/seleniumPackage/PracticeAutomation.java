package seleniumPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomation {

	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver =new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();	//to maximize the window 
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("The title of the web page is "+actualtitle);
	}
	
	
	@Test
	public void login()
	{
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("abcde");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("1234");
		
		WebElement loginbutton=driver.findElement(By.id("submit"));
		loginbutton.click();
		
		System.out.println("Login Successfully");
	}
	
	@AfterEach
	public void close()
	{
		driver.quit();
	}

}
