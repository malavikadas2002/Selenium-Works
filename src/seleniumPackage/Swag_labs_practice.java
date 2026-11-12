package seleniumPackage;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_labs_practice {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();;
	}
	
	@Test
	public void login() throws Exception
	{
		WebElement username = driver.findElement(By.xpath("//input[@placeholder =\"Username\"]"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.xpath("//input[@placeholder =\"Password\"]"));
		password.sendKeys("secret_sauce",Keys.ENTER);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Link Count = "+links.size());
		
		for(WebElement li : links)
		{
			System.out.println("Links :--"+"  "+li.getText()+"  "+li.getAttribute("href"));
		}
		
		System.out.println("Login Successfull");
	}
	
//	@AfterEach
//	public void closingmethod()
//	{
//		driver.quit();
//	}

}
