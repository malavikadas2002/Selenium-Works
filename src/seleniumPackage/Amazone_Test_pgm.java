package seleniumPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_Test_pgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception		//throws Exception comes if we give java wait
	{
		Thread.sleep(2000);	//java wait, it is used to wait for a time period, here it is 2 sec (2000 ms)
		WebElement searchbar=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//searchbar.sendKeys("Mobiles");
		searchbar.sendKeys("Mobiles",Keys.ENTER);	//to press the enter key after giving the value to search bar(Keys.ENTER)
		
		Thread.sleep(2000);
		WebElement electronics =driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		electronics.click();
		
		Thread.sleep(2000);
		WebElement cart =driver.findElement(By.xpath("//div[@id=\"nav-cart-text-container\"]"));
		cart.click();
			
	}

}
