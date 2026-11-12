package testNGpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileupload_robot {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuploadmthd() throws Exception
	{
		WebElement uploadbtn = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		uploadbtn.click();
		fileUpload("C:\\Users\\kkabh\\OneDrive\\Desktop\\Corrected share holders list to Company secretary 2023.pdf");
	}

	private void fileUpload(String p) throws Exception 
	{
		//set/store the file path in to the clipboard
		
		StringSelection strobj = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);
		
		Robot rob = new Robot();
		rob.delay(3000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);	//VK - virtual key
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		rob.delay(2000);
		System.out.println("File Uploaded Successfully");
		
		}
	
//	@AfterTest
//	public void closingmthd()
//	{
//		driver.quit();
//	}

}
