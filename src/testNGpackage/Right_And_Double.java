package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Right_And_Double {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception
	{
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		act.contextClick(edit).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
	}
	

}
