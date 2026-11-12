package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframe_Handling_hw {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void iframemthd() throws Exception
	{
		Thread.sleep(5000);
		WebElement iframe_obj = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/iframe[1]"));
		driver.switchTo().frame(iframe_obj);
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"nameInput\"]"));
		name.click();
		name.sendKeys("Malavika");
		
		driver.switchTo().defaultContent();
	}

}
