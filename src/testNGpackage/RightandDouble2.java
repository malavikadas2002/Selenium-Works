package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightandDouble2 {
	
ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception
	{
		WebElement doublebutton = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act= new Actions(driver);
		act.doubleClick(doublebutton);
		
		Thread.sleep(2000);
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightclick);
		act.perform();
	}

}
