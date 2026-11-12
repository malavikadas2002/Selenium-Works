package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPgm {
	
ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void screenshotmthd() throws Exception
	{
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	//casting the driver object to the TakeScreenshot interface to take screenshot.
		FileHandler.copy(s, new File("C:\\Users\\kkabh\\OneDrive\\Desktop\\SELENIUM WORKS\\Screenshots\\Screenshot.png"));
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		File logoscreenshot = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(logoscreenshot, new File("C:\\Users\\kkabh\\OneDrive\\Desktop\\SELENIUM WORKS\\Screenshots\\redifflogo.png"));
	}
	

}
