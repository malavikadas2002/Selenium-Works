package seleniumPackage;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_linkCount {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginpage()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Link Count = "+links.size());
		
		for(WebElement li : links)
		{
			System.out.println("Links :--- " +li.getAttribute("href")+"       "+li.getText());
		}
	}
	
	@AfterEach
	public void closingmthd()
	{
		driver.quit();
	}

}
