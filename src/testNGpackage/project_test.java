package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_test {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void reg() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		
		Thread.sleep(2000);
		WebElement reg= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		reg.click();
//		WebElement name= driver.findElement(By.xpath("//*[@id=\"uname\"]"));
//		name.sendKeys("Malavika T");
//		WebElement email= driver.findElement(By.xpath("//*[@id=\"ruemail\"]"));
//		email.sendKeys("abcd");
//		
		
	}

}
