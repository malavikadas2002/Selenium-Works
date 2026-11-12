package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframe_handling {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginmthd()
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys("malavikadas2002@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("Malavikaabhi");
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@Test
	public void propertymthd()
	{
		WebElement addproperty = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		addproperty.click();
		
		//the summary box coming under the iframe so we need to switch to the iframe to handle the summary box
		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frametag);
		
		WebElement summary = driver.findElement(By.xpath("/html/body"));
		summary.click();
		summary.sendKeys("abcd");
		
		driver.switchTo().defaultContent();
	}

}
