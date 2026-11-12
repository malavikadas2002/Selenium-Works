package seleniumPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {

	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}

	@Test
	public void login()
	{
		WebElement username= driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("Malavika");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("1234");
		
		WebElement loginbtn =driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		loginbtn.click();
	}
	
	@AfterEach
	public void close()
	{
		driver.quit();
	}
}
