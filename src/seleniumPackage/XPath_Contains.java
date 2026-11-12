package seleniumPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Contains {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		WebElement emailid=driver.findElement(By.xpath("//*[contains(@name,\"login\")]"));
		emailid.sendKeys("malavika");
		
		Thread.sleep(2000);
		WebElement fullname=driver.findElement(By.xpath("//*[contains(@name,\"name\") and @placeholder=\"Enter your full name\"]"));	//here the 'and @placeholder=\"Enter your full name\"' is given to find out the exact element is the rest is not locating a single element. 
		fullname.sendKeys("Malavika");
	}
	

}
