package seleniumPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationXpath {
	
ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@Test
	public void loginpage()
	{
		WebElement username= driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("student");
		
		WebElement password= driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("Password123");
		
		WebElement submitbtn= driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		submitbtn.click();
		
		System.out.println("Submitted successfully");
	}
	
	@AfterEach
	public void close_mthd()
	{
		driver.quit();
	}


}
