package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload_sendKeys_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void seetup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileupload()
	{
		WebElement filebutton = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		filebutton.sendKeys("C:\\Users\\kkabh\\OneDrive\\Desktop\\Corrected share holders list to Company secretary 2023.pdf");
	}

}
